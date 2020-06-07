package com.example.groceryshopproject.RecyclerViews;

import android.graphics.drawable.Drawable;
import android.media.Image;

public class item_Model {
    String title;
    String weight;
    String price;
    int image;

    public item_Model(String title, String weight, String price, int image) {
        this.title = title;
        this.weight = weight;
        this.price = price;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
