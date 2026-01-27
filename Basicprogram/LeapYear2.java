import java.util.Scanner;

class LeapYear2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
		    if (y >= 1582 && (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)))
            System.out.println("leap");
        else
            System.out.println("not leap");
    }
}
