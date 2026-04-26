abstract class Patient {
    abstract double calculateBill();
}

class InPatient extends Patient {
    double calculateBill() {
        return 5000;
    }
}