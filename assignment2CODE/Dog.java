import java.util.*;

public class Dog {
    private String breed;
    private String name;
    private List<Paw> pawList;  // composition
    
    // no arg constructor
    public Dog() {
        this.breed = "";
        this.name = "";
        pawList = new ArrayList<Paw>();
        pawList.add(new Paw(1, this));
        pawList.add(new Paw(2, this));
        pawList.add(new Paw(3, this));
        pawList.add(new Paw(4, this));
    }
}
