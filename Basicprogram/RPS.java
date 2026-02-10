import java.util.Scanner;

class RPS {

    static String compChoice() {
        int r = (int)(Math.random() * 3);
        if (r == 0) return "rock";
        if (r == 1) return "paper";
        return "scissors";
    }

    static int winner(String u, String c) {
        if (u.equals(c)) return 0;
        if ((u.equals("rock") && c.equals("scissors")) ||
            (u.equals("paper") && c.equals("rock")) ||
            (u.equals("scissors") && c.equals("paper")))
            return 1;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int games = sc.nextInt();
        int user = 0, comp = 0;

        for (int i = 0; i < games; i++) {
            String u = sc.next();
            String c = compChoice();

            int w = winner(u, c);
            if (w == 1) user++;
            if (w == -1) comp++;
        }

        System.out.println("User wins: " + user);
        System.out.println("Computer wins: " + comp);
    }
}
