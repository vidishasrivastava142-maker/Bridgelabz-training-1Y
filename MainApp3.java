package com.company.hr;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public void display() {
        System.out.println(id + " " + name + " " + salary);
    }
}
package com.company.payroll;
import com.company.hr.Employee;

public class Payroll {
    public void calculateBonus(Employee e) {
        e.setSalary(e.getSalary() * 1.1);
    }
}
package com.company.main;

import com.company.hr.*;
import com.company.payroll.*;

public class MainApp3 {
    public static void main(String[] args) {
        Employee e = new Employee(1,"Vidisha",50000);
        Payroll p = new Payroll();

        p.calculateBonus(e);
        e.display();
    }
}
