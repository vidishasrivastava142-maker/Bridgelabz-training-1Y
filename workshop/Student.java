class Student {
    int rollNo;
    String name;
    int marks;

    Student(int r, String n, int m) {
        rollNo = r;
        name = n;
        marks = m;
    }

    String calculateGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 70) return "B";
        else return "C";
    }
}