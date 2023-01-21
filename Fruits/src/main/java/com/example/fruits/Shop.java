package com.example.fruits;

import java.util.List;
import java.util.Scanner;

public class Shop {
    Cart cart = new Cart();
    private int num = 0;

    public Shop() {
        menu();
    }

    public void start() {
        System.out.println("1. Meyveleri Göster");
        System.out.println("2. Sepeti Göster");
        System.out.println("0. Çıkış");
    }

    public void storeFruits() {
        System.out.println("1. Sepete Ekle");
        System.out.println("2. Sepetten Çıkar");
        System.out.println("0. Çıkış");
    }
    public void menu () {
        do {
            start();
            input();

            switch (num) {
                case 1:
                    displayFruits();
                    storeFruits();
                    input();
                    secondMenu();
                    break;
                case 2:
                    showCart();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:

                    break;
            }
        } while (num != 0);
    }

    private void secondMenu() {
        switch (num) {
            case 1:
                addFruit();
                showCart();
                break;
            case 2:
                removeFruits();
                break;
            default:

                break;
        }
    }

    private int input() throws NumberFormatException {
        Scanner in = new Scanner (System.in);
        num = Integer.parseInt(in.nextLine());
        return num;
    }

    private void displayFruits() {
        List<Fruit> products = new Fruits().getFruits();
        for (Fruit prod: products) {
            System.out.println(
                    prod.getNumber() + "- " +
                            prod.getName() + " " +
                            prod.getPrice() + " " +
                            prod.getStock()
            );
        }
    }

    private void addFruit() {
        int number = input();
        cart.addFruit(number);
    }

    private void showCart() {
        cart.printFruits();
    }

    private void removeFruits() {
        int number = input();
        cart.removeFruit(number);
    }
}
