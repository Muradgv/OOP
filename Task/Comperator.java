package Task;
import java.util.Comparator;

public class Comperator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        int comparegrade = student2.getGrade() - student1.getGrade();
        if(comparegrade == 0){
            int compbirthdate = student1.getBirthdate() - student2.getBirthdate();
            if(compbirthdate == 0){
                int compisfemale = Boolean.compare(student2.getIsfemale(), student1.getIsfemale());
                return compisfemale;
            }
            else{
                return compbirthdate;
            }
        }else{
            return comparegrade;
        }
    }
}
