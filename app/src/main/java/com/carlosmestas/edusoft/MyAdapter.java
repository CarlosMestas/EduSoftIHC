package com.carlosmestas.edusoft;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private ArrayList<String> names;
    private ArrayList<Integer> images;

    public MyAdapter(Context context, int layout, ArrayList<String> names,  ArrayList<Integer> images) {
        this.context = context;
        this.layout = layout;
        this.names = names;
        this.images = images;

    }

    @Override
    public int getCount() {
        return this.names.size();
    }

    @Override
    public Object getItem(int position) {
        return this.names.get(position);
    }

    @Override
    public long getItemId(int id) {
        return id;
    }

    @Override

    public View getView(int position, View convertView, ViewGroup viewGroup) {
// Copiamos la vista
        View v = convertView;

        //Inflamos la vista con nuestro propio layout
        LayoutInflater layoutInflater = LayoutInflater.from(this.context);

        v = layoutInflater.inflate(R.layout.list_item, null);
// Valor actual según la posición

        String currentName = names.get(position);
        Integer currentImage = images.get(position);

// Referenciamos el elemento a modificar y lo rellenamos
        TextView textView = (TextView) v.findViewById(R.id.textView2);
        textView.setText(currentName);

        ImageView imageView = v.findViewById(R.id.imageViewCO);
        imageView.setImageResource(currentImage);

        //Devolvemos la vista inflada
        return v;
    }
}