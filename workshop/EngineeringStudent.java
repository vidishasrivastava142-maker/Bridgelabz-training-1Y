class EngineeringStudent extends Student {
    String branch;

    EngineeringStudent(int r, String n, int m, String b) {
        super(r, n, m);
        branch = b;
    }

    String calculateGrade() {
        return name + "-" + branch + " : " + super.calculateGrade();
    }
}