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

public class ListaGarlicActivity extends Activity {

    private ListView listView5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Display a indeterminate progress bar on title bar
        requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);

        this.setContentView(R.layout.menu_garlic);

        this.listView5 = (ListView) findViewById(R.id.listView5);


        List items = new ArrayList();
        items.add(new ListaStromboli(R.drawable.logo, "Rollitos de Pan - Docena",
                "$3.000"));
        items.add(new ListaStromboli(R.drawable.logo, "Rollitos de Pan - Media Docena",
                "$1.500"));

        items.add(new ListaStromboli(R.drawable.logo, "Rollitos de Pan - Garlic Bread",
                "$3.000"));
        // Sets the data behind this ListView
        this.listView5.setAdapter(new ListaStromboliAdapter(this, items));

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
