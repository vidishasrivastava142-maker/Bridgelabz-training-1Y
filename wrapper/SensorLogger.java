import java.util.*;

public class SensorLogger {

    public static void logTemperature(Double temp) {
        System.out.println("Stored Temp: " + temp);
    }

    public static void main(String[] args) {
        double primitiveTemp = 36.5;

        logTemperature(primitiveTemp); // auto-boxing

        Double wrapperTemp = 40.2;
        double value = wrapperTemp; // auto-unboxing

        System.out.println("Read Temp: " + value);
    }
}