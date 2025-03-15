package Task;
import java.util.Comparator;

public class SortbyGrade implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return student2.getGrade() - student1.getGrade();
    }
}
