class Device {
    int deviceId;
    String status;
}

class Thermostat extends Device {
    int temperature;

    void displayStatus() {
        System.out.println("Temp: " + temperature);
    }
}