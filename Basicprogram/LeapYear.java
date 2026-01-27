import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        if (y < 1582)
            System.out.println("invalid");
        else if (y % 400 == 0)
            System.out.println("leap");
        else if (y % 100 == 0)
            System.out.println("not leap");
        else if (y % 4 == 0)
            System.out.println("leap");
        else
            System.out.println("not leap");
    }
}