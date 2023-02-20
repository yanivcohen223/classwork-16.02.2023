package org.example;



public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        Chair chair1 = new Chair("regular", 4, 45.2f);
        chair1.printChair();
        System.out.println("\n" + chair1.calculatePrice(5));

        System.out.println("\n");

        ChairInherit1 c1 = new ChairInherit1("regular", 4, 50.4f);
        c1.printChair();
        System.out.println("\n" + c1.calculatePrice(10));

        System.out.println("\n");

        ChairInherit2 c2 = new ChairInherit2("Z2", 4, 99.9f);
        c2.printChair();
        System.out.println("\n" + c2.calculatePrice(5));
    }
}