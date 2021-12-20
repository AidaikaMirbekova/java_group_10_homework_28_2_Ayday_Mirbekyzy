package com.company;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Trader {
    Random rnd = new Random();
   private int liftCapacity=100;
   private int speed=3;
   private double cash = rnd.nextInt(150)+100;
   private int distance=rnd.nextInt(50) + 50;
   private List<Product> products = new ArrayList<>();
   private Game game;
   private Product product;

   public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public int getLiftCapacity() {
        return liftCapacity;
    }

    public void setLiftCapacity(int liftCapacity) {
        this.liftCapacity = liftCapacity;
    }

    public int getSpeed() {return speed;}

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getCash() {
        return cash;
    }
    public double getCashStart() {
        return this.cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public int getDistance() {return distance;}

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public Product changeSingleProduct(Quality quality) {
        Collections.shuffle(products);
        return products.get(0);
    }
}
