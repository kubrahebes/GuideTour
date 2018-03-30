package com.example.recodedharran.guidetour.models;

/**
 * Created by Recodedharran on 2.12.2017.
 */

public class ClassGaleri {
    int foto1;
    int foto2;

    public ClassGaleri(int foto1, int foto2) {
        this.foto1 = foto1;
        this.foto2 = foto2;
    }

    public ClassGaleri() {
    }

    public int getFoto1() {
        return foto1;
    }

    public void setFoto1(int foto1) {
        this.foto1 = foto1;
    }

    public int getFoto2() {
        return foto2;
    }

    public void setFoto2(int foto2) {
        this.foto2 = foto2;
    }
}
