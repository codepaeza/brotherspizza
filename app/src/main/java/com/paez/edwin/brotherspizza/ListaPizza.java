package com.paez.edwin.brotherspizza;

/**
 * Created by PC on 9/12/2017.
 */
public class ListaPizza {

    private int image1;
    private String title1;
    private String descripcion1;

    public ListaPizza() {
        super();
    }

    public ListaPizza(int image1, String title1, String descripcion1) {
        super();
        this.image1 = image1;
        this.title1 = title1;
        this.descripcion1 = descripcion1;
    }

    public int getImage1() {
        return image1;
    }

    public void setImage1(int image1) {
        this.image1 = image1;
    }

    public String getTitle1() {
        return title1;
    }

    public void setTitle1(String title1) {
        this.title1 = title1;
    }

    public String getDescripcion1() {
        return descripcion1;
    }

    public void setDescripcion1(String descripcion1) {
        this.descripcion1 = descripcion1;
    }

}