package org.example;


import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class ChairInherit2 extends Chair {
    public boolean isAllowAdjustments;
    public boolean isSpinning;
    public boolean hasDiscount;
    public int discountAmount;


    public ChairInherit2(String model, int number_of_legs, float price) {
        this(model, number_of_legs, price, false,
                true, false, 0);
    }

    public ChairInherit2(String model, int number_of_legs, float price, boolean isAllowAdjustments,
                         boolean isSpinning, boolean hasDiscount, int discountAmount) {
        super(model, number_of_legs, price);
        this.isAllowAdjustments = isAllowAdjustments;
        this.isSpinning = isSpinning;
        this.hasDiscount = hasDiscount;
        this.discountAmount = discountAmount;
    }

    @Override
    public void printChair() {
        super.printChair();
        System.out.format(" isAllowAdjustments: %b, isSpinning= %b, hasDiscount= %b, discountAmount= %d",
            this.isAllowAdjustments, this.isSpinning, this.hasDiscount, this.discountAmount);
    }

    @Override
    public String calculatePrice(int numberOfChairs) {
        float price = numberOfChairs * this.getPrice();
        if (hasDiscount) {
            float newPrice = (price / 100) * discountAmount;
            return "for " + numberOfChairs +
                    " chairs the price after the discount is: " + newPrice + " $";
        } else {
            return "for " + numberOfChairs +
                    " chairs the price is: " + price + " $";
        }
    }
}
