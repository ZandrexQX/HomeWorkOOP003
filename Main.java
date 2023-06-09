import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Ivan", "Petrov","Petrovich", LocalDate.now());
        Teacher t2 = new Teacher("Oleg", "Petrov","Petrovich", LocalDate.now());
        Teacher t3 = new Teacher("Petr", "Orlov","Petrovich", LocalDate.now());
        Teacher t4 = new Teacher("Alex", "Orlov","Petrovich", LocalDate.now());

        TeacherGroup tg = new TeacherGroup(List.of(t1,t2,t3,t4));

        System.out.println(tg.getTeachers());
    }
}
