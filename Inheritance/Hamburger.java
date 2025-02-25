package Inheritance;

public class Hamburger extends Food{
    public Hamburger(String name, int rating){
        super(name, rating);
    }

    @Override
    public void printingredients(){
        System.out.printf("Ingredients of %s\nBread Meat Sauce Cheese\n".formatted(getName()));
    }
    @Override
    public boolean Tastesgood(){
        return true;
    }
}
