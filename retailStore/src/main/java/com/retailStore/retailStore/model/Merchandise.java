package com.retailStore.retailStore.model;

public class Merchandise {
    private int id;
    private String title;
    private String price;
    private String description;
    private String category;
    private String image;
    private Object rating;


    public Merchandise() {
    }

    public Merchandise(int id, String title, String price, String description, String category, String image, Object rating) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.description = description;
        this.category = category;
        this.image = image;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public String getImage() {
        return image;
    }

    public Object getRating() {
        return rating;
    }
}
