package app;

import model.Food;
import model.Meat;
import model.Apple;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Meat food1 = new Meat(5, 100);
        Apple food2 = new Apple(10, 50, Colour.COLOUR_RED);
        Apple food3 = new Apple(8, 60, Colour.COLOUR_GREEN);
        Food [] food = {food1, food2, food3};
        ShoppingCart cart = new ShoppingCart(food);
        System.out.printf("Общая сумма товаров без скидки: " +cart.getTotalPrice()+ " рублей. ");
        System.out.printf("Общая сумма товаров со скидкой: " +cart.getDiscountPrice()+ " рублей. ");
        System.out.printf("Cумма всех вегетарианских продуктов без скидки: " + cart.getTotalVeganPrice() + " рублей.");
    }
}