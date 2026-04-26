import java.time.LocalDate;

interface DateUtil {
    static String formatDate(LocalDate date) {
        return date.toString();
    }
}