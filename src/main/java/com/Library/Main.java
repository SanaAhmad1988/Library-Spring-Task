package com.Library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        // Create a new book.
        library.addBook(new Book("1984", "George Orwell", "1234567890"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "0987654321"));
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "1122334455"));
        

        while (true) {
            System.out.println("Library Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. View Available Books");
            System.out.println("5. Delete Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    String ISBN = scanner.nextLine();
                    Book book = new Book(title, author, ISBN);
                    library.addBook(book);
                    break;
                case 2:
                    System.out.print("Enter ISBN of the book to borrow: ");
                    String borrowISBN = scanner.nextLine();
                    library.borrowBook(borrowISBN);
                    break;
                case 3:
                    System.out.print("Enter title: ");
                    String returnTitle = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String returnAuthor = scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    String returnISBN = scanner.nextLine();
                    Book returnBook = new Book(returnTitle, returnAuthor, returnISBN);
                    library.returnBook(returnBook);
                    break;
                case 4:
                    library.viewAvailableBooks();
                    break;
                case 5:
                    System.out.print("Enter ISBN of the book to delete: ");
                    String deleteISBN = scanner.nextLine();
                    library.deleteBook(deleteISBN);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
