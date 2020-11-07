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

public class ListaPapasAdapter extends BaseAdapter {

    private Context context;
    private List<ListaPapas> items;

    public ListaPapasAdapter(Context context, List<ListaPapas> items) {
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
            rowView = inflater.inflate(R.layout.lista_papas, parent, false);
        }

        // Set data into the view.
        ImageView ivItem7 = (ImageView) rowView.findViewById(R.id.ivItem7);
        TextView tvTitle7 = (TextView) rowView.findViewById(R.id.tvTitle7);
        TextView tvDescripcion7 = (TextView) rowView.findViewById(R.id.tvDescripcion7);
        ListaPapas item = this.items.get(position);
        tvTitle7.setText(item.getTitle7());
        tvDescripcion7.setText(item.getDescripcion7());
        ivItem7.setImageResource(item.getImage7());

        return rowView;
    }

}