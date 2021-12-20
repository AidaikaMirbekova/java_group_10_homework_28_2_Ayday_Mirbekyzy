package com.company;

public class Dye extends Product {

    public Dye() {
        super(Quality.NORMAL);
    }

    @Override
    public String getName() {
        return "Краска";
    }

    @Override
    public double getBuyPrice() {
        return 16;
    }

    @Override
    public void setBuyPrice(int buyPrice) {
        super.setBuyPrice(buyPrice);
    }

    @Override
    public int getWeight() {
        return 8;
    }

    @Override
    public void setWeight(int weight) {
        super.setWeight(weight);
    }
}
