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
import com.example.recodedharran.guidetour.models.ClassFestival;

import java.util.List;

/**
 * Created by Recodedharran on 2.12.2017.
 */

public class AdapterFestival extends ArrayAdapter<ClassFestival> {
    public AdapterFestival(@NonNull Context context, int resource, @NonNull List<ClassFestival> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.activity_festival_class, null);
            ClassFestival obje = getItem(position);
            ImageView image1 = v.findViewById(R.id.image1);
            ImageView image2 = v.findViewById(R.id.image2);
            ImageView image3 = v.findViewById(R.id.image3);

            TextView textView1 = v.findViewById(R.id.text1);
            TextView textView2 = v.findViewById(R.id.text2);
            TextView textView3 = v.findViewById(R.id.text3);

            image1.setImageResource(obje.getImage1());
            image2.setImageResource(obje.getImage2());
            image3.setImageResource(obje.getImage3());

            textView1.setText(obje.getText1());
            textView2.setText(obje.getText2());
            textView3.setText(obje.getText3());
            TextView textViewname = v.findViewById(R.id.name);
            textViewname.setText(obje.getName());

        }
        return v;
    }
}
