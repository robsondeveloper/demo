package com.example.demo;

public class Product {
    private Integer id;
    private String name;

    public Product() {

    }

    public Product(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}