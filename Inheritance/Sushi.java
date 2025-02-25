package Inheritance;

public class Sushi extends Food {
    public Sushi(String name, int rating){
        super(name, rating);
    }

    @Override
    public void printingredients(){
        System.out.printf("Ingredients of %s:\nRice Fish Nori Avocado\n",getName());
    }

    @Override
    public boolean Tastesgood(){
        return false;
    }
}
