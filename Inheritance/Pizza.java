package Inheritance;

public class Pizza extends Food{
    public Pizza(String name, int rating){
        super(name, rating);
    }

    @Override
    public void printingredients(){
        System.out.printf("Ingredients of %s:\nDough Mozzarella Pepperoni Olive\n".formatted(getName()));
    }

    @Override
    public boolean Tastesgood(){
        return true;
    }

}
