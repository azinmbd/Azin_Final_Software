package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;


@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Primary key

    private String Catcode;
    private String Icode;
    private String Idesc;
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