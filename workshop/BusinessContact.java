class BusinessContact extends Contact {
    String companyName;

    BusinessContact(String name, String phone, String company) {
        super(name, phone);
        companyName = company;
    }

    void display() {
        System.out.println(name.toUpperCase() + " " + phoneNumber + " " + companyName);
    }
}