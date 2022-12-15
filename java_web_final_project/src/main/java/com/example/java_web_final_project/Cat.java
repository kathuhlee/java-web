package com.example.java_web_final_project;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Cat {
    @Id
    @GeneratedValue
    private Integer id;
    private String catName;
    private String catBreed;
    public Cat(){

    }

    // need an empty constructor

    public Cat(String catName, String catBreed) {
        this.catName = catName;
        this.catBreed = catBreed;
    }

    public Cat(Integer id, String catName, String catBreed) {
        this.id = id;
        this.catName = catName;
        this.catBreed = catBreed;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getCatBreed() {
        return catBreed;
    }

    public void setCatBreed(String catBreed) {
        this.catBreed = catBreed;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", catName='" + catName + '\'' +
                ", catBreed='" + catBreed + '\'' +
                '}';
    }
}
