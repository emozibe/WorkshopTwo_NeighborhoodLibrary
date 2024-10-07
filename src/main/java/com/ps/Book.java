// The Book class represents a book in a library system, storing its
// ID, ISBN, title, and checked-out status. It includes methods for
// checking out and checking in, along with formatted string output.

package com.ps;

public class Book {

    private int id; // Unique identifier for the book
    private String isbn; // ISBN number of the book
    private String title; // Title of the book
    private boolean isCheckedOut; // Status of whether the book is checked out
    private String checkedOutTo; // Name of the person who checked out the book

    // Constructor to initialize the book object
    public Book (int id, String isbn, String title) {

        this.id = id; // Set the book ID
        this.isbn = isbn; // Set the book ISBN
        this.title = title; // Set the book title
        this.isCheckedOut = false; // Initially, the book is not checked out
        this.checkedOutTo = ""; // Initially, the book is not checked out
    }

    // Getter  and setter for the book's ID
    public int getId() {
        return id;
    } public void setId(int id) {
        this.id = id;
    }

    // Getter and setter for the book's ISBN
    public String getIsbn() {
        return isbn;
    } public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // Getter and setter for the book's title
    public String getTitle() {
        return title;
    } public void setTitle(String title) {
        this.title = title;
    }

    // Getter and setter for the book's checked out status
    public boolean isCheckedOut() {
        return isCheckedOut;
    } public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    // Getter and setter for whom the book is checked out to
    public String getCheckedOutTo() {
        return checkedOutTo;
    } public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    // Method to check out the book to a user
    public void checkOut (String name) {
        this.isCheckedOut = true; // Mark the book as checked out
        this.checkedOutTo = name; // Store the name of the user who checked it out
    }

    // Method to check in the book
    public void checkIn () {
        this.isCheckedOut = false; // Mark the book as available again
        this.checkedOutTo = ""; // Clear the name of the user who checked it out
    }

    // Override toString method to provide a string representation of the book
    @Override
    public String toString() {
        return "ID: " + id + ", ISBN: " + isbn + ", Title: \"" + title + "\"";
    }
}