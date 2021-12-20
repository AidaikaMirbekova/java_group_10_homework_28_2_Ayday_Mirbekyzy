package com.company;



public class MeetLocal implements Events{
    private Trader trader;

    public MeetLocal(Trader trader) {
        this.trader = trader;
    }

    @Override
    public void doEvent() {
        System.out.println("Встретил местного! Удалось срезать часть пути");
        trader.setDistance(trader.getDistance()- (trader.getSpeed()+3));
        System.out.printf("осталось  проехать %s лиг\n ",trader.getDistance());
        System.out.println("____________________________");

    }
}
