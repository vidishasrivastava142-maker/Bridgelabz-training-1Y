import java.util.ArrayList;

class Program7 {
    public static void main(String[] args) {
        double[] prices = {10.5, 20.0, 35.75, 5.5};

        ArrayList<Double> list = new ArrayList<>();

        for (double p : prices) {
            list.add(p);
        }

        double max = list.get(0);
        double sum = 0;

        for (double x : list) {
            if (x > max) {
                max = x;
            }
            sum = sum + x;
        }

        double avg = sum / list.size();

        System.out.println(max);
        System.out.println(avg);
    }
}