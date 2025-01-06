
public class Paw {
    private int position;
    private Dog dog;  // reference back
    
    // fully parameterized constructor
    public Paw(int position, Dog dog) {
        this.position = position;
        this.dog = dog;
    }
}