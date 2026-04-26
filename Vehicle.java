abstract class Vehicle {
    private String number;
    private double rate;

    public Vehicle(String number, double rate) {
        this.number = number;
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    abstract double calculateRentalCost(int days);
}
interface Insurable {
    double calculateInsurance();
}
class Car extends Vehicle implements Insurable {

    public Car(String number, double rate) {
        super(number, rate);
    }

    double calculateRentalCost(int days) {
        return getRate() * days;
    }

    public double calculateInsurance() {
        return 500;
    }
}