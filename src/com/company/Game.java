package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {
    private static Events events;
    private static Trader trader;
    private Product product;
    private int count;
    private double sum;
    private double sellCash;
    private double sumSellProduct;
    private double sumBuyProduct;
    private double totalCash;
    private City city;
    private Cities cities;



    public void makeEvents(){
            Random random = new Random();
            while (trader.getDistance()>=1) {
                int r = random.nextInt(9) + 1;
                switch (r) {
                    case 1:
                        events = new NormalDay(trader);
                        events.doEvent();
                        break;
                    case 2:
                        events = new Rain(trader);
                        events.doEvent();
                        break;
                    case 3:
                        events = new SmoothRoad(trader);
                        events.doEvent();
                        break;
                    case 4:
                        events = new WheelBroke(trader);
                        events.doEvent();
                        break;
                    case 5:
                        events = new River(trader);
                        events.doEvent();
                        break;
                    case 6:
                        events = new MeetLocal(trader);
                        events.doEvent();
                        break;
                    case 7:
                        events = new Robbers(trader);
                        events.doEvent();
                        break;
                    case 8:
                        events = new RoadTavern(trader);
                        events.doEvent();
                        break;
                    case 9:
                        events = new SpoiledProduct(trader);
                        events.doEvent();
                        break;
                }
            }
    }

    public void makeCart() {
        trader= new Trader();
        List<Product> productList = new ArrayList<>();
        productList.add(new Corn());
        productList.add(new Meal());
        productList.add(new Meat());
        productList.add(new DryFruit());
        productList.add(new Dye());
        productList.add(new Textile());
        System.out.println("У торговца денег: "+trader.getCash()+"\nТележка может загрузить максимум: "+trader.getLiftCapacity());
        sum= trader.getCash();
        if (trader.getCash()!=0 & trader.getLiftCapacity() <=100 ) {
            System.out.println("____________Закуп________________");
            for (var prod : productList) {
                System.out.printf("Купил %s %s единиц (состояние:%s) за %s долл\n", prod.getName(), prod.getWeight(), prod.getQuality(), prod.getBuyPrice());
                count += prod.getWeight();
                sum=sum-prod.getBuyPrice();
                sumBuyProduct+=prod.getBuyPrice();
            }
            System.out.printf("Осталось  %s долл, загрузил %s единиц товара ",sum, count);
            System.out.println();
            System.out.println("________________________________________________________");
        }
    }

    public void Sale(){
        makeEvents();
        List<Product> productList = new ArrayList<>();
        productList.add(new Corn());
        productList.add(new Meal());
        productList.add(new Meat());
        productList.add(new DryFruit());
        productList.add(new Dye());
        productList.add(new Textile());
        for (var prod : productList) {
            System.out.printf("Привез %s %s единиц (состояние:%s) купил %s долл, продал за %s\n", prod.getName(), prod.getWeight(), prod.getQuality(), prod.getBuyPrice(),prod.getSellPrice());
            sumSellProduct+=prod.getSellPrice();
            sellCash = sum+sumSellProduct;
        }
        totalCash =sumSellProduct-sumBuyProduct;
        System.out.printf("Cейчас у меня %s, заработал %.4s долл на продаже товара!", sellCash, totalCash);
    }

}
