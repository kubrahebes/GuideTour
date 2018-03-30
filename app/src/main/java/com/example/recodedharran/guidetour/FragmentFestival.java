package com.example.recodedharran.guidetour;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.recodedharran.guidetour.adapters.AdapterFestival;
import com.example.recodedharran.guidetour.models.ClassFestival;

import java.util.ArrayList;

/**
 * Created by Recodedharran on 1.12.2017.
 */

public class FragmentFestival extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_festival, container, false);
        ListView listView_festivaller = rootView.findViewById(R.id.festival_listview);
        ArrayList<ClassFestival> FestivalArrayList = new ArrayList<>();
        FestivalArrayList.add(new ClassFestival(R.drawable.ic_alacati_ucurtma_festivali1, R.drawable.ic_alacati_ucurtma_festivali2, R.drawable.ic_alacati_ucurtma_festivali3, R.string.ucurtma_festival1, R.string.ucurtma_festival2, R.string.ucurtma_festival3, R.string.fest1));
        FestivalArrayList.add(new ClassFestival(R.drawable.ic_alacati_ot_festivali, R.drawable.ic_alacati_ot_festivali2, R.drawable.ic_alacati_ot_festivali3, R.string.ot_festival1, R.string.ot_festivali2, R.string.ot_festivali3, R.string.fest2));
        FestivalArrayList.add(new ClassFestival(R.drawable.ic_alacati_sorf_festivali1, R.drawable.ic_alacati_sorf_festivali2, R.drawable.ic_alacati_sorf_festivali3, R.string.sorf_festival1, R.string.sorf_festival2, R.string.sorf_festival3, R.string.fest3));
        AdapterFestival adapterFestival = new AdapterFestival(getContext(), R.layout.activity_festival_class, FestivalArrayList);
        listView_festivaller.setAdapter(adapterFestival);
        return rootView;
    }
}
