
public class Player {
    private String name;
    private boolean expert;
    private Team team;  // reference to team, multliplicity is one
    
    // fully parameterized constructor
    public Player(String name, boolean expert, Team team) {
        this.name = name;
        this.expert = expert;
        if (team != null) {
            this.team = team;
            team.addPlayer(this);  
        } else {
            // otherwise we throw this
            throw new IllegalArgumentException("Player must be assigned to a team");
        }
    }
}