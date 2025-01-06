
public class Professor extends Employee {
    private String field;
    
    // dully parameterized constructor
    public Professor(String name, int hours, String field) {
        super(name, hours);  // call parent with super
        this.field = field;
    }
    
    // do the override salary calculation
    @Override
    public double calculateSalary() {
        return getHours() * 30;
    }
}

