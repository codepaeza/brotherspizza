package com.paez.edwin.brotherspizza;

/**
 * Created by PC on 15/12/2017.
 */

public class ListaCarnes {

    private int image9;
    private String title9;
    private String descripcion9;

    public ListaCarnes() {
        super();
    }

    public ListaCarnes(int image9, String title9, String descripcion9) {
        super();
        this.image9 = image9;
        this.title9 = title9;
        this.descripcion9 = descripcion9;
    }

    public int getImage9() {
        return image9;
    }

    public void setImage9(int image9) {
        this.image9 = image9;
    }

    public String getTitle9() {
        return title9;
    }

    public void setTitle9(String title9) {
        this.title9 = title9;
    }

    public String getDescripcion9() {
        return descripcion9;
    }

    public void setDescripcion9(String descripcion9) {
        this.descripcion9 = descripcion9;
    }

}