import java.util.*;

public class EmployeeAges {
    public static void main(String[] args) {

        int[] ages = {25, 30, 22, 40, 28};

        ArrayList<Integer> list = new ArrayList<>();

        for (int age : ages) {
            list.add(age);
        }

        int min = Collections.min(list);
        int max = Collections.max(list);

        System.out.println("Youngest Age: " + min);
        System.out.println("Oldest Age: " + max);
    }
}