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

public class ListaSandwichActivity extends Activity {

    private ListView listView8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Display a indeterminate progress bar on title bar
        requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);

        this.setContentView(R.layout.menu_sandwich);

        this.listView8 = (ListView) findViewById(R.id.listView8);


        List items = new ArrayList();
        items.add(new ListaSandwich(R.drawable.sandwich, "MB, Queso y Salsa Italiana",
                "$8.000"));
        items.add(new ListaSandwich(R.drawable.sandwich, "Pollo Gratinado y Salsa",
                "$8.000"));

        items.add(new ListaSandwich(R.drawable.sandwich, "Tuna (Atún)",
                "$8.000"));
        items.add(new ListaSandwich(R.drawable.sandwich, "Búfalo (Picante)",
                "$8.000"));
        items.add(new ListaSandwich(R.drawable.sandwich, "BBQ (Dulce)",
                "$8.000"));

        items.add(new ListaSandwich(R.drawable.sandwich, "Pollo L.T.C.",
                "$8.000"));
        items.add(new ListaSandwich(R.drawable.sandwich, "Jamón, Pollo y Queso",
                "$8.000"));
        items.add(new ListaSandwich(R.drawable.sandwich, "Mixto Pollo, Carne y Vegetales",
                "$9.500"));
        // Sets the data behind this ListView
        this.listView8.setAdapter(new ListaSandwichAdapter(this, items));

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
