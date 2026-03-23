class Main3 {
    public static void main(String[] args) {
        Account a;

        a = new SavingsAccount(1, 1000);
        System.out.println(a.calculateInterest());

        a = new CurrentAccount(2, 1000);
        System.out.println(a.calculateInterest());
    }
}