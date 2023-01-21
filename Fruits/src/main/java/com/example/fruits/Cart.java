package com.example.fruits;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Fruit> cartFruits = new ArrayList<Fruit>();

    public void addFruit(int number) {
        Fruit fruit = getFruit(number);
        addToCart(fruit);
    }

    private Fruit getFruit(int number) {
        Fruit fruit = null;
        List<Fruit> fruits = new Fruits().getFruits();

        for (Fruit temp: fruits) {
            if (temp.getNumber() == number) {
                fruit = temp;
                break;
            }
        }
        return fruit;
    }

    private void addToCart(Fruit fruit) {
        cartFruits.add(fruit);
    }

    public void removeFruit(int number) {
        Fruit temp = getFruit(number);
        cartFruits.remove(temp);
    }

    void printFruits() {
        for (Fruit temp: cartFruits) {
            System.out.println(temp.getName());
        }
    }
}
