package com.example.recodedharran.guidetour.models;

/**
 * Created by Recodedharran on 2.12.2017.
 */

public class ClassHotel {
    int image;
    String name;
    int stars;

    public ClassHotel(int image, String name, int stars) {
        this.image = image;
        this.name = name;
        this.stars = stars;
    }

    public ClassHotel(int image, String name) {
        this.image = image;
        this.name = name;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public ClassHotel() {
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
