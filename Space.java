public class Space {
    public static void main(String[] args) {

        String s = "This   is   text";

        System.out.println(s.replaceAll("\\s+", " "));
    }
}