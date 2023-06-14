import java.time.LocalDate;
import java.util.Comparator;

public class Teacher extends User{

    private static Long teacherId;

    public Teacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
        teacherId++;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public static class TeacherComparator implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    }
}
