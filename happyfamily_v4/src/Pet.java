package happyfamily_v4.src;

import java.util.Arrays;
import java.util.Objects;

public abstract class Pet {
    private Species species;
    private String nickname;
    private int age;
    private int tricklevel;
    private String[] habits;

    //constructors
    public Pet(String nickname, int age, int tricklevel, String[] habits){
        this.nickname=nickname;
        this.age=age;
        this.tricklevel=tricklevel;
        this.habits=habits;
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

    public abstract void respond();

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

    /*@Override
    protected void finalize() throws Throwable {
        throw new UnsupportedOperationException("finalize method is not supported");
        System.out.println("Pet object is removed");
    }*/

}