package com.university.department.cse;

public class Course {
    public void show() {
        System.out.println("Course: B.Tech CSE");
    }
}
import com.university.department.cse.Course;

public class MainApp {
    public static void main(String[] args) {
        Course c = new Course();
        c.show();
    }
}
