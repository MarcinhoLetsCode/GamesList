package br.mdan.gameslist;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class GameFragment extends Fragment {

    ListView listGame;
    FloatingActionButton add;

    private String[] listaNome;
    private int[] listaFoto;
    private String[] year;
    private String[] studio;

    public GameFragment(String[] listaNome, int[] listaFoto, String[] year, String[] studio) {

        this.listaNome = listaNome;
        this.listaFoto = listaFoto;
        this.year = year;
        this.studio = studio;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_game, container, false);

        listGame = view.findViewById(R.id.lvgame);
        add = view.findViewById(R.id.fabAdd);

        GameAdapter adapter = new GameAdapter(getContext(), listaNome, listaFoto);
        listGame.setAdapter(adapter);

        listGame.setOnItemClickListener((parent, view1, position, id) -> {

            Intent intent = new Intent(getContext(), GameDetail.class);

            intent.putExtra("foto_jogo", adapter.listaFoto[position]);
            intent.putExtra("nome_jogo", adapter.listaNome[position]);
            intent.putExtra("ano_jogo", year[position]);
            intent.putExtra("studio_jogo", studio[position]);

            GameFragment.this.startActivity(intent);
        });

        add.setOnClickListener(v -> startActivity(new Intent (getContext(), GameAdd.class)));

        return view;
    }

}