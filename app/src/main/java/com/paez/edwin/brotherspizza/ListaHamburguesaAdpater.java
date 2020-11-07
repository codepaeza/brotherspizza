package com.paez.edwin.brotherspizza;

/**
 * Created by PC on 14/12/2017.
 */

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListaHamburguesaAdpater extends BaseAdapter {

    private Context context;
    private List<ListaHamburguesa> items;

    public ListaHamburguesaAdpater(Context context, List<ListaHamburguesa> items) {
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
            rowView = inflater.inflate(R.layout.lista_hamburguesa, parent, false);
        }

        // Set data into the view.
        ImageView ivItem6 = (ImageView) rowView.findViewById(R.id.ivItem6);
        TextView tvTitle6 = (TextView) rowView.findViewById(R.id.tvTitle6);
        TextView tvDescripcion6 = (TextView) rowView.findViewById(R.id.tvDescripcion6);
        ListaHamburguesa item = this.items.get(position);
        tvTitle6.setText(item.getTitle6());
        tvDescripcion6.setText(item.getDescripcion6());
        ivItem6.setImageResource(item.getImage6());

        return rowView;
    }

}