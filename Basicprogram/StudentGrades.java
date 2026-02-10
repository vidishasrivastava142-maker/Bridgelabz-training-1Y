import java.util.Random;

class StudentGrades {

    static int[][] generateScores(int n) {
        Random r = new Random();
        int[][] pcm = new int[n][3];

        for (int i = 0; i < n; i++) {
            pcm[i][0] = r.nextInt(90) + 10;
            pcm[i][1] = r.nextInt(90) + 10;
            pcm[i][2] = r.nextInt(90) + 10;
        }
        return pcm;
    }

    static double percentage(int total) {
        return Math.round((total / 300.0) * 100 * 100) / 100.0;
    }

    static char grade(double p) {
        if (p >= 80) return 'A';
        else if (p >= 70) return 'B';
        else if (p >= 60) return 'C';
        else if (p >= 50) return 'D';
        else if (p >= 40) return 'E';
        else return 'R';
    }

    public static void main(String[] args) {

        int[][] pcm = generateScores(5);

        System.out.println("Phy Chem Math Total Avg % Grade");

        for (int i = 0; i < pcm.length; i++) {
            int total = pcm[i][0] + pcm[i][1] + pcm[i][2];
            double avg = total / 3.0;
            double per = percentage(total);
            char g = grade(per);

            System.out.println(
                pcm[i][0] + "  " +
                pcm[i][1] + "  " +
                pcm[i][2] + "  " +
                total + "  " +
                avg + "  " +
                per + "  " +
                g
            );
        }
    }
}