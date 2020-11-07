package com.paez.edwin.brotherspizza;

/**
 * Created by PC on 10/12/2017.
 */


import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListaFugazzaAdapter extends BaseAdapter {

    private Context context;
    private List<ListaFugazza> items;

    public ListaFugazzaAdapter(Context context, List<ListaFugazza> items) {
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
            rowView = inflater.inflate(R.layout.lista_fugazza, parent, false);
        }

        // Set data into the view.
        ImageView ivItem4 = (ImageView) rowView.findViewById(R.id.ivItem4);
        TextView tvTitle4 = (TextView) rowView.findViewById(R.id.tvTitle4);
        TextView tvDescripcion4 = (TextView) rowView.findViewById(R.id.tvDescripcion4);
        ListaFugazza item = this.items.get(position);
        tvTitle4.setText(item.getTitle4());
        tvDescripcion4.setText(item.getDescripcion4());
        ivItem4.setImageResource(item.getImage4());

        return rowView;
    }

}