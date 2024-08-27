package LibraryManagement;

import java.util.Scanner;

public class LibraryUserInterface {
    private Scanner scanner;

    public LibraryUserInterface() {
        scanner = new Scanner(System.in);
    }

    public int getUserChoice() {
        System.out.println("\nChoose an operation:");
        System.out.println("1: Add book");
        System.out.println("2: Remove book");
        System.out.println("3: Get book details");
        System.out.println("4: Display all books");
        System.out.println("5: Check library size");
        System.out.println("6: Check if library is empty");
        System.out.println("7: Exit");

        return scanner.nextInt();
    }

    public int getBookId() {
        System.out.print("Enter book ID: ");
        return scanner.nextInt();
    }

    public String getBookTitle() {
        System.out.print("Enter book title: ");
        scanner.nextLine(); // Consume newline
        return scanner.nextLine();
    }

    public String getBookAuthor() {
        System.out.print("Enter book author: ");
        return scanner.nextLine();
    }

    public int getIndex() {
        System.out.print("Enter index: ");
        return scanner.nextInt();
    }

    public void closeScanner() {
        scanner.close();
    }
}
