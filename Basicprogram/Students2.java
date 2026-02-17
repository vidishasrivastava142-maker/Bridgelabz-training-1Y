class Students2 {

    public int rollNumber;
    protected String name;
    private double CGPA;

    public void setCGPA(double c) {
        CGPA = c;
    }

    public double getCGPA() {
        return CGPA;
    }
}

class PostgraduateStudent extends Students2 {

    void display() {
        System.out.println(rollNumber + " " + name);
    }
}
