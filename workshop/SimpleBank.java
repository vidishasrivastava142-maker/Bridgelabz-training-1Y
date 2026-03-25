class InsufficientBalanceException extends Exception {}

class SimpleBank {
    public static void main(String[] args) {

        double balance = 1000;
        double amount = 2000;

        try {
            if (amount < 0) {
                throw new IllegalArgumentException();
            }

            if (amount > balance) {
                throw new InsufficientBalanceException();
            }

            balance = balance - amount;
            System.out.println("Withdrawal successful");

        } catch (InsufficientBalanceException e) {
            System.out.println("Insufficient balance!");

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid amount!");
        }
    }
}