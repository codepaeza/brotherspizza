package com.paez.edwin.brotherspizza;

/**
 * Created by PC on 9/12/2017.
 */

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ListView;

public class ListaPizzaActivity extends Activity {

    private ListView listView1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Display a indeterminate progress bar on title bar
        requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);

        this.setContentView(R.layout.menu_pizza);

        this.listView1 = (ListView) findViewById(R.id.listView1);


        List items = new ArrayList();
        items.add(new ListaPizza(R.drawable.pvegetales, "Vegetales",
                "Cebolla, Pimentón, Brócoli, Espinaca, Orégano y Salsa de Ajo"));
        items.add(new ListaPizza(R.drawable.pcarne, "Carne",
                "Peperoni, Jamón y Queso"));
        items.add(new ListaPizza(R.drawable.pbocadillo, "Bocadillo",
                "Bocadillo y Queso"));
        items.add(new ListaPizza(R.drawable.pchocolate, "Chocolate",
                "Queso Ricota, Fresas, Golchis y Chocolate"));
        items.add(new ListaPizza(R.drawable.pbufalo, "Búfalo",
                "Picante, Tomate, Papas, Pollo y Queso"));
        items.add(new ListaPizza(R.drawable.ptropical, "Tropical",
                "Base de Queso Ricota, Cerezas, Uvas Pasas, Mango, Piña y Queso"));
        items.add(new ListaPizza(R.drawable.pmexi,
                "Mexi", "Carne Molida, Cebolla, Pimentón, Cilantro, Papas y Queso"));
        items.add(new ListaPizza(R.drawable.pbbq,
                "BBQ", "Pollo, Papas, Salsa BBQ y Queso"));
        items.add(new ListaPizza(R.drawable.pranchera,
                "Ranchera", "Pimentón, Cebolla, Salsa BBQ y Queso"));
        items.add(new ListaPizza(R.drawable.palbondigas,
                "Albondigas", "Salsa Italiana, Albóndigas y Queso"));
        items.add(new ListaPizza(R.drawable.pchorizo,
                "Chorizo", "Cebolla, Cilantro, Chorizo y Queso"));
        items.add(new ListaPizza(R.drawable.pbianca,
                "Bianca", "Tomate, Queso y Albahaca"));
        items.add(new ListaPizza(R.drawable.pmiel,
                "Miel Mostaza y Pollo", "Porción de Miel Mostaza, Pechuga de Pollo"));
        items.add(new ListaPizza(R.drawable.pchampinon,
                "Champiñón", "Pollo, Champiñón y Queso"));
        items.add(new ListaPizza(R.drawable.phawaiana,
                "Hawaiana", "Piña, Jamón y Queso"));
        // Sets the data behind this ListView
        this.listView1.setAdapter(new ListaPizzaAdapter(this, items));



      listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
       @Override
        public void onItemClick(AdapterView<?> adapter, View view,
                               int position, long arg) {

           Intent intent30 = new Intent(ListaPizzaActivity.this, ListaPizza2Activity.class);
           startActivity(intent30);
    }


});
    }

}