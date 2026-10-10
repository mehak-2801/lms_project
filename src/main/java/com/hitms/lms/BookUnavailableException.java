package com.hitms.lms;

/** Thrown when a book has no copies left to issue. */
public class BookUnavailableException extends Exception {
    public BookUnavailableException(String message) {
        super(message);
    }
}
