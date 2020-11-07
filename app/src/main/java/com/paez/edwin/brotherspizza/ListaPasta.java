package com.paez.edwin.brotherspizza;

/**
 * Created by PC on 15/12/2017.
 */


public class ListaPasta {

    private int image11;
    private String title11;
    private String descripcion11;

    public ListaPasta() {
        super();
    }

    public ListaPasta(int image11, String title11, String descripcion11) {
        super();
        this.image11 = image11;
        this.title11 = title11;
        this.descripcion11 = descripcion11;
    }

    public int getImage11() {
        return image11;
    }

    public void setImage11(int image11) {
        this.image11 = image11;
    }

    public String getTitle11() {
        return title11;
    }

    public void setTitle11(String title11) {
        this.title11 = title11;
    }

    public String getDescripcion11() {
        return descripcion11;
    }

    public void setDescripcion11(String descripcion11) {
        this.descripcion11 = descripcion11;
    }

}