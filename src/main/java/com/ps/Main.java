package com.ps;
import java.util.Scanner;

public class Main {
    static Scanner scnr = new Scanner(System.in);
    public static void main(String[] args) {

        Book[] library = new Book[20];

        library[0] = new Book(1, "978-0-06-112008-4", "To Kill a Mockingbird");
        library[1] = new Book(2, "978-0-452-28423-4", "1984");
        library[2] = new Book(3, "978-0-7432-7356-5", "The Great Gatsby");
        library[3] = new Book(4, "978-0-14-028329-7", "Pride and Prejudice");
        library[4] = new Book(5, "978-0-14-243723-0", "The Catcher in the Rye");
        library[5] = new Book(6, "978-0-451-52993-5", "The Grapes of Wrath");
        library[6] = new Book(7, "978-0-06-112241-5", "Brave New World");
        library[7] = new Book(8, "978-0-7432-7357-2", "Fahrenheit 451");
        library[8] = new Book(9, "978-0-307-29136-7", "The Hobbit");
        library[9] = new Book(10, "978-0-06-440766-1", "Charlotte's Web");
        library[10] = new Book(11, "978-0-06-440355-7", "Harry Potter and the Sorcerer's Stone");
        library[11] = new Book(12, "978-0-15-601219-5", "The Alchemist");
        library[12] = new Book(13, "978-0-06-093546-7", "The Kite Runner");
        library[13] = new Book(14, "978-0-06-230125-0", "The Fault in Our Stars");
        library[14] = new Book(15, "978-0-451-52796-1", "Life of Pi");
        library[15] = new Book(16, "978-0-14-243725-4", "Wuthering Heights");
        library[16] = new Book(17, "978-0-553-21311-7", "The Road");
        library[17] = new Book(18, "978-0-06-197508-4", "A Wrinkle in Time");
        library[18] = new Book(19, "978-0-06-052848-3", "The Perks of Being a Wallflower");
        library[19] = new Book(20, "978-0-451-53036-5", "The Book Thief");

        System.out.println("Welcome to our library! Please select one of the options below -");

        do {
            System.out.println("\n 1) Show available books and check out a book");
            System.out.println(" 2) Show checked out books or return a book");
            System.out.println(" 3) Exit the library");
            System.out.print("\nPlease enter the corresponding number to the option you want to choose: ");
            int choice = scnr.nextInt();
            scnr.nextLine();
            if (choice == 1) {
                displayAvailable (library);
            } else if (choice == 2) {
                displayCheckedOut (library);
            } else if (choice == 3) {
                System.out.println("\nThank you for visiting the library. Goodbye!");
                break;
            } else {
                System.out.println("\nInvalid option. Please try again.");
            }
        } while (true);
    }

    public static void displayAvailable (Book[] library) {
        System.out.println("\nHere is a list of all of our available books: ");

        for (int i = 0; i < library.length; i++) {
            if (!library[i].isCheckedOut()) {
                System.out.println(library[i]);
            }
        }
        String selection;

        do {
            System.out.println("\nIf you would like to check out a book, please enter \"yes\".");
            System.out.println("If you would like to return to the home screen, please enter \"no\".");
            System.out.print("\nPlease make your selection: ");
            selection = scnr.nextLine().trim();

            if (selection.equalsIgnoreCase("yes")) {
                System.out.print("\nPlease enter the ID of the book you would like to check out: ");
                if (scnr.hasNextInt()) {
                    int id = scnr.nextInt();
                    scnr.nextLine();
                    if (id == library[id - 1].getId() && !library[id - 1].isCheckedOut()) {
                        System.out.print("\nPlease enter your first and last name: ");
                        String name = scnr.nextLine();
                        library[id - 1].checkOut(name);
                        System.out.println("\nYou have checked out \"" + library[id - 1].getTitle() + "\".");
                        System.out.println("\nReturning to the main menu...");
                        break;
                    } else {
                        System.out.println("\nInvalid book ID. Please try again.");
                    }
                } else {
                    System.out.println("\nInvalid input. Please enter a number.");
                    scnr.nextLine();
                }
            } else if (selection.equalsIgnoreCase("no")) {
                System.out.println("\nReturning to the main menu...");
                return;
            } else {
                System.out.println("\nInvalid option. Please try again.");
            }
        } while (true);
    }

    public static void displayCheckedOut (Book[] library) {
        System.out.println("\nHere is a list of all of our checked out books: ");

        for (int i = 0; i < library.length; i++) {
            if (library[i].isCheckedOut()) {
                System.out.println(library[i]);
            }
        }
        String selection;

        do {
            System.out.println("\nIf you would like to return a book, please enter \"yes\".");
            System.out.println("If you would like to return to the home screen, please enter \"no\".");
            System.out.print("\nPlease make your selection: ");
            selection = scnr.nextLine().trim();

            if (selection.equalsIgnoreCase("yes")) {
                System.out.print("\nPlease enter the ID of the book you are checking in: ");
                if (scnr.hasNextInt()) {
                    int id = scnr.nextInt();
                    scnr.nextLine();
                    if (id == library[id - 1].getId() && library[id - 1].isCheckedOut()) {
                        library[id - 1].checkIn();
                        System.out.println("\nYou have checked in \"" + library[id - 1].getTitle() + "\"");
                        System.out.println("\nReturning to the main menu...");
                        break;
                    } else {
                        System.out.println("\nInvalid book ID. Please try again.");
                    }
                } else {
                    System.out.println("\nInvalid input. Please enter a number.");
                    scnr.nextLine();
                }
            } else if (selection.equalsIgnoreCase("no")) {
                System.out.println("\nReturning to the main menu...");
                return;
            } else {
                System.out.println("\nInvalid option. Please try again.");
            }
        } while (true);
    }
}