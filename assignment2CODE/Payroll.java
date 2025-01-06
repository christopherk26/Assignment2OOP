public class Payroll {
    public Payroll() {
    }
    
    //creating the dependency. we have an object argument
    public static void processPayments(Worker worker) {
        System.out.println("Payment processed for worker " + worker.getName());
    }
}

