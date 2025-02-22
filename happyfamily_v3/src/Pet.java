package happyfamily_v3.src;

import java.util.Arrays;
import java.util.Objects;

public class Pet {
    public Species species;
    public String nickname;
    public int age;
    public int tricklevel;
    public String[] habits;

    //constructors
    public Pet(Species species, String nickname, int age, int tricklevel, String[] habits){
        this.species=species;
        this.nickname=nickname;
        this.age=age;
        this.tricklevel=tricklevel;
        this.habits=habits;
    }

    public Pet(){
    }

    public Pet(Species species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    //getters and setters
    public Species getSpecies() {
        return species;
    }
    public void setSpecies(Species species) {
        this.species = species;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int gettricklevel() {
        return tricklevel;
    }
    public void setTrickLevel(int tricklevel) {
        this.tricklevel = tricklevel;
    }
    public String[] getHabits() {
        return habits;
    }
    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    //Functions
    public void eat(){
        System.out.println("I'm eating");
    }

    public void respond(){
        System.out.printf("Hello, owner. I am - %s . I miss you!",this.nickname);
    }

    public void foul(){
        System.out.println("I need to cover it up");
    }

    public boolean equals(Object temp) {
        if (this == temp) {
            return true;
        }
        Pet pet = (Pet) temp;
        return age == pet.age && tricklevel == pet.tricklevel && Objects.equals(species, pet.species) && Objects.equals(nickname, pet.nickname);
    }

    @Override
    public String toString() {
        return species + "{nickname='" + nickname + "', age=" + age + ", trickLevel=" + tricklevel + ", habits=" + Arrays.toString(habits) + "}";
    }

    @Override
    protected void finalize() throws Throwable {
        throw new UnsupportedOperationException("finalize method is not supported");
        System.out.println("Pet object is removed");
    }

}