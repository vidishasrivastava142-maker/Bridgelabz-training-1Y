public class FactorTasks {

    public static int[] getFactors(int n) {

        int count = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0) count++;

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= n; i++)
            if (n % i == 0) factors[index++] = i;

        return factors;
    }

    public static int sum(int[] arr) {
        int s = 0;
        for (int i : arr) s += i;
        return s;
    }

    public static int product(int[] arr) {
        int p = 1;
        for (int i : arr) p *= i;
        return p;
    }

    public static double productCube(int[] arr) {
        double p = 1;
        for (int i : arr)
            p *= Math.pow(i, 3);
        return p;
    }

    public static void main(String[] args) {

        int n = 6;
        int[] factors = getFactors(n);

        System.out.println("Sum: " + sum(factors));
        System.out.println("Product: " + product(factors));
        System.out.println("Product of cubes: " + productCube(factors));
    }
}
