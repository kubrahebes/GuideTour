package com.example.recodedharran.guidetour.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.recodedharran.guidetour.R;
import com.example.recodedharran.guidetour.models.ClassHotel;

import java.util.List;

/**
 * Created by Recodedharran on 2.12.2017.
 */

public class AdapterHotel extends ArrayAdapter<ClassHotel> {
    public AdapterHotel(@NonNull Context context, int resource, @NonNull List<ClassHotel> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.activity_hotel_class, null);
            ClassHotel obje = getItem(position);
            ImageView image_hotel = v.findViewById(R.id.image);
            image_hotel.setImageResource(obje.getImage());
            TextView name_hotel = v.findViewById(R.id.txt_hotel_name);
            name_hotel.setText(obje.getName());
            ImageView stars = v.findViewById(R.id.stars);
            stars.setImageResource(obje.getStars());
        }
        return v;
    }
}
