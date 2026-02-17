class MovieTicket {

    String movieName;
    int seatNumber;
    double price;

    void bookTicket(String name, int seat, double cost) {
        movieName = name;
        seatNumber = seat;
        price = cost;
    }

    void display() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat No: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        MovieTicket t = new MovieTicket();
        t.bookTicket("Avengers", 12, 250);
        t.display();
    }
}
