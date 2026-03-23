class Manager extends Employee {
    String department;

    Manager(int id, String name, String dept) {
        super(id, name);
        department = dept;
    }

    String generateEmail() {
        return name.toLowerCase() + "." + department.toLowerCase() + "@company.com";
    }
}