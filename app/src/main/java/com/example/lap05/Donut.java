package com.example.lap05;

public class Donut {
    private String name;
    private String description;
    private  String price;
    private  int img;

    public Donut(String name, String description, String price, int img) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.img = img;
    }

    public Donut(String name, String description, String price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
