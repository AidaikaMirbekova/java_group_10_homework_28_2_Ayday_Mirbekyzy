package com.company;

public class SmoothRoad implements Events{
    private Trader trader;
    private Product product;

    public SmoothRoad(Trader trader) {
        this.trader = trader;
    }

    @Override
    public void doEvent() {
        System.out.println("Сегодня отличный день и прямая дорога");
        trader.setDistance(trader.getDistance()- (trader.getSpeed()+2));
        System.out.printf("Осталось  проехать %s лиг\n ",trader.getDistance());
        System.out.println("____________________________");
    }
}
