package com.carlosmestas.edusoft.ui.gallery;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
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
import com.carlosmestas.edusoft.MyAdapter2;
import com.carlosmestas.edusoft.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class GalleryFragment extends Fragment {

    private GalleryViewModel galleryViewModel;

    private ListView listview;
    private ArrayList<String> names;

    private FloatingActionButton floatingActionButton;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                ViewModelProviders.of(this).get(GalleryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);

        listview = (ListView) root.findViewById(R.id.listiview2);

        names = new ArrayList<String>();

        names.add("Juanito Perez Casanova");

        names.add("Jose del Carpio");

        names.add("Mario Manito Malote");

        names.add("Juanito Perez Lipa");

        names.add("Juanito Perez Casanova");

        names.add("Jose del Carpio");

        names.add("Mario Manito Malote");

        names.add("Juanito Perez Lipa");

        names.add("Juanito Perez Casanova");

        names.add("Jose del Carpio");

        names.add("Mario Manito Malote");


        MyAdapter2 myAdapter = new MyAdapter2(getActivity(), R.layout.list_item, names);

        listview.setAdapter(myAdapter);
        
        floatingActionButton = root.findViewById(R.id.floatingActionButton);
        
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), getResources().getString(R.string.c4), Toast.LENGTH_SHORT).show();

                showDialog(getActivity());


            }
        });


        return root;
    }

    public void showDialog(Activity activity){
        final Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.popup);
        dialog.setTitle("Reporte");



        dialog.show();

    }
}