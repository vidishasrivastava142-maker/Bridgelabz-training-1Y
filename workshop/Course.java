class Course {
    int courseId;
    String courseName;
    double price;
    static String platformName = "LearnX";

    Course(int id, String name, double price) {
        courseId = id;
        courseName = name;
        this.price = price;
    }

    double getFinalPrice() {
        return price;
    }

    String formatName() {
        String[] words = courseName.split(" ");
        String result = "";
        for (String w : words) {
            result += Character.toUpperCase(w.charAt(0)) + w.substring(1).toLowerCase() + " ";
        }
        return result.trim();
    }
}