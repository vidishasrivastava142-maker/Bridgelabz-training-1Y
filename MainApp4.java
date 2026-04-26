package college.student;
public class Student {
    public void show() {
        System.out.println("Student Info");
    }
}
package college.faculty;
public class Faculty {
    public void show() {
        System.out.println("Faculty Info");
    }
}
package college.department;
public class Department {
    public void show() {
        System.out.println("CSE Department");
    }
}
package college.main;

import college.student.*;
import college.faculty.*;
import college.department.*;

public class MainApp4 {
    public static void main(String[] args) {
        new Student().show();
        new Faculty().show();
        new Department().show();
    }
}