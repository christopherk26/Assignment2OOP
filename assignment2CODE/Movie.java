import java.util.*;


public class Movie {
    private String name;
    private String genre;
    private List<Watch> listWatch;
    
    public Movie(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }
    
    public void addWatch(Watch watch) {
        if (listWatch == null) {
            listWatch = new ArrayList<Watch>();
        }
        listWatch.add(watch);
    }
    
    // like seen in the slides
    public List<Person> getViewers() {
        List<Person> listViewers = new ArrayList<Person>();
        for (Watch watch : listWatch) {
            listViewers.add(watch.getPerson());
        }
        return listViewers;
    }
}
