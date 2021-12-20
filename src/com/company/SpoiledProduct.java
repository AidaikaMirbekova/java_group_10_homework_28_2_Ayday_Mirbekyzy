package com.company;

public class SpoiledProduct implements Events{
    private Trader trader;

    Product product;

    public SpoiledProduct(Trader trader) {
        this.trader = trader;
    }

    @Override
    public void doEvent() {
        System.out.println("Испорченный товар!");
        try {
            product.setQuality(Quality.SPOILEDINTOTRASH);
        } catch (Exception e){
            System.out.println("Товар испорчен");
        }
        trader.setDistance(trader.getDistance()- trader.getSpeed());
        System.out.printf("осталось  проехать %s лиг\n ",trader.getDistance());
        System.out.println("____________________________");
    }
}
