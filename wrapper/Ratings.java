import java.util.*;
import java.util.stream.*;

public class Ratings {
    public static void main(String[] args) {
        int[] arr = {4, 5, 3};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, null, 4));

        ArrayList<Integer> combined = new ArrayList<>();

        for (int num : arr) {
            combined.add(num);  
        }

        combined.addAll(list);

        double avg = combined.stream()
                .filter(Objects::nonNull)
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        System.out.println("Average Rating: " + avg);
    }
}