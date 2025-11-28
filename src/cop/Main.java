package cop;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student>students = new ArrayList<>();
        students.add(new Student("Ali", 17.8));
        students.add(new Student("Sara", 19.1));
        students.add(new Student("Reza", 16.4));

        Collections.sort(students);

        for (Student s : students) {
            System.out.println(s);
        }
    }
}
