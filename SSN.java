public class SSN {
    public static void main(String[] args) {

        String s = "123-45-6789";

        System.out.println(s.matches("^\\d{3}-\\d{2}-\\d{4}$"));
    }
}