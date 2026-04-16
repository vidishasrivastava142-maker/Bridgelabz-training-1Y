import java.util.regex.*;

public class Links {
    public static void main(String[] args) {

        String text = "https://google.com http://example.org";

        Matcher m = Pattern.compile("https?://\\S+").matcher(text);

        while (m.find()) System.out.println(m.group());
    }
}