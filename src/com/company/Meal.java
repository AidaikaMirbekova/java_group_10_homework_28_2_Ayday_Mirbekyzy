package com.company;

public class Meal extends Product{

    public Meal() {
        super(Quality.NORMAL);
    }

    @Override
    public String getName() {
        return "Мука";
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
        return 5;
    }

    @Override
    public void setWeight(int weight) {
        super.setWeight(weight);
    }
}
