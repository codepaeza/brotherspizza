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

import android.widget.AdapterView;
import android.widget.ListView;

public class MenuUnoActivity extends Activity {

    private ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Display a indeterminate progress bar on title bar
        requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);

        this.setContentView(R.layout.menu_principal);

        this.listView = (ListView) findViewById(R.id.listView);


        List items = new ArrayList();
        items.add(new ListaUno(R.drawable.pizza, "Pizza"));
        items.add(new ListaUno(R.drawable.logo, "Stromboli"));
        items.add(new ListaUno(R.drawable.logo, "Fugazza"));
        items.add(new ListaUno(R.drawable.logo, "Garlic Bread - Rollitos de Pan"));
        items.add(new ListaUno(R.drawable.hamburguesa, "Hamburguesas"));
        items.add(new ListaUno(R.drawable.papas, "Papas N.Y"));
        items.add(new ListaUno(R.drawable.sandwich, "Sandwich (Caliente)- (Pollo ó Carne) -Lechuga, Tomate y Cebolla"));
        items.add(new ListaUno(R.drawable.logo, "Club House de Carnes"));
        items.add(new ListaUno(R.drawable.logo, "Albondigas"));
        items.add(new ListaUno(R.drawable.logo, "Pastas y Lasagna (Con tres panes de Ajo)"));
        items.add(new ListaUno(R.drawable.perro, "Perro Caliente"));
        items.add(new ListaUno(R.drawable.logo, "Chile Cheese Dog - Carne Molida, Frijoles, Salsa Especial, Queso y Mostaza"));
        // Sets the data behind this ListView
        this.listView.setAdapter(new ListaUnoAdapter(this, items));

        // Register a callback to be invoked when an item in this AdapterView
        // has been clicked


        //listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                String s = listView.getItemAtPosition(position).toString();


                switch (position) {
                    case 0:
                        Intent intent10 = new Intent(MenuUnoActivity.this, ListaPizzaActivity.class);
                        startActivity(intent10);
                        break;
                    case 1:
                    Intent intent11 = new Intent(MenuUnoActivity.this, ListaStromboliActivity.class);
                    startActivity(intent11);
                    break;
                    case 2:
                    Intent intent12 = new Intent(MenuUnoActivity.this, ListaFugazzaActivity.class);
                    startActivity(intent12);
                    break;
                    case 3:
                        Intent intent13 = new Intent(MenuUnoActivity.this, ListaGarlicActivity.class);
                        startActivity(intent13);
                        break;

                    case 4:
                        Intent intent14 = new Intent(MenuUnoActivity.this, ListaHamburguesaActivity.class);
                        startActivity(intent14);
                        break;
                    case 5:
                        Intent intent15 = new Intent(MenuUnoActivity.this, ListaPapasActivity.class);
                        startActivity(intent15);
                        break;
                    case 6:
                        Intent intent16 = new Intent(MenuUnoActivity.this, ListaSandwichActivity.class);
                        startActivity(intent16);
                        break;
                    case 7:
                        Intent intent17 = new Intent(MenuUnoActivity.this, ListaCarnesActivity.class);
                        startActivity(intent17);
                        break;
                    case 8:
                        Intent intent18 = new Intent(MenuUnoActivity.this, ListaAlbondigasActivity.class);
                        startActivity(intent18);
                        break;
                    case 9:
                        Intent intent19 = new Intent(MenuUnoActivity.this, ListaPastaActivity.class);
                        startActivity(intent19);
                        break;
                    case 10:
                        Intent intent20 = new Intent(MenuUnoActivity.this, ListaPerroActivity.class);
                        startActivity(intent20);
                        break;
                    case 11:
                        Intent intent21 = new Intent(MenuUnoActivity.this, ListaChileActivity.class);
                        startActivity(intent21);
                        break;
                }
            }



        });
    }
}