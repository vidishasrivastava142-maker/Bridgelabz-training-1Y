package com.school.data;

public class Student {
    String name;
    int m1, m2, m3;

    public Student(String name, int m1, int m2, int m3) {
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public String toString() {
        return name + " Marks: " + m1 + "," + m2 + "," + m3;
    }
}
package com.school.util;
import com.school.data.Student;

public class Analyzer {
    public double avg(Student s) {
        return (s.m1 + s.m2 + s.m3)/3.0;
    }

    public String grade(double avg) {
        return avg > 75 ? "A" : "B";
    }
}