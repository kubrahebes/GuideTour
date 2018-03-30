package com.example.recodedharran.guidetour;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.recodedharran.guidetour.adapters.AdapterGaleri;
import com.example.recodedharran.guidetour.adapters.AdapterRestaurant;
import com.example.recodedharran.guidetour.models.ClassGaleri;
import com.example.recodedharran.guidetour.models.ClassRestaurant;

import java.util.ArrayList;

/**
 * Created by Recodedharran on 1.12.2017.
 */

public class FragmentRestorant extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_restorant, container, false);
        ListView listView = rootView.findViewById(R.id.restaurant_listview);
        ArrayList<ClassRestaurant> restaurants = new ArrayList<>();
        restaurants.add(new ClassRestaurant(R.drawable.ic_cesme_restoran, R.string.restaurant1, R.string.adress));
        restaurants.add(new ClassRestaurant(R.drawable.ic_imren_restorant, R.string.restaurant2, R.string.adress));
        restaurants.add(new ClassRestaurant(R.drawable.ic_marti_restorant, R.string.restaurant3, R.string.adress));
        restaurants.add(new ClassRestaurant(R.drawable.ic_wish_restaurant, R.string.restaurant4, R.string.adress));
        restaurants.add(new ClassRestaurant(R.drawable.ic_bizim_ev_restorant, R.string.restaurant2, R.string.adress));


        AdapterRestaurant adapterGaleri = new AdapterRestaurant(getContext(), R.layout.activity_restourant_class, restaurants);
        listView.setAdapter(adapterGaleri);

        return rootView;

    }
}
