public class Viewer {
    public static void printStudentsId(Controller c1){
        System.out.println("Students id:");
        for (Long id :
                c1.studentsID()) {
            System.out.println(id);
        }
    }
    public static void printTeacherId(Controller c1){
        System.out.println("Teacher id:" + c1.teacherID());
    }
}
