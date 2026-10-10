package com.hitms.lms;

import java.util.ArrayList;
import java.util.List;

/** Basic add / issue / return operations for the library. */
public class LibraryService {

    /** Adds a book title to the catalogue and returns the catalogue. */
    public static List<String> addBook(List<String> catalogue, String title) {
        catalogue.add(title);
        return catalogue;
    }

    // Issues one copy of the given title from the catalogue
    public static int issueBook(int availableCopies, String title) throws BookUnavailableException {
        if (availableCopies <= 0) {
            throw new BookUnavailableException("'" + title + "' has no copies available.");
        }
        return availableCopies - 1;
    }

    /** Returns the copy count after a copy is returned. */
    public static int returnBook(int availableCopies) {
        return availableCopies + 1;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Remaining copies: " + issueBook(3, "Clean Code"));
            issueBook(0, "Clean Code");
        } catch (BookUnavailableException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
    }
}
