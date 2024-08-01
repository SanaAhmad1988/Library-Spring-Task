package com.Library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    // Constructor to initialize the books list
    public Library() {
        books = new ArrayList<>();
    }

    // Method to add a book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book);
    }

    // Method to borrow a book
    public void borrowBook(String ISBN) {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                books.remove(book);
                System.out.println("Book borrowed: " + book);
                return;
            }
        }
        System.out.println("Book not found with ISBN: " + ISBN);
    }

    // Method to return a book
    public void returnBook(Book book) {
        books.add(book);
        System.out.println("Book returned: " + book);
    }

    // Method to view available books
    public void viewAvailableBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            System.out.println("Available books:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    // Method to delete a book
    public void deleteBook(String ISBN) {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                books.remove(book);
                System.out.println("Book deleted: " + book);
                return;
            }
        }
        System.out.println("Book not found with ISBN: " + ISBN);
    }
}
