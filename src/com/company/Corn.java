package com.company;

public class Corn extends Product{
    Trader trader;

    public Corn() {
        super(Quality.NORMAL);
    }

    @Override
    public double getBuyPrice() {
        return 10;
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

    @Override
    public double getSellPrice() {
        return super.getSellPrice();
    }

    @Override
    public void setSellPrice(double sellPrice) {
        super.setSellPrice(sellPrice);
    }

    @Override
    public String getName() {
        return "Зерно";
    }
}
