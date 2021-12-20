package com.company;

public class River implements Events{
    private Trader trader;
    private Product product;

    public River(Trader trader) {
        this.trader = trader;
    }

    @Override
    public void doEvent() {
        System.out.println("Река!\nПотратил целый день, пока искал брод.");
        try {
            product.setQuality(Quality.SPOILEDINTOTRASH);
        } catch (Exception e){
            System.out.println("Товар испорчен");
        }
        trader.setDistance(trader.getDistance()- (trader.getSpeed()-3));
        System.out.printf("Осталось  проехать %s лиг\n ",trader.getDistance());
        System.out.println("____________________________");

    }
}
