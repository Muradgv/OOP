package happyfamily_v2.src;
import java.util.Arrays;
import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private String[][] schedule;
    private Family family;

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.schedule = schedule;
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human father, Human mother) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human() {
    }

    public void greetpet() {
        System.out.println("Hello, " + pet.nickname);

    }

    public void describepet() {
        String isitsly = pet.tricklevel > 50 ? "sly" : "not sly";
        System.out.printf("I have a %s who is %d years old, he is %s\n", pet.species, pet.age, isitsly);

    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public boolean equals(Object temp) {
        if (this == temp){
            return true;
        }
        Human human = (Human) temp;
        return year == human.year && Objects.equals(name, human.name) && Objects.equals(surname, human.surname);
    }

    public String toString() {
        return String.format("Human{name='%s', surname='%s', year=%d, iq=%d, schedule=%s}", name, surname, year,
                iq, Arrays.deepToString(schedule)
        );
    }
}