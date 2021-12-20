package com.company;


public class NormalDay implements Events{
    private Trader trader;

    public NormalDay(Trader trader) {
        this.trader = trader;
    }

    @Override
    public void doEvent() {
        System.out.println("Сегодня обычный день,ничего не произошло");
        trader.setDistance(trader.getDistance()-trader.getSpeed());
        System.out.printf("Осталось  проехать %s лиг\n ",trader.getDistance());
        System.out.println("____________________________");
    }

}
