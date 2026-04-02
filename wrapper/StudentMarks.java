import java.util.*;

public class StudentMarks {
    public static void main(String[] args) {
        Object[] data = {"85", 95, Integer.valueOf(88), "null", "abc"};

        ArrayList<Integer> validMarks = new ArrayList<>();

        for (Object obj : data) {
            try {
                if (obj instanceof Integer) {
                    validMarks.add((Integer) obj);
                } else if (obj instanceof String && !obj.equals("null")) {
                    validMarks.add(Integer.parseInt((String) obj));
                }
            } catch (Exception e) {
                // ignore invalid
            }
        }

        double avg = validMarks.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        System.out.println("Average Marks: " + avg);
    }
}