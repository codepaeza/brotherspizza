package com.paez.edwin.brotherspizza;

/**
 * Created by PC on 14/12/2017.
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

public class ListaHamburguesaActivity extends Activity {

    private ListView listView6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Display a indeterminate progress bar on title bar
        requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);

        this.setContentView(R.layout.menu_hamburguesa);

        this.listView6 = (ListView) findViewById(R.id.listView6);


        List items = new ArrayList();
        items.add(new ListaHamburguesa(R.drawable.hamburguesa, "Sencilla: Lechuga, Tomate, Cebolla, Queso, Salsas al Gusto",
                "$6.000"));
        items.add(new ListaHamburguesa(R.drawable.hamburguesa, "Especial: Cebolla, Champiñones, Pollo, Queso, Salsas al Gusto",
                "$7.000"));

        items.add(new ListaHamburguesa(R.drawable.hamburguesa, "Doble Carne: Cebolla, Champiñones, Pollo, Salsas al Gusto",
                "$9.000"));
        items.add(new ListaHamburguesa(R.drawable.hamburguesa, "Pollo Sencilla",
                "$7.000"));
        items.add(new ListaHamburguesa(R.drawable.hamburguesa, "Pollo Especial",
                "$8.000"));
        items.add(new ListaHamburguesa(R.drawable.hamburguesa, "Mixta (Pollo y Carne)",
                "$10.000"));
        // Sets the data behind this ListView
        this.listView6.setAdapter(new ListaHamburguesaAdpater(this, items));

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
