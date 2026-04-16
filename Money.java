import java.util.regex.*;

public class Money {
    public static void main(String[] args) {

        String text = "$45.99 10.50";

        Matcher m = Pattern.compile("\\$?\\d+\\.\\d+").matcher(text);

        while (m.find()) System.out.println(m.group());
    }
}