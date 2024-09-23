package stactandsort;

public class Library {
    private ArrayListADT books;
    private StackADT undoStack;

    public Library() {
        books = new ArrayListADT();
        undoStack = new StackADT();
    }

    // Add a book and push its ID to the undo stack
    public void addBook(int bookId) {
        books.add(bookId);
        undoStack.push(bookId);  // Push the added book's ID to the undo stack
        System.out.println("Book with ID " + bookId + " added.");
    }

    // Remove a book at the specified index
    public void removeBook(int index) {
        try {
            int removedBook = books.get(index);
            books.remove(index);
            System.out.println("Book with ID " + removedBook + " removed.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid index.");
        }
    }

    // Get details of the book at the specified index
    public void getBook(int index) {
        try {
            System.out.println("Book ID at index " + index + ": " + books.get(index));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid index.");
        }
    }

    // Display all books in the library
    public void displayBooks() {
        books.display();
    }

    // Sort books by their ID using selection sort
    public void sortBooksByID() {
        SelectionSort.sortByID(books);
        System.out.println("Books sorted.");
    }

    // Display all books in the stack (recently added books)
    public void displayAllRecentBooks() {
        undoStack.displayStack();
    }

    // Undo the last book addition
    public void undoLastAddition() {
        if (undoStack.isEmpty()) {
            System.out.println("No action to undo.");
        } else {
            int lastAddedBookId = undoStack.pop();  // Remove the last added book from the stack
            for (int i = 0; i < books.size(); i++) {
                if (books.get(i) == lastAddedBookId) {
                    books.remove(i);
                    System.out.println("Undo successful. Book with ID " + lastAddedBookId + " removed.");
                    return;
                }
            }
        }
    }

    // Check the size of the library
    public int librarySize() {
        return books.size();
    }

    // Check if the library is empty
    public boolean isLibraryEmpty() {
        return books.isEmpty();
    }
}
