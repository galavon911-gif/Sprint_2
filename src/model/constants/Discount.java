package model.constants;

import model.Discountable;

public class Discount implements Discountable {
    private String colour;
    private double price;

    public Discount(String colour, double price) {
        this.colour = colour;
        this.price = price;
    }

    @Override
    public double getDiscount() {
        if (colour=="red") {
            return price * 0.4;
        }
        return price; // Нет скидки
    }
}
