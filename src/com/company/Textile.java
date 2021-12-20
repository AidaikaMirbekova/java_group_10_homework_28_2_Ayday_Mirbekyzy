package com.company;

public class Textile extends Product{
    public Textile() {
        super(Quality.NORMAL);
    }

    @Override
    public String getName() {
        return "Ткань";
    }

    @Override
    public double getBuyPrice() {
        return 15;
    }

    @Override
    public void setBuyPrice(int buyPrice) {
        super.setBuyPrice(buyPrice);
    }

    @Override
    public int getWeight() {
        return 10;
    }

    @Override
    public void setWeight(int weight) {
        super.setWeight(weight);
    }
}
