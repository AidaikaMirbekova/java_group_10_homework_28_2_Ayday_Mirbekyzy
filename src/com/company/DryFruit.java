package com.company;

public class DryFruit extends Product{

    public DryFruit() {
        super(Quality.NORMAL );
    }

    @Override
    public String getName() {
        return "Сухофрукты";
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
}
