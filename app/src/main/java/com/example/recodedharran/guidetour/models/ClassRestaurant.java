package com.example.recodedharran.guidetour.models;

/**
 * Created by Recodedharran on 2.12.2017.
 */

public class ClassRestaurant {


    int res_res;
    int res_name;

    public ClassRestaurant() {
    }

    int res_adress;
    public ClassRestaurant(int res_res, int res_name, int res_adress) {
        this.res_res = res_res;
        this.res_name = res_name;
        this.res_adress = res_adress;
    }

    public int getRes_res() {
        return res_res;
    }

    public void setRes_res(int res_res) {
        this.res_res = res_res;
    }

    public int getRes_name() {
        return res_name;
    }

    public void setRes_name(int res_name) {
        this.res_name = res_name;
    }

    public int getRes_adress() {
        return res_adress;
    }

    public void setRes_adress(int res_adress) {
        this.res_adress = res_adress;
    }
}
