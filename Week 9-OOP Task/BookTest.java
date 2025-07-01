class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class FictionBook extends Book {
    FictionBook(String title, String author) {
        super(title, author);
    }
}

class NonFictionBook extends Book {
    NonFictionBook(String title, String author) {
        super(title, author);
    }
}

class TechnicalBook extends Book {
    TechnicalBook(String title, String author) {
        super(title, author);
    }
}

public class BookTest {
    public static void main(String[] args) {
        FictionBook fb = new FictionBook("Harry Potter", "J.K. Rowling");
        NonFictionBook nfb = new NonFictionBook("Sapiens", "Yuval Noah Harari");
        TechnicalBook tb = new TechnicalBook("Java Programming", "James Gosling");

        System.out.println("Fiction Book Details:");
        fb.displayDetails();

        System.out.println("\nNon-Fiction Book Details:");
        nfb.displayDetails();

        System.out.println("\nTechnical Book Details:");
        tb.displayDetails();
    }
}
