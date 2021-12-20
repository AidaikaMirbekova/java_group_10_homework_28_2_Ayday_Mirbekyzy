package com.company;


import java.util.Random;

public class Cities {
    private City city;
    private City getRandomCity() {
        return City.values()[new Random().nextInt(7)];
    }
}
