import java.util.List;

public class TeacherGroup implements Iterable<Teacher>{
    private List<Teacher> teachers;
    private String specialisation;

    public TeacherGroup(List<Teacher> teachers, String specialisation) {
        this.teachers = teachers;
        this.specialisation = specialisation;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    @Override
    public String toString() {
        return "TeacherGroup{" +
                "teachers=" + teachers +
                "specialisation=" + specialisation +
                '}';
    }

    @Override
    public TeacherGroupIterator iterator() {
        return new TeacherGroupIterator(this);
    }
}
