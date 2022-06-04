package br.mdan.gameslist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int[] listaFoto = {R.drawable.dkctwo, R.drawable.smw, R.drawable.tg};
    String[] listaNome = {"Donkey Kong Country 2", "Super Mario World", "Top Gear"};
    ListView listGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        listGame = findViewById(R.id.lvGame);
        //GamesAdapter adapter = new GamesAdapter();
        GamesAdapter adapter = new GamesAdapter(getApplicationContext(), listaNome, listaFoto);
        listGame.setAdapter(adapter);

        listGame.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //Intent intent = new Intent(getApplicationContext(), GamesDetail.class);
                Intent intent = new Intent(MainActivity.this, GamesDetail.class);
                MainActivity.this.startActivity(intent);

                intent.putExtra("foto_jogo", adapter.listaFoto[position]);
                intent.putExtra("nome_jogo", adapter.listaNome[position]);

                startActivity(intent);
            }
        });
    }

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