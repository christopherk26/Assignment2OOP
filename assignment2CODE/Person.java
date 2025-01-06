import java.util.*;

public class Person {
    private String name;
    private List<Watch> listWatch;
    
    public Person(String name) {
        this.name = name;
    }
    
    // we can add watch like it does in the slides
    public void addWatch(Watch watch) {
        if (listWatch == null) {
            listWatch = new ArrayList<Watch>();
        }
        listWatch.add(watch);
    }
    
    // like the getCourses() in the slides
    public List<Movie> getMovies() {
        List<Movie> listMovies = new ArrayList<Movie>();
        for (Watch watch : listWatch) {
            listMovies.add(watch.getMovie());
        }
        return listMovies;
    }
}
