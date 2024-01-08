/**
 * The Attacker class represents a football attacker, extending the functionality of the Player class.
 * It includes methods for jogging training and overrides the play method to provide attacker-specific behavior.
 */
public class Attacker extends Player {

    /**
     * Constructor to initialize an Attacker object with a given player name.
     *
     * @param playerName The name of the attacker.
     */
    public Attacker(String playerName) {
        super(playerName);
    }

    /**
     * Simulate jogging training for the attacker.
     */
    public void jogTraining() {
        System.out.println("Attacker is practicing shooting!");
    }

    /**
     * Override the play method to provide attacker-specific playing behavior.
     */
    @Override
    public void play() {
        System.out.println("Attacker is scoring goals!");
    }
}
