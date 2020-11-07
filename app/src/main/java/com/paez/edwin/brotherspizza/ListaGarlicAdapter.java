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

public class ListaGarlicAdapter extends BaseAdapter {

    private Context context;
    private List<ListaGarlic> items;

    public ListaGarlicAdapter(Context context, List<ListaGarlic> items) {
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
            rowView = inflater.inflate(R.layout.lista_garlic, parent, false);
        }

        // Set data into the view.
        ImageView ivItem5 = (ImageView) rowView.findViewById(R.id.ivItem5);
        TextView tvTitle5 = (TextView) rowView.findViewById(R.id.tvTitle5);
        TextView tvDescripcion5 = (TextView) rowView.findViewById(R.id.tvDescripcion5);
        ListaGarlic item = this.items.get(position);
        tvTitle5.setText(item.getTitle5());
        tvDescripcion5.setText(item.getDescripcion5());
        ivItem5.setImageResource(item.getImage5());

        return rowView;
    }

}