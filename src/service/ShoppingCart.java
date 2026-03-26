package service;
import model.Apple;
import model.Food;
import model.constants.Discount;

public class ShoppingCart {
    private static Food[] food = new Food[3];
    public static double Summa(Food[] food) {
            double summa=0;
            for (int i = 0; i < food.length; i++) {
                summa = summa + food[i].getAmount() * food[i].getPrice();
            }
            return summa;
        }

        public static double Summa_sk(Food[] food) {
            double summa=0;
            for (int i = 0; i <food.length; i++) {
                if (food[i] instanceof Apple) {
                    Apple myApple = (Apple) food[i];
                    if ("red".equals(myApple.getColour())){
                    Discount discount = new Discount("red",food[i].getPrice());
                    summa = summa + food[i].getAmount() * discount.getDiscount();}
                    else{summa = summa + food[i].getAmount() * food[i].getPrice();}
                } else {
                    summa = summa + food[i].getAmount() * food[i].getPrice();
                } ;
            }
            return summa;
        }
        public static double Summa_veg(Food[] food){
            double summa=0;
            for (int i = 0; i <food.length; i++) {
                if (food[i].isVegetarian()==true) {
                    summa = summa + food[i].getAmount() * food[i].getPrice();
                } else {
                    summa = summa;
                } ;
            }
            return summa;
        }
    }
