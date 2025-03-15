package Task;

public class Student implements Comparable<Student>{
    private String name;
    private String surname;
    private int id;
    private int grade;
    private Boolean isfemale;
    private int birthdate;

    public Student(String name, String surname, int id, int grade, Boolean isfemale, int birthdate) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.grade = grade;
        this.isfemale = isfemale;
        this.birthdate = birthdate;
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
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public int getBirthdate() {
        return birthdate;
    }
    public void setBirthdate(int birthdate) {
        this.birthdate = birthdate;
    }
    public Boolean getIsfemale() {
        return isfemale;
    }
    public void setIsfemale(Boolean isfemale) {
        this.isfemale = isfemale;
    }


    @Override
    public int compareTo(Student that) {
        return Long.compare(this.id, that.id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                ", grade=" + grade +
                ", isfemale=" + isfemale +
                ", birthdate=" + birthdate +
                "}" + System.lineSeparator();
    }
}
