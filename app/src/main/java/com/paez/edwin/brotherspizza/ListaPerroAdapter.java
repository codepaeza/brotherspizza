package com.paez.edwin.brotherspizza;

/**
 * Created by PC on 15/12/2017.
 */


import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListaPerroAdapter extends BaseAdapter {

    private Context context;
    private List<ListaPerro> items;

    public ListaPerroAdapter(Context context, List<ListaPerro> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return this.items.size();
    }

    @Override
    public Object getItem(int position) {
        return this.items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View rowView = convertView;

        if (convertView == null) {
            // Create a new view into the list.
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rowView = inflater.inflate(R.layout.lista_perro, parent, false);
        }

        // Set data into the view.
        ImageView ivItem12 = (ImageView) rowView.findViewById(R.id.ivItem12);
        TextView tvTitle12 = (TextView) rowView.findViewById(R.id.tvTitle12);
        TextView tvDescripcion12 = (TextView) rowView.findViewById(R.id.tvDescripcion12);
        ListaPerro item = this.items.get(position);
        tvTitle12.setText(item.getTitle12());
        tvDescripcion12.setText(item.getDescripcion12());
        ivItem12.setImageResource(item.getImage12());

        return rowView;
    }

}