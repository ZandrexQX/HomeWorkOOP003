import java.util.List;

public class Controller {
    private StudentGroupService sgs;
    public Controller(List<Student> students, Teacher teacher){
        this.sgs = new StudentGroupService(students, teacher);
    }
    public void studentsID(){

    }
}
