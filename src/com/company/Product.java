package com.company;


abstract class Product {
    private String name;
    private int weight;
    private double sellPrice;
    private double buyPrice;
    private Quality quality;



    public Product(Quality quality) {
        this.quality = quality;
    }


    public String getName() {
        return name;
    }

    public double getSellPrice() {quality.getCost(Product.this);
        return sellPrice;}

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(int buyPrice) {
        this.buyPrice = buyPrice;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Quality getQuality() {
        return quality;
    }

    public void setQuality(Quality quality) {
        this.quality = quality;
    }
}

