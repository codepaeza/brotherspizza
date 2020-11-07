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

public class ListaChileAdapter extends BaseAdapter {

    private Context context;
    private List<ListaChile> items;

    public ListaChileAdapter(Context context, List<ListaChile> items) {
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
            rowView = inflater.inflate(R.layout.lista_chile, parent, false);
        }

        // Set data into the view.
        ImageView ivItem13 = (ImageView) rowView.findViewById(R.id.ivItem13);
        TextView tvTitle13 = (TextView) rowView.findViewById(R.id.tvTitle13);
        TextView tvDescripcion13 = (TextView) rowView.findViewById(R.id.tvDescripcion13);
        ListaChile item = this.items.get(position);
        tvTitle13.setText(item.getTitle13());
        tvDescripcion13.setText(item.getDescripcion13());
        ivItem13.setImageResource(item.getImage13());

        return rowView;
    }

}