package br.mdan.gameslist;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class GamesDetail extends AppCompatActivity {

    ImageView recebeFoto;
    TextView recebeNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_detail);

        recebeFoto = findViewById(R.id.ivRecebeFoto);
        recebeNome = findViewById(R.id.tvRecebeNome);

        Intent intent = getIntent();

        int foto = intent.getIntExtra("foto_jogo", 0);
        String nome = intent.getStringExtra("nome_jogo");

        recebeFoto.setImageResource(foto);
        recebeNome.setText(nome);

        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

    }

}
