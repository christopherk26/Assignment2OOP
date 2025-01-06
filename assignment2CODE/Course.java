import java.util.*;

public class Course {
    private int code;
    private List<Book> books;  // To store multiple books (0..*)
    
    // Fully parameterized constructor
    public Course(int code) {
        this.code = code;
        this.books = new ArrayList<>();  // Initialize empty list books
    }
    
    // Method to add a book and maintain bidirectional 
    // relationship would go here
    
}
