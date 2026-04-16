import java.util.regex.*;

public class Emails {
    public static void main(String[] args) {

        String text = "support@example.com info@company.org";

        Matcher m = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-z]{2,}").matcher(text);

        while (m.find()) System.out.println(m.group());
    }
}