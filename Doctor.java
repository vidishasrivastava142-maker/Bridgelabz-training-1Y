import java.util.*;

class Doctor {
    String name, day, specialty;

    Doctor(String n, String d, String s) {
        name = n;
        day = d;
        specialty = s;
    }
}

public class Doctors {
    public static void main(String[] args) {

        List<Doctor> list = Arrays.asList(
            new Doctor("A", "Weekend", "Cardio"),
            new Doctor("B", "Weekday", "Neuro"),
            new Doctor("C", "Weekend", "Ortho")
        );

        list.stream()
            .filter(d -> d.day.equals("Weekend"))
            .sorted((a, b) -> a.specialty.compareTo(b.specialty))
            .forEach(d -> System.out.println(d.name));
    }
}