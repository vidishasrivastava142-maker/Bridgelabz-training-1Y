public class Censor {
    public static void main(String[] args) {

        String s = "damn stupid text";

        System.out.println(s.replaceAll("damn|stupid", "****"));
    }
}