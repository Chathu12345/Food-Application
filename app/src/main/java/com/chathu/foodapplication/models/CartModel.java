package com.chathu.foodapplication.models;

public class CartModel {
    int image;
    String name;
    String price;
    String rating;

    public CartModel(int image, String name, String price, String rating) {
        this.image = image;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
}
