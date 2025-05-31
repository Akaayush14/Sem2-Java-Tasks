class Book {
    private String title;
    private String author;
    private int year;
    private boolean available;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.available = true;
    }

    public boolean isAvailable() {
        return available;
    }

    public void borrowBook() {
        if (available) available = false;
    }

    public void returnBook() {
        available = true;
    }

    public String getDetails() {
        return title + " by " + author + " (" + year + ")";
    }

    public static void main(String[] args) {
        Book b = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", 1997);
        System.out.println(b.getDetails() + " - Available: " + b.isAvailable());
        b.borrowBook();
        System.out.println("After Borrowing - Available: " + b.isAvailable());
    }
}