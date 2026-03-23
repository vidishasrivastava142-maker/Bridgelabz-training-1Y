class Employee {
    int empId;
    String name;

    Employee(int id, String name) {
        empId = id;
        this.name = name;
    }

    String generateEmail() {
        return name.toLowerCase() + "@company.com";
    }
}