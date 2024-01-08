/**
 * The Player class represents a generic football player.
 * It contains information about the player's name and provides methods to display the name and simulate playing.
 */
public class Player {
    private String playerName;

    /**
     * Constructor to initialize a Player object with a given player name.
     *
     * @param playerName The name of the player.
     */
    public Player (String playerName) {
        this.playerName = playerName;
    }

    /**
     * Display the name of the player.
     */
    public void showName() {
        System.out.println("Player name: " + playerName);
    }

    /**
     * Simulate the player participating in a game.
     */
    public void play() {
        System.out.println(playerName + " is playing.");
    }
}

