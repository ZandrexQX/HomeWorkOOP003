import java.util.List;

public class StudentGroupService {
    private StudentGroup sg;
    public StudentGroupService(List<Student> students, Teacher teacher){
        this.sg = new StudentGroup(students,teacher);
    }

    public StudentGroup getSg() {
        return sg;
    }
}
