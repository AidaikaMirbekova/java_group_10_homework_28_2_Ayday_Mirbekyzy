package com.company;

public class WheelBroke implements Events{
    private Trader trader;

    public WheelBroke(Trader trader) {
        this.trader = trader;
    }

    @Override
    public void doEvent() {
        System.out.println("Сломалось колесо! День впустую, стоим на месте");
        trader.setDistance(trader.getDistance()- (trader.getSpeed()-3));
        System.out.printf("осталось  проехать %s лиг\n ",trader.getDistance());
        System.out.println("____________________________");
    }
}
