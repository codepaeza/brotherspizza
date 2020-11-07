package com.paez.edwin.brotherspizza;

/**
 * Created by PC on 15/12/2017.
 */


import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ListView;

public class ListaPerroActivity extends Activity {

    private ListView listView12;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Display a indeterminate progress bar on title bar
        requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);

        this.setContentView(R.layout.menu_perro);

        this.listView12 = (ListView) findViewById(R.id.listView12);


        List items = new ArrayList();

        items.add(new ListaPerro(R.drawable.perro, "Sencillo - Jamón, Queso, Papitas, Salsa al Gusto",
                "$6.000"));
        items.add(new ListaPerro(R.drawable.perro, "Especial - Cebolla, Champiñones, Queso, Papitas y Salsa al Gusto",
                "$7.000"));
        items.add(new ListaPerro(R.drawable.perro, "Perro Italiano - Doble Salchicha, Cebolla, Pimentón, Queso y Salsas",
                "$8.800"));

        // Sets the data behind this ListView
        this.listView12.setAdapter(new ListaPerroAdapter(this, items));

        // Register a callback to be invoked when an item in this AdapterView
        // has been clicked

        //  listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        //    @Override
        //    public void onItemClick(AdapterView<?> adapter, View view,
        //                            int position, long arg) {

        // Sets the visibility of the indeterminate progress bar in the
        // title
        //       setProgressBarIndeterminateVisibility(true);
        // Show progress dialog


        //     progressDialog = ProgressDialog.show(MainActivity.this,
        //           "ProgressDialog", "Loading!");

        //                }
        //  });

    }


}
