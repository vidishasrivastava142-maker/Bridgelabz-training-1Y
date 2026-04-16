public class IP {
    public static void main(String[] args) {

        String s = "192.168.1.1";

        System.out.println(s.matches("^((25[0-5]|2[0-4]\\d|1\\d\\d|\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|1\\d\\d|\\d\\d?)$"));
    }
}