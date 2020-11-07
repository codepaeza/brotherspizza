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

public class ListaAlbondigasAdapter extends BaseAdapter {

    private Context context;
    private List<ListaAlbondigas> items;

    public ListaAlbondigasAdapter(Context context, List<ListaAlbondigas> items) {
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
            rowView = inflater.inflate(R.layout.lista_albondigas, parent, false);
        }

        // Set data into the view.
        ImageView ivItem10 = (ImageView) rowView.findViewById(R.id.ivItem10);
        TextView tvTitle10 = (TextView) rowView.findViewById(R.id.tvTitle10);
        TextView tvDescripcion10 = (TextView) rowView.findViewById(R.id.tvDescripcion10);
        ListaAlbondigas item = this.items.get(position);
        tvTitle10.setText(item.getTitle10());
        tvDescripcion10.setText(item.getDescripcion10());
        ivItem10.setImageResource(item.getImage10());

        return rowView;
    }

}