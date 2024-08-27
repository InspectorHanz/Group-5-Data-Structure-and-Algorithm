package LibraryManagement;

public class Book {
    private int id;
    private String title;
    private String author;

    // Constructor
    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    // Getter Methods
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Display Book Details
    public void display() {
        System.out.println("ID: " + id + ", Title: " + title + ", Author: " + author);
    }
}
