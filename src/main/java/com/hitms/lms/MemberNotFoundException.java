package com.hitms.lms;

/** Thrown when a member id cannot be found. */
public class MemberNotFoundException extends Exception {
    public MemberNotFoundException(String message) {
        super(message);
    }
}
