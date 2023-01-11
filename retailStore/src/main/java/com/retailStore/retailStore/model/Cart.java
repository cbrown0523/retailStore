package com.retailStore.retailStore.model;


import java.util.List;

public class Cart {
    private int id;
    private int userId;
    private String date;
    private List<Product> products;

    public Cart() {
    }

    public Cart(int id, int userId, String date, List<Product> products) {
        this.id = id;
        this.userId = userId;
        this.date = date;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
