package LibraryManagement;

public class LibraryManagementSystem {
	
    public static void main(String[] args) {
        Library library = new Library();
        LibraryUserInterface ui = new LibraryUserInterface();
        boolean continueLoop = true;

        while (continueLoop) {
            int choice = ui.getUserChoice();

            switch (choice) {
                case 1:
                    int id = ui.getBookId();
                    String title = ui.getBookTitle();
                    String author = ui.getBookAuthor();
                    library.addBook(id, title, author);
                    break;

                case 2:
                    int indexToRemove = ui.getIndex();
                    library.removeBook(indexToRemove);
                    break;

                case 3:
                    int indexToGet = ui.getIndex();
                    library.getBook(indexToGet);
                    break;

                case 4:
                    System.out.println("Books in the library:");
                    library.displayBooks();
                    break;

                case 5:
                    System.out.println("Library size: " + library.librarySize());
                    break;

                case 6:
                    System.out.println("Is the library empty? " + library.isLibraryEmpty());
                    break;

                case 7:
                    continueLoop = false;
                    ui.closeScanner();
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
