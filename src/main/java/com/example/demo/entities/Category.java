package com.example.demo.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Catcode;
    private String Catdesc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCatcode() {
        return Catcode;
    }

    public void setCatcode(String Catcode) {
        this.Catcode = Catcode;
    }

    public String getCatdesc() {
        return Catdesc;
    }

    public void setCatdesc(String Catdesc) {
        this.Catdesc = Catdesc;
    }
}
