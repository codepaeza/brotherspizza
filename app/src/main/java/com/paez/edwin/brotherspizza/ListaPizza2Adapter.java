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

public class ListaPizza2Adapter extends BaseAdapter {

    private Context context;
    private List<ListaPizza2> items;

    public ListaPizza2Adapter(Context context, List<ListaPizza2> items) {
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
            rowView = inflater.inflate(R.layout.lista_pizza2, parent, false);
        }

        // Set data into the view.
        ImageView ivItem2 = (ImageView) rowView.findViewById(R.id.ivItem2);
        TextView tvTitle2 = (TextView) rowView.findViewById(R.id.tvTitle2);
        TextView tvDescripcion2 = (TextView) rowView.findViewById(R.id.tvDescripcion2);
        ListaPizza2 item = this.items.get(position);
        tvTitle2.setText(item.getTitle2());
        tvDescripcion2.setText(item.getDescripcion2());
        ivItem2.setImageResource(item.getImage2());

        return rowView;
    }

}