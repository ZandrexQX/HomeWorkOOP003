import java.util.ArrayList;
import java.util.List;

public class Controller {
    private StudentGroupService sgs;
    public Controller(List<Student> students, Teacher teacher){
        this.sgs = new StudentGroupService(students, teacher);
    }
    public List<Long> studentsID(){
        List<Long> studentsID = new ArrayList<>();
        for (Student student:sgs.getSg().getStudents()) {
            studentsID.add(student.getStudentId());
        }
        return studentsID;
    }
    public Long teacherID(){
        return sgs.getTeacher().getTeacherId();
    }
}
