package happyfamily_v2.src;

import java.util.Arrays;
import java.util.Objects;

public class Pet {
    public String species;
    public String nickname;
    public int age;
    public int tricklevel;
    public String[] habits;

    public Pet(String species, String nickname, int age, int tricklevel, String[] habits){
        this.species=species;
        this.nickname=nickname;
        this.age=age;
        this.tricklevel=tricklevel;
        this.habits=habits;
    }

    public Pet(){
    }

    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

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


    public String toString() {
        return species + "{nickname='" + nickname + "', age=" + age + ", trickLevel=" + tricklevel + ", habits=" + Arrays.toString(habits) + "}";
    }

}