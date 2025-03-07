package happyfamily_v4.src;

import java.time.DayOfWeek;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] habits = {"talk", "run", "sleep"};
        Fish pet1 = new Fish("nemo",1,75,habits);
        DomesticCat pet2 = new DomesticCat("mestan",5,100,habits);
        Human mother = new Human("Alice","Williams",1975,100, new String[][]{{DayOfWeek.MONDAY.name(), "learn java"},
                {DayOfWeek.TUESDAY.name(), "play minecraft"}});
        Human father = new Human("Bob","Williams",1975);
        Family family1= new Family(mother, father);
        Human child1 = new Human("jack","Williams",2006);
        Human child2 = new Human("daniel","Williams",2006);

        //test family methods

        family1.setPet(pet1);
        family1.addchild(child1);
        family1.addchild(child2);
        family1.countFamily();
        family1.deletechild(1);
        System.out.println(family1);
        family1.countFamily();

        //test pet

        mother.greetpet();
        pet1.respond();
        pet2.foul();

        //test man and woman subclasses

        Man child3 = new Man("Bob","Williams",2009,120, new String[][]{{DayOfWeek.MONDAY.name(), "Play football"},
                {DayOfWeek.TUESDAY.name(), "Walk 10 minutes"}});
        family1.addchild(child3);
        child3.playfootball();
        child3.greetpet();
        Woman child4=new Woman("Rose","Williams",2012,120,new String[][]{{DayOfWeek.MONDAY.name(), "Play Volleyball"},
                {DayOfWeek.TUESDAY.name(), "Read a book"}});

        family1.addchild(child4);
        child4.makeup();
        child4.greetpet();

    }
}

