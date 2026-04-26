class Vehicle3 {
    int speed;
}

interface Refuelable {
    void refuel();
}

class PetrolVehicle extends Vehicle3 implements Refuelable {
    public void refuel() {
        System.out.println("Refueling petrol");
    }
}

class ElectricVehicle extends Vehicle3 {
    void charge() {
        System.out.println("Charging battery");
    }
}