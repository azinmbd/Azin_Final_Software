package com.example.demo.entities;

import jakarta.persistence.*;


@Entity
@Table(name = "items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "Catcode")
    private String Catcode;

    @Column(name = "Icode")
    private String Icode;

    @Column(name = "Idesc")
    private String Idesc;

    @Column(name = "Price")
    private float Price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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