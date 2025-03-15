package Task;
import java.util.Arrays;
import java.util.Comparator;

public class StudentApp {
    public static void main(String[] args) {
        Student[] students = init();
        System.out.println(Arrays.toString(students));
        Arrays.sort(students, new Comperator());
        System.out.println(Arrays.toString(students));




    }


    public static Student[] init() {
        return new Student[]{
                new Student("Marie", "Curie", 300, 95, true,2005),
                new Student("Arzu", "babayeva", 250, 80, true,2005),
                new Student("elmir", "abbasov", 250, 100, false,2000),
                new Student("Leo", "Messi", 100, 50, false,2003),
                new Student("Abbas", "zeynalov", 150, 80, false,2003),
                new Student("July", "Smith", 120, 70, true,1990),
        };
    }
}
