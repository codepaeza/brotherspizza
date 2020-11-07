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

public class ListaCarnesAdapter extends BaseAdapter {

    private Context context;
    private List<ListaCarnes> items;

    public ListaCarnesAdapter(Context context, List<ListaCarnes> items) {
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
            rowView = inflater.inflate(R.layout.lista_carnes, parent, false);
        }

        // Set data into the view.
        ImageView ivItem9 = (ImageView) rowView.findViewById(R.id.ivItem9);
        TextView tvTitle9 = (TextView) rowView.findViewById(R.id.tvTitle9);
        TextView tvDescripcion9 = (TextView) rowView.findViewById(R.id.tvDescripcion9);
        ListaCarnes item = this.items.get(position);
        tvTitle9.setText(item.getTitle9());
        tvDescripcion9.setText(item.getDescripcion9());
        ivItem9.setImageResource(item.getImage9());

        return rowView;
    }

}