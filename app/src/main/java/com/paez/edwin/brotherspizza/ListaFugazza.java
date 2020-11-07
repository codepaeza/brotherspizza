package com.paez.edwin.brotherspizza;

/**
 * Created by PC on 10/12/2017.
 */


public class ListaFugazza {

    private int image4;
    private String title4;
    private String descripcion4;

    public ListaFugazza() {
        super();
    }

    public ListaFugazza(int image4, String title4, String descripcion4) {
        super();
        this.image4 = image4;
        this.title4 = title4;
        this.descripcion4 = descripcion4;
    }

    public int getImage4() {
        return image4;
    }

    public void setImage4(int image4) {
        this.image4 = image4;
    }

    public String getTitle4() {
        return title4;
    }

    public void setTitle4(String title4) {
        this.title4 = title4;
    }

    public String getDescripcion4() {
        return descripcion4;
    }

    public void setDescripcion4(String descripcion4) {
        this.descripcion4 = descripcion4;
    }

}