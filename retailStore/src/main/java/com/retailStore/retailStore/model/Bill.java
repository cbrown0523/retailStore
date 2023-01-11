package com.retailStore.retailStore.model;

public class Bill {
    private int id;
    private float grandTotal;
    private float discount;

    public Bill() {
    }

    public Bill(int id, float grandTotal, float discount) {
        this.id = id;
        this.grandTotal = grandTotal;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public float getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(float grandTotal) {
        this.grandTotal = grandTotal;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }
}
