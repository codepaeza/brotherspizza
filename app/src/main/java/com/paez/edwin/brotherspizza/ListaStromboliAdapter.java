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

public class ListaStromboliAdapter extends BaseAdapter {

    private Context context;
    private List<ListaStromboli> items;

    public ListaStromboliAdapter(Context context, List<ListaStromboli> items) {
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
            rowView = inflater.inflate(R.layout.lista_stromboli, parent, false);
        }

        // Set data into the view.
        ImageView ivItem3 = (ImageView) rowView.findViewById(R.id.ivItem3);
        TextView tvTitle3 = (TextView) rowView.findViewById(R.id.tvTitle3);
        TextView tvDescripcion3 = (TextView) rowView.findViewById(R.id.tvDescripcion3);
        ListaStromboli item = this.items.get(position);
        tvTitle3.setText(item.getTitle3());
        tvDescripcion3.setText(item.getDescripcion3());
        ivItem3.setImageResource(item.getImage3());

        return rowView;
    }

}