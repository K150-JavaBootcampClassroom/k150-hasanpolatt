package com.example.fruits;

import java.util.ArrayList;
import java.util.List;

public class Fruits {
    private final List<Fruit> fruits = new ArrayList<>();

    public Fruits() {
        this.storeItems();
    }

    public List<Fruit> getFruits() {
        return fruits;
    }

    public void storeItems() {
        String[] fruitName = {"Apple", "Pear", "Cherry"};
        Double[] fruitPrice = {15.00d, 20.00d, 30.00d};
        Integer[] stock = {30, 20, 15};

        for (int i=0; i < fruitName.length; i++) {
            this.fruits.add(new Fruit(i+1, fruitName[i], fruitPrice[i], stock[i]));
        }
    }
}
