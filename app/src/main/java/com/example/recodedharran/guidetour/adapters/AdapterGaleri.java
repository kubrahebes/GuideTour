package com.example.recodedharran.guidetour.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.example.recodedharran.guidetour.R;
import com.example.recodedharran.guidetour.models.ClassGaleri;

import java.util.List;

/**
 * Created by Recodedharran on 2.12.2017.
 */

public class AdapterGaleri extends ArrayAdapter<ClassGaleri> {
    public AdapterGaleri(@NonNull Context context, int resource, @NonNull List<ClassGaleri> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.activity_galeri_class, null);
            ClassGaleri obje = getItem(position);
            ImageView foto1 = v.findViewById(R.id.res1);
            ImageView foto2 = v.findViewById(R.id.res2);
            foto1.setImageResource(obje.getFoto1());
            foto2.setImageResource(obje.getFoto2());

        }
        return v;
    }
}
