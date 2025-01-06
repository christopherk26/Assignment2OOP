public class Staff extends Employee {
    private int role;
    
    // fully parameterized constructor
    public Staff(String name, int hours, int role) {
        super(name, hours);  // Calls the parent constructor using super
        this.role = role;
    }
}