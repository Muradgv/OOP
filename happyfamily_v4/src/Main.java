package happyfamily_v4.src;

import java.time.DayOfWeek;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] habits = {"talk", "run", "sleep"};

        Human mother = new Human("Alice","Williams",1975,100, new String[][]{{DayOfWeek.MONDAY.name(), "learn java"},
                {DayOfWeek.TUESDAY.name(), "play minecraft"}});
        Human father = new Human("Bob","Williams",1975);
        Family family1= new Family(mother, father);
        Human child1 = new Human("jack","Williams",2006);
        Human child2 = new Human("daniel","Williams",2006);
        family1.addchild(child1);
        family1.addchild(child2);
        family1.countFamily();
        family1.deletechild(1);
        System.out.println(family1);
        family1.countFamily();

    }
}

