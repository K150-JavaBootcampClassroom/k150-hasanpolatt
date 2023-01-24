package com.example.rentcar;

import java.util.Scanner;


public class RentMe {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Hatchback renault = new Hatchback(2023, "Clio", "Red", 300, 230);
        Sedan bmw = new Sedan(2023, "320i", "Blue", 250, 290);
        Suv jeep = new Suv(2021, "Renegade", "Black", 400, 250);

        System.out.println("1. Günlük Kiralama\n2. Aylık Kiralama");
        int input = scanner.nextInt();

        if (input == 1) {
            Customer customer = new Customer("Hasan");
            System.out.println("Günlük sadece Hatchback kiralayabilirsiniz. \nKaç gün kiralama yapacaksınız? ");
            int day = scanner.nextInt();
            customer.rentCarDaily(renault, day);
        } else if (input == 2) {
            Company company = new Company("Şirket");
            System.out.println("1. SUV\n2. Sedan\n3. Hatchback");
            int input2 = scanner.nextInt();
            switch (input2) {
                case 1:
                    System.out.println("1- Günlük kiralama\n2- Aylık kiralama");
                    int input3 = scanner.nextInt();
                    if (input3 == 1) {
                        System.out.println("Kaç gün kiralama yapacaksınız? ");
                        int day = scanner.nextInt();
                        company.rentCarDaily(jeep, day);
                    } else if (input3 == 2) {
                        System.out.println("Kaç ay kiralama yapacaksınız?");
                        int month = scanner.nextInt();
                        company.rentCarMonth(jeep, month);
                    }
                    break;
                case 2:
                    System.out.println("1. Günlük kiralama\n2. Aylık kiralama");
                    input3 = scanner.nextInt();
                    if (input3 == 1) {
                        System.out.println("Kaç gün kiralama yapacaksınız?");
                        int day = scanner.nextInt();
                        company.rentCarDaily(renault, day);
                    } else if (input3 == 2) {
                        System.out.println("Kaç ay kiralama yapacaksınız?");
                        int month = scanner.nextInt();
                        company.rentCarMonth(bmw, month);
                    }
                    break;
                case 3:
                    System.out.println("Kaç gün kiralama yapacaksınız? ");
                    int day = scanner.nextInt();
                    company.rentCarDaily(renault, day);
                    break;
            }
        } else {
            System.out.println("Yanlış giriş yaptınız.");
        }
    }
}
