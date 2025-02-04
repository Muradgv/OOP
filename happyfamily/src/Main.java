package happyfamily.src;
import happyfamily.src.Pet;
public class Main {
    public static void main(String[] args) {
        String[] habits = {"talk", "run", "sleep"};
        Pet pet1 = new Pet("dog", "toplan", 3, 100, habits);
        Pet pet2 = new Pet("cat", "mestan");

        Human mother = new Human("Alice","Williams",1975);
        Human father = new Human("Bob","Williams",1975);
        Human son = new Human("Jack","Williams",2006,120, pet1, mother, father, new String[][]{{"Monday","Project 1"},{
            "Tueaday","Project 2"},{"Wednesday","Play Minecraft"}});
        System.out.println(mother);
        System.out.println(father);
        System.out.println(son);
        System.out.println(pet1);

    }
}

