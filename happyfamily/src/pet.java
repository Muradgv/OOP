package happyfamily.src;
public class pet {
    public String species;
    public String nickname;
    public int age;
    public int tricklevel;
    public String[] habits;

    public pet(String species, String nickname, int age, int tricklevel, String[] habits){
        this.species=species;
        this.nickname=nickname;
        this.age=age;
        this.tricklevel=tricklevel;
        this.habits=habits;
    }

    public void eat(){
        System.out.println("I'm eating");
    }

    public void respond(){
        System.out.printf("Hello, owner. I am - %s . I miss you!",this.nickname);
    }

    public void foul(){
        System.out.println("I need t ocover it up");
    }

}