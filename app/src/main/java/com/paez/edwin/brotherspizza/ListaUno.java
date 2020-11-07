package com.paez.edwin.brotherspizza;

/**
 * Created by PC on 9/12/2017.
 */

public class ListaUno {

    private int image;
    private String title;


    public ListaUno() {
        super();
    }

    public ListaUno(int image, String title) {
        super();
        this.image = image;
        this.title = title;

    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}