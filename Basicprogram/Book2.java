class Book2 {

    public String ISBN;
    protected String title;
    private String author;

    public void setAuthor(String a) {
        author = a;
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends Book2 {

    void display() {
        System.out.println(ISBN + " " + title);
    }
}
