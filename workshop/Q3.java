class InvalidAgeException extends Exception {}

class Q3 {
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) throw new InvalidAgeException();
        else System.out.println("Access granted!");
    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("Age must be 18 or above");
        }
    }
}