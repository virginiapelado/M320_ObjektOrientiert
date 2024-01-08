/**
 * The Defender class represents a football defender, extending the functionality of the Player class.
 * It overrides the play method to provide defender-specific behavior.
 */
public class Defender extends Player {

    /**
     * Constructor to initialize a Defender object with a given player name.
     *
     * @param playerName The name of the defender.
     */
    public Defender(String playerName) {
        super(playerName);
    }

    /**
     * Override the play method to provide defender-specific playing behavior.
     */
    @Override
    public void play() {
        System.out.println("Defender is defending!");
    }
}
