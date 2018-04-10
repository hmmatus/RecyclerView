package com.example.manrique_matus.recyclerview.Class;

import android.widget.Toast;

import com.example.manrique_matus.recyclerview.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Manrique_Matus on 008/8/4/2018.
 */
//Creo el contenido de la lista que usare para llenar el recycler mas adelante
public class Serie {

    private String name;
    private String caps;
    private int img;
    private String desc;

    public Serie(String name, String caps, int img, String desc) {
        this.name = name;
        this.caps = caps;
        this.img = img;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCaps() {
        return caps;
    }

    public void setCaps(String caps) {
        this.caps = caps;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    //Creo datos


}
