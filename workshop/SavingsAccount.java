class SavingsAccount extends Account {
    SavingsAccount(int acc, double bal) {
        super(acc, bal);
    }

    double calculateInterest() {
        return balance * 0.04;
    }
}