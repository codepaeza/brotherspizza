package com.paez.edwin.brotherspizza;

/**
 * Created by PC on 15/12/2017.
 */


public class ListaPerro {

    private int image12;
    private String title12;
    private String descripcion12;

    public ListaPerro() {
        super();
    }

    public ListaPerro(int image12, String title12, String descripcion12) {
        super();
        this.image12 = image12;
        this.title12 = title12;
        this.descripcion12 = descripcion12;
    }

    public int getImage12() {
        return image12;
    }

    public void setImage12(int image12) {
        this.image12 = image12;
    }

    public String getTitle12() {
        return title12;
    }

    public void setTitle12(String title12) {
        this.title12 = title12;
    }

    public String getDescripcion12() {
        return descripcion12;
    }

    public void setDescripcion12(String descripcion12) {
        this.descripcion12 = descripcion12;
    }

}