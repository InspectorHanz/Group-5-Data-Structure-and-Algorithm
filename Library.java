package LibraryManagement;

public class Library {
    private ArrayListADT books;

    // Constructor
    public Library() {
        books = new ArrayListADT();
    }

    // CRUD Operations
    public void addBook(int id, String title, String author) {
        books.add(id);
        System.out.println("Book with ID " + id + " added to the library.");
    }

    public void removeBook(int index) {
        try {
            books.remove(index);
            System.out.println("Book removed from index " + index + ".");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid index. No book removed.");
        }
    }

    public Book getBook(int index) {
        try {
            int bookId = books.get(index);
            // Here you would normally retrieve the book details based on the ID
            // For simplicity, we're just displaying the ID.
            System.out.println("Book ID at index " + index + ": " + bookId);
            return null; // Placeholder
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid index. No book found.");
            return null;
        }
    }

    public void displayBooks() {
        books.display();
    }

    public int librarySize() {
        return books.size();
    }

    public boolean isLibraryEmpty() {
        return books.isEmpty();
    }
}