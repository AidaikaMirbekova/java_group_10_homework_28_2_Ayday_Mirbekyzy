package com.company;

public class RoadTavern implements Events{
    private Trader trader;

    public RoadTavern(Trader trader) {
        this.trader = trader;
    }
    @Override
    public void doEvent() {
        trader.setDistance(trader.getDistance()- trader.getSpeed());
        System.out.printf("О трактир!\nМожно чуть отдохнуть, может и продам что-то\nОсталось  проехать %s лиг\n ",trader.getDistance());
        System.out.println("____________________________");
    }
}
