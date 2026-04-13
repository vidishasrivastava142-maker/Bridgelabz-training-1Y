import java.util.*;

abstract class JobRole {}

class SoftwareEngineer extends JobRole {}

class Resume<T extends JobRole> {
    T role;
    Resume(T role) { this.role = role; }
}

class Test {
    static void process(List<? extends JobRole> list) {
        System.out.println(list);
    }

    public static void main(String[] args) {
        process(Arrays.asList(new SoftwareEngineer()));
    }
}