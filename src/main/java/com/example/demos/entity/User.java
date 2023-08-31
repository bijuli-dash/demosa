package com.example.demos.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
public class User{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private long id;
    private String username;
    private int password;
    private int age;
    private int height;
    private int weight;
    private String gender;
    private String goal;
    private String healthc;

    public User(String username, int password, int age, int height, int weight, String gender, String goal, String healthc) {
        this.username = username;
        this.password = password;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.goal = goal;
        this.healthc = healthc;
    }

    public User() {

    }


    public void setId(long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public void setHealthc(String healthc) {
        this.healthc = healthc;
    }

}
