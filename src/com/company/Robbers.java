package com.company;

public class Robbers implements Events{
    private Trader trader;
    private Product product;

    public Robbers(Trader trader) {
        this.trader = trader;
    }

    @Override
    public void doEvent() {
        System.out.println("Напали Разбойники!");
        int count = 0;
        while (count<2) {
        try {
            if (trader.getCash()>0){
                System.out.println("отобрали все деньги!");
                trader.setCash(0);
            } else if (product.getQuality().equals(Quality.SLIDHTYFLAWED)){
                trader.getProducts().remove(product);
            }
        } catch (Exception e){
            System.out.println("забрали весь самый лучший товар!");
            }break;
        }
        trader.setDistance(trader.getDistance()- trader.getSpeed());
        System.out.printf("осталось  проехать %s лиг\n ",trader.getDistance());
        System.out.println("____________________________");
    }

}
