abstract class Vehicle2 {
    double rate;

    abstract double calculateFare(double distance);
}

class Car extends Vehicle2 {
    double calculateFare(double d) {
        return d * rate;
    }
}