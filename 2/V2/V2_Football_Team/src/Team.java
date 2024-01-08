import java.util.ArrayList;
import java.util.List;

/**
 * The Team class represents a football team and contains a list of players.
 * It includes methods to display all players' names, add a player to the team, and simulate the team playing.
 */
public class Team {
    private List<Player> players;

    /**
     * Constructor to initialize a Team object with an empty list of players.
     */
    public Team() {
        this.players = new ArrayList<>();
    }

    /**
     * Display the names of all players in the team.
     */
    public void showAllPlayers() {
        System.out.println("Team Players:");
        for (Player player : players) {
            player.showName();
        }
    }

    /**
     * Add a player to the team.
     *
     * @param player The Player object to be added to the team.
     */
    public void addPlayer(Player player) {
        players.add(player);
    }

    /**
     * Simulate the team playing by invoking the play method for each player.
     */
    public void play() {
        for (Player player : players) {
            player.play();
        }
    }
}
