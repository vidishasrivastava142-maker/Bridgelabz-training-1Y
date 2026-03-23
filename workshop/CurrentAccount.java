class CurrentAccount extends Account {
    CurrentAccount(int acc, double bal) {
        super(acc, bal);
    }

    double calculateInterest() {
        return balance * 0.02;
    }
}