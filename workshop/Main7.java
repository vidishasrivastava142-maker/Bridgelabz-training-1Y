class Main7 {
    public static void main(String[] args) {
        Student s;

        s = new Student(1, "John", 85);
        System.out.println(s.calculateGrade());

        s = new EngineeringStudent(2, "Alice", 92, "CSE");
        System.out.println(s.calculateGrade());
    }
}