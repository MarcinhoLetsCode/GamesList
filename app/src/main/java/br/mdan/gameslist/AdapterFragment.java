package br.mdan.gameslist;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class AdapterFragment extends FragmentStateAdapter {

    public AdapterFragment(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    public AdapterFragment(@NonNull Fragment fragment) {
        super(fragment);
    }

    public AdapterFragment(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        GameContent lista = new GameContent();
        switch (position) {
            case 0:
                return new GameFragment(lista.listaNomeSnes, lista.listaFotoSnes, lista.yearSnes, lista.studioSnes);
            case 1:
                return new GameFragment(lista.listaNomeGba, lista.listaFotoGba, lista.yearGba, lista.studioGba);
            case 2:
                return new GameFragment(lista.listaNomePSO, lista.listaFotoPSO, lista.yearPSO, lista.studioPSO);
            default:
                return new GameFragment(lista.listaNomeSnes, lista.listaFotoSnes, lista.yearSnes, lista.studioSnes);
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
