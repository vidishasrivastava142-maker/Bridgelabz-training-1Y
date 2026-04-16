public class Card {
    public static void main(String[] args) {

        String s = "4123456789012345";

        System.out.println(s.matches("^4\\d{15}$|^5\\d{15}$"));
    }
}