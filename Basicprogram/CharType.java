import java.util.Scanner;

class CharType {

    static String check(char ch) {
        if (ch >= 'A' && ch <= 'Z') ch = (char)(ch + 32);

        if (ch >= 'a' && ch <= 'z') {
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                return "Vowel";
            else
                return "Consonant";
        }
        return "Not a Letter";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println("Char\tType");
        for (int i = 0; i < s.length(); i++)
            System.out.println(s.charAt(i) + "\t" + check(s.charAt(i)));
    }
}
