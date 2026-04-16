interface LightAction {
    void execute();
}

public class SmartHome {
    public static void main(String[] args) {

        LightAction motion = () -> System.out.println("Light ON");
        LightAction night = () -> System.out.println("Dim Light ON");
        LightAction voice = () -> System.out.println("Color Changed");

        motion.execute();
        night.execute();
        voice.execute();
    }
}