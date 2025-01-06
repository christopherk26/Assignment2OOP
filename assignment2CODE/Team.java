import java.util.*;

public class Team {
    private int code;
    private List<Player> players;  // aggregation
    
    // no-arg constructor
    public Team() {
        this.code = 0; 
        this.players = new ArrayList<>();  
    }

    // adding players logic here
    public void addPlayer(Player player) {
        if (player != null && !players.contains(player)) {
            players.add(player);
        }
    }
}
