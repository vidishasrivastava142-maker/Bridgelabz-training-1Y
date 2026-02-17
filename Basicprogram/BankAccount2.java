class BankAccount2 {

    String accountHolder;
    int accountNumber;
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (balance >= amount)
            balance -= amount;
        else
            System.out.println("Insufficient Balance");
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount2 b = new BankAccount2();
        b.accountHolder = "Amit";
        b.accountNumber = 12345;
        b.balance = 1000;

        b.deposit(500);
        b.withdraw(300);
        b.displayBalance();
    }
}
