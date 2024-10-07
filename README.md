# Library Management System

## This project is a library management system that allows users to check out and return books. Users can view available books, see which books are currently checked out, and manage their borrowing.

## Screenshots

### Home Screen

![Home Screen](Screenshots/Home%20Screen.png)

### Available Books

![Available Books](Screenshots/Available%20Books.png)

### Checked Out Books

![Checked Out Books](Screenshots/Checked%20Out%20Books.png)

### Error Screen

![Error Screen](Screenshots/Error%20Screen.png)

## Interesting Code Snippet

### Here’s a part of the code that overrides the `toString` method:

```java
@Override
public String toString() {
    return "ID: " + id + ", ISBN: " + isbn + ", Title: \"" + title + "\"";
}
```

### The override lets us change how a Book object is shown as a string. By overriding this method, we can display important details like the ID, ISBN, and Title clearly. This makes it easier to read and understand what the Book object is, especially when we print it out.