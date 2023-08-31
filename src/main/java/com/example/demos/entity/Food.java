package com.example.demos.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Getter
@Entity
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String name;
    private int kcal;
    private int protein;
    private int carb;
    private int sugar;
    private int fat;
    private int fibre;
    private int price;

    public Food() {

    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKcal(int kcal) {
        this.kcal = kcal;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

    public void setCarb(int carb) {
        this.carb = carb;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void setFibre(int fibre) {
        this.fibre = fibre;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Food(String name, int kcal, int protein, int carb, int sugar, int fat, int fibre, int price) {
        this.name = name;
        this.kcal = kcal;
        this.protein = protein;
        this.carb = carb;
        this.sugar = sugar;
        this.fat = fat;
        this.fibre = fibre;
        this.price = price;

    }
}
