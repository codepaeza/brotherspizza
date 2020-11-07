package com.paez.edwin.brotherspizza;

/**
 * Created by PC on 15/12/2017.
 */

public class ListaAlbondigas {

    private int image10;
    private String title10;
    private String descripcion10;

    public ListaAlbondigas() {
        super();
    }

    public ListaAlbondigas(int image10, String title10, String descripcion10) {
        super();
        this.image10 = image10;
        this.title10 = title10;
        this.descripcion10 = descripcion10;
    }

    public int getImage10() {
        return image10;
    }

    public void setImage10(int image10) {
        this.image10 = image10;
    }

    public String getTitle10() {
        return title10;
    }

    public void setTitle10(String title10) {
        this.title10 = title10;
    }

    public String getDescripcion10() {
        return descripcion10;
    }

    public void setDescripcion10(String descripcion10) {
        this.descripcion10 = descripcion10;
    }

}