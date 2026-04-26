package college.student;

public class Student {
    public void display() {
        System.out.println("Name: Vidisha, Roll: 101");
    }
}
package college.faculty;

public class Faculty {
    public void display() {
        System.out.println("Faculty: Dr. Sharma, Subject: Java");
    }
}
import college.student.Student;
import college.faculty.Faculty;

public class MainApp {
    public static void main(String[] args) {
        Student s = new Student();
        Faculty f = new Faculty();

        s.display();
        f.display();
    }
}