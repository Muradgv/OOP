package happyfamily_v2.src;

import happyfamily.src.Pet;

public class Human{
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private String[][] schedule;
    private Family family;

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public Human(String name, String surname, int year, Human father, Human mother) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.father = father;
        this.mother = mother;
    }

    public Human() {}

    public void greetpet(){
        System.out.println("Hello, " + pet.nickname);

    }

    public void describepet(){
        String isitsly = pet.tricklevel > 50 ? "sly" : "not sly";
        System.out.printf("I have a %s who is %d years old, he is %s\n", pet.species, pet.age, isitsly);

    }

    public String toString() {
        return "Human{name='" + name + "', surname='" + surname + "', year=" + year + ", iq=" + iq +
                ", mother=" + (mother != null ? mother.name + " " + mother.surname : "null") +
                ", father=" + (father != null ? father.name + " " + father.surname : "null") +
                ", pet=" + (pet != null ? pet.toString() : "null") + "}";
    }
}