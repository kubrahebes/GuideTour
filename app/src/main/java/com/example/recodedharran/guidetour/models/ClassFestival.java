package com.example.recodedharran.guidetour.models;

/**
 * Created by Recodedharran on 2.12.2017.
 */

public class ClassFestival {
    int image1;
    int image2;
    int image3;
    int text1;
    int text2;

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public ClassFestival(int image1, int image2, int image3, int text1, int text2, int text3, int name) {
        this.image1 = image1;
        this.image2 = image2;
        this.image3 = image3;
        this.text1 = text1;
        this.text2 = text2;
        this.text3 = text3;
        this.name = name;

    }

    int text3;
    int name;

    public ClassFestival() {
    }

    public int getImage1() {
        return image1;
    }

    public void setImage1(int image1) {
        this.image1 = image1;
    }

    public int getImage2() {
        return image2;
    }

    public void setImage2(int image2) {
        this.image2 = image2;
    }

    public int getImage3() {
        return image3;
    }

    public void setImage3(int image3) {
        this.image3 = image3;
    }

    public int getText1() {
        return text1;
    }

    public void setText1(int text1) {
        this.text1 = text1;
    }

    public int getText2() {
        return text2;
    }

    public void setText2(int text2) {
        this.text2 = text2;
    }

    public int getText3() {
        return text3;
    }

    public void setText3(int text3) {
        this.text3 = text3;
    }

    public ClassFestival(int image1, int image2, int image3, int text1, int text2, int text3) {
        this.image1 = image1;
        this.image2 = image2;
        this.image3 = image3;
        this.text1 = text1;
        this.text2 = text2;
        this.text3 = text3;

    }
}
