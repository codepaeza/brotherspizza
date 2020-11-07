package com.paez.edwin.brotherspizza;

/**
 * Created by PC on 10/12/2017.
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

public class ListaFugazzaActivity extends Activity {

    private ListView listView4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Display a indeterminate progress bar on title bar
        requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);

        this.setContentView(R.layout.menu_fugazza);

        this.listView4 = (ListView) findViewById(R.id.listView4);


        List items = new ArrayList();
        items.add(new ListaStromboli(R.drawable.logo, "Tamaño Familiar (Mixta y Carnes)",
                "$48.000"));
        items.add(new ListaStromboli(R.drawable.logo, "Porción (Mixta y Carnes)",
                "$6.000"));


        // Sets the data behind this ListView
        this.listView4.setAdapter(new ListaStromboliAdapter(this, items));

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
