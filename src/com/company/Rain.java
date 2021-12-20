package com.company;

public class Rain implements Events{
    private Trader trader;
    private Product product;

    public Rain(Trader trader) {
        this.trader = trader;
    }

    @Override
    public void doEvent() {
        System.out.println("Дождливый день");
        System.out.println("Черт, один из товаров испортился");
        try {
           product.setQuality(Quality.SPOILEDINTOTRASH);
        } catch (Exception e){
            System.out.println("Товар испорчен");
        }

        trader.setDistance(trader.getDistance()- (trader.getSpeed()-2));
        System.out.printf("Осталось  проехать %s лиг\n ",trader.getDistance());
        System.out.println("____________________________");

    }
}
