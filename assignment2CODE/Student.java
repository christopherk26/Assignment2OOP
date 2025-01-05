public class Student {
    private String name;
    private String major;
    private double gpa;
    
    public Student() {
        this.name = "";
        this.major = "";
        this.gpa = 0.0;
    }
    
    public Student(String name, String major) {
        this.name = name;
        this.major = major;
        this.gpa = 0.0;
    }
    
    public Student(String name, String major, double gpa) {
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getMajor() {
        return major;
    }
    
    public void setMajor(String major) {
        this.major = major;
    }
    
    public double getGpa() {
        return gpa;
    }
    
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + ", Major: " + major + ", GPA: " + gpa;
    }
    
    @Override
    public boolean equals(Object obj) {
        // doing these checks are important 
        if (obj == null) return false;
        if (!(obj instanceof Student)) return false;
        // then we check the fields
        Student other = (Student) obj;
        return this.name.equals(other.name) && 
               this.major.equals(other.major);
    }
}