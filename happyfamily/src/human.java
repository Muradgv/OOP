package happyfamily.src;

import happyfamily.src.pet;

public class human{
    private String name;
    private String surname;
    private int year;
    private int iq;
    private pet pet;
    private human mother;
    private human father;
    private String[][] schedule;
    public human(String name, String surname, int year, int iq, pet pet, human mother, human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }
    public human() {
    }

    public void greetpet(){
        System.out.printf("Hello, %s", pet.nickname);

    }
    public void describepet(){
        System.out.printf("I have an %s is %d years old, he is very sly",pet.species,pet.age);


    }

}