package com.example.recodedharran.guidetour;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.recodedharran.guidetour.adapters.AdapterHotel;
import com.example.recodedharran.guidetour.models.ClassHotel;

import java.util.ArrayList;

/**
 * Created by Recodedharran on 1.12.2017.
 */

public class FragmentHotel extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_hotel, container, false);


        ListView listView_hotels = rootView.findViewById(R.id.hotel_listview);
        ArrayList<ClassHotel> hotelArrayList = new ArrayList<>();
        hotelArrayList.add(new ClassHotel(R.drawable.ic_antmare_hotel, "ANTMARE HOTEL", R.drawable.ic_five_stars));
        hotelArrayList.add(new ClassHotel(R.drawable.ic_asmalikonak_hotel, "ASMALI KONAK HOTEL", R.drawable.ic_one_stars));
        hotelArrayList.add(new ClassHotel(R.drawable.ic_cocopalm_hotel, "COCOPALM HOTEL", R.drawable.ic_two_stars));
        hotelArrayList.add(new ClassHotel(R.drawable.ic_cumbaki_hotel, "CUMBAKI HOTEL", R.drawable.ic_four_stars));
        hotelArrayList.add(new ClassHotel(R.drawable.ic_expendia_hotel, "EXPENDIA HOTEL", R.drawable.ic_one_stars));
        hotelArrayList.add(new ClassHotel(R.drawable.ic_viento_hotel, "VIENTO HOTEL", R.drawable.ic_two_stars));
        AdapterHotel adapterHotel = new AdapterHotel(getContext(), R.layout.activity_hotel_class, hotelArrayList);
        listView_hotels.setAdapter(adapterHotel);

        return rootView;
    }
}
