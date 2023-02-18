package org.example;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        Chair chair1 = new Chair("regular", 4, 45.2f);
        System.out.println(chair1.printChair());

        System.out.println(chair1.calculatePrice(5));

        ChairInherit1 chair2 = new ChairInherit1( false,
                false, false, 50);

        System.out.println(chair2.printChair());

        System.out.println(chair2.calculatePrice(1));
    }
}