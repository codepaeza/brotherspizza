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

public class ListaSandwichAdapter extends BaseAdapter {

    private Context context;
    private List<ListaSandwich> items;

    public ListaSandwichAdapter(Context context, List<ListaSandwich> items) {
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
            rowView = inflater.inflate(R.layout.lista_sandwich, parent, false);
        }

        // Set data into the view.
        ImageView ivItem8 = (ImageView) rowView.findViewById(R.id.ivItem8);
        TextView tvTitle8 = (TextView) rowView.findViewById(R.id.tvTitle8);
        TextView tvDescripcion8 = (TextView) rowView.findViewById(R.id.tvDescripcion8);
        ListaSandwich item = this.items.get(position);
        tvTitle8.setText(item.getTitle8());
        tvDescripcion8.setText(item.getDescripcion8());
        ivItem8.setImageResource(item.getImage8());

        return rowView;
    }

}