import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        CountingWords.main(args);

        Student student1 = new Student("047", "Ben", "Dover");
        student1.addGrade("math", 10);
        student1.addGrade("english", 9);
        Student student2 = new Student("088", "Marry", "Jane");
        student2.addGrade("math", 7);
        student2.addGrade("english", 9);
        Student student3 = new Student("141", "Michael", "Jordan");
        student3.addGrade("math", 8);
        student3.addGrade("english", 10);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        System.out.println("\naverage grades:");
        Collections.sort(students);
        for (Student student : students)
        {
            System.out.println(student);
        }

        System.out.println("\nlast names:");
        Collections.sort(students, new StudentLastNameComparator());
        for (Student student : students)
        {
            System.out.println(student);
        }
    }
}