package service;
import model.Apple;
import model.Food;
import model.constants.Discount;

public class ShoppingCart {
    private Food[] food;

    public ShoppingCart(Food[] food) {
        this.food = food;
    }

    public double getTotalPrice( ) {
            double summa=0;
            for (int i = 0; i < food.length; i++) {
                summa = summa + food[i].getAmount() * food[i].getPrice();
            }
            return summa;
        }

        public double getDiscountPrice() {
            double summa=0;
            for (int i = 0; i <food.length; i++) {
                if (food[i] instanceof Apple) {
                    Apple myApple = (Apple) food[i];
                    if ("red".equals(myApple.getColour())){
                    summa = summa + food[i].getAmount() * food[i].getPrice()*Discount.RED_APPLE_DISCOUNT;}
                    else{summa = summa + food[i].getAmount() * food[i].getPrice();}
                } else {
                    summa = summa + food[i].getAmount() * food[i].getPrice();
                } ;
            }
            return summa;
        }
        public double getTotalVeganPrice(){
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
