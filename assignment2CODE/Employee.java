public class Employee {
    private String name;
    private int hours;
    
    // fully parameterized constructor
    public Employee(String name, int hours) {
        this.name = name;
        this.hours = hours;
    }
    
    // method to calculate salary as specified
    public double calculateSalary() {
        return hours * 20;
    }
    
    public int getHours() {
        return hours;
    }
}
