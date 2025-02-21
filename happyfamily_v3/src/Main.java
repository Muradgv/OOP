package happyfamily_v3.src;

import java.time.DayOfWeek;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] habits = {"talk", "run", "sleep"};
        Pet pet1 = new Pet(Species.DOG, "toplan", 3, 100, habits);
        Pet pet2 = new Pet(Species.CAT, "mestan");

        Human mother = new Human("Alice","Williams",1975,100, new String[][]{{DayOfWeek.MONDAY.name(), "learn java"},
                {DayOfWeek.TUESDAY.name(), "play minecraft"}});
        Human father = new Human("Bob","Williams",1975);
        Family family1= new Family(mother, father);
        family1.setPet(pet2);
        Human child1 = new Human("jack","Williams",2006);
        Human child2 = new Human("daniel","Williams",2006);
        family1.addchild(child1);
        family1.addchild(child2);
        family1.countFamily();
        System.out.println(family1);
        family1.deletechild(1);
        System.out.println(family1);
        family1.countFamily();
    }
}

