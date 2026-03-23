class Account {
    int accountNumber;
    double balance;
    static String bankName = "ABC Bank";

    Account(int acc, double bal) {
        accountNumber = acc;
        balance = bal;
    }

    double calculateInterest() {
        return 0;
    }
}