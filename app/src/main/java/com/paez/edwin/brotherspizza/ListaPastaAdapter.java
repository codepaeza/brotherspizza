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

public class ListaPastaAdapter extends BaseAdapter {

    private Context context;
    private List<ListaPasta> items;

    public ListaPastaAdapter(Context context, List<ListaPasta> items) {
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
            rowView = inflater.inflate(R.layout.lista_pasta, parent, false);
        }

        // Set data into the view.
        ImageView ivItem11 = (ImageView) rowView.findViewById(R.id.ivItem11);
        TextView tvTitle11 = (TextView) rowView.findViewById(R.id.tvTitle11);
        TextView tvDescripcion11 = (TextView) rowView.findViewById(R.id.tvDescripcion11);
        ListaPasta item = this.items.get(position);
        tvTitle11.setText(item.getTitle11());
        tvDescripcion11.setText(item.getDescripcion11());
        ivItem11.setImageResource(item.getImage11());

        return rowView;
    }

}