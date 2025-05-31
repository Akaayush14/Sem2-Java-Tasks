class EncapBook {
    private String title;
    private String author;
    private int publicationYear;
    private boolean isAvailable;  
    public EncapBook(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.publicationYear = year;
        this.isAvailable = true; 
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int year) {
        this.publicationYear = year;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed \"" + title + "\".");
        } else {
            System.out.println("Sorry, the book \"" + title + "\" is currently unavailable.");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("Thank you for returning \"" + title + "\".");
    }

    public void displayInfo() {
        System.out.println("Book: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + publicationYear);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        EncapBook book = new EncapBook("Atomic Habits", "James Clear", 2015);
        book.displayInfo();

        book.borrowBook(); 
        book.displayInfo(); 

        book.borrowBook(); 

        book.returnBook(); 
        book.displayInfo(); 
    }
}


