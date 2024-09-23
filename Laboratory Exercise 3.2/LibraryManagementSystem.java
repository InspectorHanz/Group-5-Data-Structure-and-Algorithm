package stactandsort;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;

        while (continueLoop) {
            System.out.println("\nChoose an operation:");
            System.out.println("1: Add book");
            System.out.println("2: Remove book");
            System.out.println("3: Get book details");
            System.out.println("4: Display all books");
            System.out.println("5: Sort books by ID");
            System.out.println("6: Display all recent books (Stack)");
            System.out.println("7: Undo last addition");
            System.out.println("8: Check library size");
            System.out.println("9: Check if library is empty");
            System.out.println("10: Exit");

            int choice = getValidChoice(scanner);

            switch (choice) {
                case 1:
                    System.out.print("Enter book ID to add: ");//add element
                    int bookId = getValidIntInput(scanner); 
                    library.addBook(bookId);
                    break;

                case 2:
                    int indexToRemove = getValidIndex(scanner, library, "remove");//remove element
                    if (indexToRemove != -1) {
                        library.removeBook(indexToRemove);
                    }
                    break;

                case 3:
                    int indexToGet = getValidIndex(scanner, library, "get");//get book detail by index
                    if (indexToGet != -1) {
                        library.getBook(indexToGet);
                    }
                    break;

                case 4:
                    library.displayBooks();//display all inputted elements
                    break;

                case 5:
                    library.sortBooksByID();//sort books by there ids
                    break;

                case 6:
                    library.displayAllRecentBooks();  // Display all recent books from the stack
                    break;

                case 7:
                    library.undoLastAddition();  // Undo the last added book
                    break;

                case 8:
                    System.out.println("Library size: " + library.librarySize());//display library arraylist sized
                    break;

                case 9:
                    System.out.println("Is the library empty? " + library.isLibraryEmpty());//display it the array is empty or not
                    break;

                case 10:
                    continueLoop = false;// exit
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        scanner.close();
    }

    private static int getValidChoice(Scanner scanner) {
        int choice = -1;
        boolean valid = false;
        while (!valid) {
            try {
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                if (choice >= 1 && choice <= 10) {
                    valid = true;
                } else {
                    System.out.println("Invalid choice. Please enter a number between 1 and 10.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();  
            }
        }
        return choice;
    }

  
    private static int getValidIntInput(Scanner scanner) {
        int input = -1;
        boolean valid = false;
        while (!valid) {
            try {
                input = scanner.nextInt();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next();
            }
        }
        return input;
    }

    private static int getValidIndex(Scanner scanner, Library library, String action) {
        int index = -1;
        boolean valid = false;
        while (!valid) {
            try {
                System.out.print("Enter index to " + action + " book: ");
                index = scanner.nextInt();
                if (index >= 0 && index < library.librarySize()) {
                    valid = true;
                } else {
                    System.out.println("Invalid index. Please enter a valid index between 0 and " + (library.librarySize() - 1) + ".");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next();  
            }
        }
        return index;
    }
}
