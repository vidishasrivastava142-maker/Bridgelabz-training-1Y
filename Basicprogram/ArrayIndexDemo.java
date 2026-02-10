class ArrayIndexDemo {
    static void generate(String[] names) {
        System.out.println(names[10]);
    }

    static void handle(String[] names) {
        try {
            System.out.println(names[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled");
        }
    }

    public static void main(String[] args) {
        String[] names = {"A", "B", "C"};

       
        handle(names);
    }
}
