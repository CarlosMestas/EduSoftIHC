package com.carlosmestas.edusoft.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.carlosmestas.edusoft.MyAdapter;
import com.carlosmestas.edusoft.R;

import java.util.ArrayList;

public class SlideshowFragment extends Fragment {

    private SlideshowViewModel slideshowViewModel;


    private ListView listview;
    private ArrayList<String> names;
    private ArrayList<Integer> images;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        slideshowViewModel =
                ViewModelProviders.of(this).get(SlideshowViewModel.class);
        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);


        listview = (ListView) root.findViewById(R.id.lsitview3);

        names = new ArrayList<String>();
        names.add(getResources().getString(R.string.c5));

        names.add(getResources().getString(R.string.c6));

        names.add(getResources().getString(R.string.c7));

        images = new ArrayList<Integer>();

        images.add(R.drawable.cc1);
        images.add(R.drawable.cc2);
        images.add(R.drawable.cc3);

        MyAdapter myAdapter = new MyAdapter(getActivity(), R.layout.list_item, names,images);
        listview.setAdapter(myAdapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(getActivity(),  names.get(position), Toast.LENGTH_LONG).show();
            }
        });
        listview.setAdapter(myAdapter);
        return root;

    }
}