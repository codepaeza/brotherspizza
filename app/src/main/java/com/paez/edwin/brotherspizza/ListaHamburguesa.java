package com.paez.edwin.brotherspizza;

/**
 * Created by PC on 14/12/2017.
 */

public class ListaHamburguesa {

    private int image6;
    private String title6;
    private String descripcion6;

    public ListaHamburguesa() {
        super();
    }

    public ListaHamburguesa(int image6, String title6, String descripcion6) {
        super();
        this.image6 = image6;
        this.title6 = title6;
        this.descripcion6 = descripcion6;
    }

    public int getImage6() {
        return image6;
    }

    public void setImage6(int image6) {
        this.image6 = image6;
    }

    public String getTitle6() {
        return title6;
    }

    public void setTitle6(String title6) {
        this.title6 = title6;
    }

    public String getDescripcion6() {
        return descripcion6;
    }

    public void setDescripcion6(String descripcion6) {
        this.descripcion6 = descripcion6;
    }

}