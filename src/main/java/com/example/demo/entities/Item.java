package com.example.demo.entities;

public class Item {
    private  String Catcode;
    private String Icode;
    private String Idesc;
    private float Price;

    public String getCatcode() {
        return Catcode;
    }

    public void setCatcode(String catcode) {
        Catcode = catcode;
    }

    public String getIcode() {
        return Icode;
    }

    public void setIcode(String icode) {
        Icode = icode;
    }

    public String getIdesc() {
        return Idesc;
    }

    public void setIdesc(String idesc) {
        Idesc = idesc;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }
}
