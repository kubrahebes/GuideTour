package com.example.recodedharran.guidetour;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.recodedharran.guidetour.adapters.AdapterGaleri;
import com.example.recodedharran.guidetour.models.ClassGaleri;

import java.util.ArrayList;

/**
 * Created by Recodedharran on 1.12.2017.
 */

public class FragmentGaleri extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_galeri, container, false);
        ListView listView = rootView.findViewById(R.id.listview_galeri);
        ArrayList<ClassGaleri> galeriArrayList = new ArrayList<>();
        galeriArrayList.add(new ClassGaleri(R.drawable.ic_alacati1, R.drawable.ic_alacati2));
        galeriArrayList.add(new ClassGaleri(R.drawable.ic_alacati3, R.drawable.ic_alacati4));
        galeriArrayList.add(new ClassGaleri(R.drawable.ic_alacati8, R.drawable.ic_alacati6));
        galeriArrayList.add(new ClassGaleri(R.drawable.ic_alacati10, R.drawable.ic_alacati5));
        galeriArrayList.add(new ClassGaleri(R.drawable.ic_alacati9, R.drawable.ic_alacati10));
        galeriArrayList.add(new ClassGaleri(R.drawable.ic_alacati3, R.drawable.ic_alacati4));

        AdapterGaleri adapterGaleri = new AdapterGaleri(getContext(), R.layout.activity_galeri_class, galeriArrayList);
        listView.setAdapter(adapterGaleri);

        return rootView;

    }
}
