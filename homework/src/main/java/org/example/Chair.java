package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Chair {
    private String model;
    private int number_of_legs;
    private float price;

    public Chair(String model, int number_of_legs, float price) {
        this.model = model;
        this.number_of_legs = number_of_legs;
        this.price = price;
    }

    public String calculatePrice(int numberOfChairs) {
        float price = numberOfChairs * this.price;
        return "for " + numberOfChairs +
                " chairs the price is: " + price + " $";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumber_of_legs() {
        return number_of_legs;
    }

    public void setNumber_of_legs(int number_of_legs) {
        this.number_of_legs = number_of_legs;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void printChair() {
        System.out.format("Chair: %s have %d legs cost %f", this.model, this.number_of_legs, this.price);
    }
   }

