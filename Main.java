import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Ivan", "Petrov",
                "Petrovich", LocalDate.now());
        Student s1 = new Student("Alex","Voronov",
                "Ivanovich",LocalDate.now());
        Student s2 = new Student("Ivan","Voronoi",
                "Ivanovich",LocalDate.now());
        Student s3 = new Student("Petr","Ivanov",
                "Ivanovich",LocalDate.now());

        Controller c1 = new Controller(Arrays.asList(s1,s2,s3),t1);
        Viewer.printStudentsId(c1);
        Viewer.printTeacherId(c1);
    }
}
