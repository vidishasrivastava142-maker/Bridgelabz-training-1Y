abstract class BankAccount {
    private double balance;

    public void deposit(double amt) {
        balance += amt;
    }

    public void withdraw(double amt) {
        balance -= amt;
    }

    public double getBalance() {
        return balance;
    }

    abstract double calculateInterest();
}
class SavingsAccount extends BankAccount {
    double calculateInterest() {
        return getBalance() * 0.04;
    }
}
interface Loanable {
    void applyForLoan();
}