package happyfamily_v2.src;
import happyfamily_v2.src.Pet;

public class Main {
    public static void main(String[] args) {
        String[] habits = {"talk", "run", "sleep"};
        Pet pet1 = new Pet("dog", "toplan", 3, 100, habits);
        Pet pet2 = new Pet("cat", "mestan");
        Human mother = new Human("Alice","Williams", 1975);
        Human father = new Human("Bob","Williams",1975);

        Family family1=new Family(mother,father);

        System.out.println(family1);
    }
}

