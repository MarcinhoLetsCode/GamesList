package br.mdan.gameslist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    GamesContent lista = new GamesContent();
//    int[] listaFoto = {R.drawable.dkctwo, R.drawable.smw, R.drawable.tg};
//    String[] listaNome = {"Donkey Kong Country 2", "Super Mario World", "Top Gear"};
//    String[] year = {"1995", "1990", "1992"};
//    String[] studio = {"Rare", "Nintendo", " Kemco"};
   ListView listGame;
   FloatingActionButton add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        add = findViewById(R.id.fabAdd);
        listGame = findViewById(R.id.lvGame);
        //GamesAdapter adapter = new GamesAdapter();
        GamesAdapter adapter = new GamesAdapter(getApplicationContext(), lista.listaNome, lista.listaFoto);
        listGame.setAdapter(adapter);

        listGame.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //Intent intent = new Intent(getApplicationContext(), GamesDetail.class);
                Intent intent = new Intent(MainActivity.this, GamesDetail.class);

                intent.putExtra("foto_jogo", adapter.listaFoto[position]);
                //intent.putExtra("foto_jogo", lista.listaFoto[position]);
                //intent.putExtra("foto_jogo", listaFoto[position]);
                //intent.putExtra("foto_jogo", adapter.listaFoto[position]);
                intent.putExtra("nome_jogo", adapter.listaNome[position]);
                intent.putExtra("ano_jogo", lista.year[position]);
                intent.putExtra("studio_jogo", lista.studio[position]);

//              startActivity(new Intent(this, MainActivity.class));
                MainActivity.this.startActivity(intent);
                //startActivity(intent);
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent (getApplicationContext(), GamesAdd.class));
            }
        });
    }

//    @Override
//    public void onBackPressed() {
////        startActivity(new Intent(this, MainActivity.class));
//        finish();
//    }

//    class GamesAdapter extends BaseAdapter {
//
//        @Override
//        public int getCount() {
//            return listaFoto.length;
//        }
//
//        @Override
//        public Object getItem(int position) {
//            return null;
//        }
//
//        @Override
//        public long getItemId(int position) {
//            return 0;
//        }
//
//        @Override
//        public View getView(int position, View convertView, ViewGroup parent) {
//
//            ImageView imageGame;
//            TextView textGame;
//
////            View view = getLayoutInflater().inflate(R.layout.games_card_layout, null);
//            View view = getLayoutInflater().inflate(R.layout.game_card_layout, parent, false);
//
//            imageGame = findViewById(R.id.ivGame);
//            textGame = findViewById(R.id.tvGame);
//
//            imageGame.setImageResource(listaFoto[position]);
//            textGame.setText(listaNome[position]);
//
//            return view;
//        }
//    }
}