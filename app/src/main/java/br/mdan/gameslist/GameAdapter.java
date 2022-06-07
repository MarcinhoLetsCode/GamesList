package br.mdan.gameslist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GameAdapter extends BaseAdapter {

    GameContent lista = new GameContent();

    Context applicationContext;
    String[] listaNome;
    int[] listaFoto;
    LayoutInflater inflater;

    public GameAdapter(Context applicationContext, String[] listaNome, int[] listaFoto) {
        this.applicationContext = applicationContext;
        this.listaNome = listaNome;
        this.listaFoto = listaFoto;
        inflater = (LayoutInflater.from(applicationContext));
        //LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //LayoutInflater inflater = getLayoutInflater();
        //LayoutInflater inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return listaFoto.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //convertView = LayoutInflater.from(applicationContext).inflate(R.layout.game_card_layout, null);
        convertView = inflater.inflate(R.layout.game_card_layout, null);

        //ImageView imageGame = (ImageView) convertView.findViewById(R.id.ivGame);
        ImageView imageGame = convertView.findViewById(R.id.ivGame);
        //TextView textGame = (TextView) convertView.findViewById(R.id.tvGame);
        TextView textGame = convertView.findViewById(R.id.tvGame);

        imageGame.setImageResource(lista.listaFoto[position]);
        //imageGame.setImageResource(listaFoto[position]);
        textGame.setText(lista.listaNome[position]);
        return convertView;

    }
}