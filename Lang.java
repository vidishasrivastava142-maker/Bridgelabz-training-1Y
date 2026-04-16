import java.util.regex.*;

public class Lang {
    public static void main(String[] args) {

        String text = "Java Python JavaScript Go";

        Matcher m = Pattern.compile("\\b(Java|Python|JavaScript|Go)\\b").matcher(text);

        while (m.find()) System.out.println(m.group());
    }
}