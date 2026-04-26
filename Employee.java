abstract class Employee {
    private int id;
    private String name;
    private double baseSalary;

    public Employee(int id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Getter
    public double getBaseSalary() {
        return baseSalary;
    }

    public String getName() {
        return name;
    }

    // Abstract method
    abstract double calculateSalary();

    // Concrete method
    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}
interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}
class FullTimeEmployee extends Employee implements Department {
    private String department;

    public FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    public double calculateSalary() {
        return getBaseSalary(); // fixed
    }

    public void assignDepartment(String dept) {
        this.department = dept;
    }

    public String getDepartmentDetails() {
        return department;
    }
}
class PartTimeEmployee extends Employee implements Department {
    private int hours;
    private String department;

    public PartTimeEmployee(int id, String name, double rate, int hours) {
        super(id, name, rate);
        this.hours = hours;
    }

    public double calculateSalary() {
        return getBaseSalary() * hours;
    }

    public void assignDepartment(String dept) {
        this.department = dept;
    }

    public String getDepartmentDetails() {
        return department;
    }
}
public class Main {
    public static void main(String[] args) {
        Employee[] emp = {
            new FullTimeEmployee(1, "A", 50000),
            new PartTimeEmployee(2, "B", 200, 20)
        };

        for (Employee e : emp) {
            e.displayDetails();
            System.out.println("Salary: " + e.calculateSalary());
        }
    }
}