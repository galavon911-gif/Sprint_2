import model.Food;
import model.Meat;
import model.Apple;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Meat food1 = new Meat(5, 100);
        Apple food2 = new Apple(10, 50, "red");
        Apple food3 = new Apple(8, 60, "green");
        Food [] food = {food1, food2, food3};
        System.out.println("Общая сумма товаров без скидки: " +ShoppingCart.Summa(food)+ " рублей");
        System.out.println("Общая сумма товаров со скидкой: " +ShoppingCart.Summa_sk(food)+ " рублей");
        System.out.println("Cумма всех вегетарианских продуктов без скидки: " + ShoppingCart.Summa_veg(food) + " рублей");
    }
}