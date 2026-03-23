class Main9 {
    public static void main(String[] args) {
        Course c;

        c = new RecordedCourse(1, "java programming", 1000);
        System.out.println(c.formatName() + " " + c.getFinalPrice());

        c = new LiveCourse(2, "data science", 2000);
        System.out.println(c.formatName() + " " + c.getFinalPrice());
    }
}