public class Student2 {
    private String name;
    private Transcript transcript;  // One-to-one 
    
    public Student2(String name, Transcript transcript) {
        this.name = name;
        this.transcript = transcript;
    }
}