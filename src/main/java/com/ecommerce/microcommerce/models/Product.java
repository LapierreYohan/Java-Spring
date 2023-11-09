package com.ecommerce.microcommerce.models;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

//@JsonFilter("monFiltreDynamique")

@Entity
public class Product {
    @Id
    //@GeneratedValue
    private int id;
    @Size(min=3, max = 25)
    private String nom;
    @Min(value = 1)
    private int prix;
    //@JsonIgnore
    private int stock;

    public Product() {
    }

    public Product(int id, String nom, int price, int stock) {
        this.id = id;
        this.nom = nom;
        this.prix = price;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getPrix() {
        return prix;
    }

    public int getStock() {
        return stock;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrix(int price) {
        this.prix = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prix=" + prix +
                ", stock=" + stock +
                '}';
    }
}
