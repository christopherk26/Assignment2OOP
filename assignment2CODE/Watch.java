
public class Watch {
    private Person person;
    private Movie movie;
    private int rating;
    
    public Watch(Person person, Movie movie, int rating) {
        this.person = person;
        this.movie = movie;
        this.rating = rating;
        person.addWatch(this);    // link watch to person
        movie.addWatch(this);     // link watch to movie
    }
    
    public Movie getMovie() {
        return movie;
    }
    
    public Person getPerson() {
        return person;
    }
}