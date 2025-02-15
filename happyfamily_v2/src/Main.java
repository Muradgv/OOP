package happyfamily_v2.src;

public class Main {
    public static void main(String[] args) {
        String[] habits = {"talk", "run", "sleep"};
        Pet pet1 = new Pet("dog", "toplan", 3, 100, habits);
        Pet pet2 = new Pet("cat", "mestan");

        Human mother = new Human("Alice","Williams",1975);
        Human father = new Human("Bob","Williams",1975);
        Human jack = new Human("jack","Williams",2006);
        Human daniel = new Human("daniel","Williams",2006);

        Family family1= new Family(mother,father);
        family1.addchild(jack);
        family1.addchild(daniel);
        System.out.println(family1);
        family1.deletechild(0);
        System.out.println(family1);


    }
}

