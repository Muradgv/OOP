package happyfamily_v4.src;
import java.util.Arrays;
import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private String[][] schedule;
    private Family family;

    //constructors
    public Human(String name, String surname, int year, int iq, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    //getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getIq() {
        return iq;
    }
    public void setIq(int iq) {
        this.iq = iq;
    }
    public String[][] getSchedule() {
        return schedule;
    }
    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }
    public Family getFamily() {
        return family;
    }
    public void setFamily(Family family) {
        this.family = family;
    }

    //Functions
    public void greetpet() {
        System.out.println("Hello, " + family.getPet().getNickname());

    }
    public void describepet() {
        Pet pet=family.getPet();
        String isitsly =  pet.gettricklevel()> 50 ? "sly" : "not sly";
        System.out.printf("I have a %s who is %d years old, he is %s\n", pet.getSpecies(), pet.getAge(), isitsly);

    }


    public boolean equals(Object temp) {
        if (this == temp){
            return true;
        }
        Human human = (Human) temp;
        return year == human.year && Objects.equals(name, human.name) && Objects.equals(surname, human.surname);
    }

    @Override
    public String toString() {
        return String.format("Human{name='%s', surname='%s', year=%d, iq=%d, schedule=%s}", name, surname, year,
                iq, Arrays.deepToString(schedule)
        );
    }

    /*@Override
    protected void finalize() throws Throwable {
        throw new UnsupportedOperationException("finalize method is not supported");
        System.out.println("Human object is removed");
    }*/

    public static void main(String[] args) {
        for (int i = 10_000; i < 10_000_000; i++) {
            new Human("Unknown", "Unknown", 0);
        }
        System.gc();
    }
}