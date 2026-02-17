class Employee2 {

    public int employeeID;
    protected String department;
    private double salary;

    public void setSalary(double s) {
        salary = s;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee2 {

    void display() {
        System.out.println(employeeID + " " + department);
    }
}
