package com.retailStore.retailStore.model;

public class Product {
    private int productId;
    private int quantity;
    private String size;

    public Product() {
    }

    public Product(int productId, int quantity, String size) {
        this.productId = productId;
        this.quantity = quantity;
        this.size = size;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
