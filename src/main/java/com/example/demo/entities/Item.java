package com.example.demo.entities;

import jakarta.persistence.*;
@Entity
@Table(name = "items")
public class Item {

    @Column(name = "Catcode")
    private String catcode;

    @Id
    @Column(name = "Icode")
    private String icode;

    @Column(name = "Idesc")
    private String idesc;

    @Column(name = "Price")
    private float price;


    public String getCatcode() {
        return catcode;
    }

    public void setCatcode(String catcode) {
        this.catcode = catcode;
    }

    public String getIcode() {
        return icode;
    }

    public void setIcode(String icode) {
        this.icode = icode;
    }

    public String getIdesc() {
        return idesc;
    }

    public void setIdesc(String idesc) {
        this.idesc = idesc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}