package com.company;

public class Meat extends Product{
    public Meat() {super(Quality.NORMAL);}

    @Override
    public String getName() {
        return "Мясо";
    }

    @Override
    public double getBuyPrice() {
        return 20;
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
