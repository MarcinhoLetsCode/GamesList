package br.mdan.gameslist;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adapter extends BaseAdapter {

//    String [] nomeJogo = new String[] {"Super Mario World", "Donkey Kong Country 2"};
//
//    int [] fotoJogo =  new int [] {R.drawable.smw, R.drawable.dkctwo, };

    @Override
    public int getCount() {
        //list.length;
        return 0;
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

//        ImageView imageGame = view.findViewById(R.id.ivGame);
//        TextView textGame = view.findViewById(R.id.tvGame);
//
//        imageGame.setImageResource(fotoJogo[position]);
//        textGame.setText(nomeJogo[position]);
//
        return convertView;
    }
}
