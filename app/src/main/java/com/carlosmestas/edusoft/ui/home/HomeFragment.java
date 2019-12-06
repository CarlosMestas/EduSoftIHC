package com.carlosmestas.edusoft.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Slide;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProviders;

import com.carlosmestas.edusoft.MainActivityNAV;
import com.carlosmestas.edusoft.MyAdapter;
import com.carlosmestas.edusoft.R;
import com.carlosmestas.edusoft.ui.slideshow.SlideshowFragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    private ListView listview;
    private ArrayList<String> names;
    private ArrayList<Integer> images;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);


        listview = (ListView) root.findViewById(R.id.listview1);

        names = new ArrayList<String>();
        names.add(getResources().getString(R.string.c1));

        names.add(getResources().getString(R.string.c2));

        names.add(getResources().getString(R.string.c3));

        images = new ArrayList<Integer>();

        images.add(R.drawable.c1);
        images.add(R.drawable.c2);
        images.add(R.drawable.c3);


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