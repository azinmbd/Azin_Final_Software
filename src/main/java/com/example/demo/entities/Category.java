package com.example.demo.entities;
import jakarta.persistence.*;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "Catcode")
    private String Catcode;

    @Column(name = "Catdesc")
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
