package Inheritance;

public class FoodApp {
    public static void main(String[] args) {
        Sushi sushi = new Sushi("Sushi", 4);
        sushi.printingredients();
        sushi.checkrating();

        Hamburger hamburger = new Hamburger("Hamburger", 7);
        hamburger.printingredients();
        hamburger.checkrating();

        Pizza pizza = new Pizza("Pizza", 8);
        pizza.printingredients();
        pizza.checkrating();

    }
}
