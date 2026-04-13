import java.util.*;

abstract class CourseType {}

class ExamCourse extends CourseType {}

class Course<T extends CourseType> {
    T type;
    Course(T type) { this.type = type; }
}

class Test {
    static void show(List<? extends CourseType> list) {
        System.out.println(list);
    }

    public static void main(String[] args) {
        show(Arrays.asList(new ExamCourse()));
    }
}