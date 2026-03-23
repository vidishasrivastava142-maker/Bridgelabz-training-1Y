class Contact {
    String name;
    String phoneNumber;

    Contact(String name, String phone) {
        this.name = name;
        phoneNumber = phone;
    }

    void display() {
        System.out.println(name + " " + phoneNumber);
    }
}