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
import com.example.recodedharran.guidetour.models.ClassRestaurant;

import java.util.List;

/**
 * Created by Recodedharran on 2.12.2017.
 */

public class AdapterRestaurant extends ArrayAdapter<ClassRestaurant> {
    public AdapterRestaurant(@NonNull Context context, int resource, @NonNull List<ClassRestaurant> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.activity_restourant_class, null);
            ClassRestaurant obje = getItem(position);
            ImageView image = v.findViewById(R.id.restaurant_image);
            TextView txtname = v.findViewById(R.id.restaorant_name);
            TextView txtadress = v.findViewById(R.id.restaurant_adress);

            image.setImageResource(obje.getRes_res());
            txtname.setText(obje.getRes_name());
            txtadress.setText(obje.getRes_adress());

        }
        return v;
    }
}
