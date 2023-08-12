package com.example.demo.entities;

public class Category {
    private  String Catcode;
    private String Catdesc;

    public  String getCatcode(){
        return Catcode;
    }

    public void setCatcode(String Catcode) {
        this.Catcode = Catcode;
    }

    public void setCatdesc(String Catdesc) {
        this.Catdesc = Catdesc;
    }

    public  String getCatdesc(){
        return Catdesc;
    }
}
