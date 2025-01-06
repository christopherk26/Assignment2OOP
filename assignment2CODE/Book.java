
import java.util.*;


public class Book {
    private String name;
    private String author;
    private Course course;  // 0..1 reference to course
    
    // No-arg 
    public Book() {
        this.name = "";
        this.author = "";
        this.course = null;  // No course initially
    }
    
    // Method to set course which does the bidirectinal
    // relationship would go here
    
}