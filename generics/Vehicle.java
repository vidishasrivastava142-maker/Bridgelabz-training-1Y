import java.util.*;

class Vehicle {
    String name;
    Vehicle(String name) { this.name = name; }
}

class Truck extends Vehicle {
    Truck(String name) { super(name); }
}

class Bike extends Vehicle {
    Bike(String name) { super(name); }
}

class FleetManager<T extends Vehicle> {
    List<T> list = new ArrayList<>();

    void addVehicle(T v) {
        list.add(v);
    }

    void showFleet() {
        for (T v : list) {
            System.out.println(v.name);
        }
    }

    public static void main(String[] args) {
        FleetManager<Truck> fm = new FleetManager<>();
        fm.addVehicle(new Truck("Truck1"));
        fm.showFleet();
    }
}