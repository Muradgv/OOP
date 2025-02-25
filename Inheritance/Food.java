package Inheritance;

public abstract class Food {
    private String name;
    private int rating; //it is what you would give out of ten

    public Food(String name, int rating){
        this.name=name;
        this.rating=rating;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void printingredients();
    public abstract boolean Tastesgood();
    public void checkrating(){
        if(rating>=8){
            System.out.println("Rating of %s: Excellent\n".formatted(getName()));
        }
        else if (rating>=5 && rating<8){
            System.out.println("Rating of %s: Good\n".formatted(getName()));
        }
        else{
            System.out.println("Rating of %s: Not recommended\n".formatted(getName()));
        }
    }
}
