import java.util.*;

public class PerformanceTest {
    public static void main(String[] args) {

        int n = 1_000_000;

        
        long start1 = System.currentTimeMillis();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }

        long sum1 = 0;
        for (int num : arr) {
            sum1 += num;
        }

        long end1 = System.currentTimeMillis();

        
        long start2 = System.currentTimeMillis();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i); 
        }

        long sum2 = 0;
        for (Integer num : list) {
            sum2 += num; 
        }

        long end2 = System.currentTimeMillis();

        System.out.println("int[] time: " + (end1 - start1) + " ms");
        System.out.println("ArrayList time: " + (end2 - start2) + " ms");
    }
}