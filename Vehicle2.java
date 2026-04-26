class Vehicle2 {
    int maxSpeed;
    String fuelType;

    void displayInfo() {
        System.out.println("Speed: " + maxSpeed + ", Fuel: " + fuelType);
    }
}

class Car extends Vehicle2 {
    int seatCapacity;

    @Override
    void displayInfo() {
        System.out.println("Car seats: " + seatCapacity);
    }
}

class Truck extends Vehicle2 {
    int loadCapacity;

    @Override
    void displayInfo() {
        System.out.println("Truck load: " + loadCapacity);
    }
}

class Motorcycle extends Vehicle2 {
    boolean hasGear;

    @Override
    void displayInfo() {
        System.out.println("Motorcycle gear: " + hasGear);
    }
}

public class Test {
    public static void main(String[] args) {
        Vehicle2 [] v = {
            new Car(),
            new Truck(),
            new Motorcycle()
        };

        for (Vehicle2 obj : v) {
            obj.displayInfo();
        }
    }
}