/**
 * The Goalie class represents a football goalie, extending the functionality of the Player class.
 * It includes information about the goalie's height and overrides the play method to provide goalie-specific behavior.
 */
public class Goalie extends Player {
    private double height;

    /**
     * Constructor to initialize a Goalie object with a given player name and height.
     *
     * @param playerName The name of the goalie.
     * @param height     The height of the goalie.
     */
    public Goalie(String playerName, double height) {
        super(playerName);
        this.height = height;
    }

    /**
     * Override the play method to provide goalie-specific playing behavior. -> polymorphismus java (extending and overriding)
     */
    @Override
    public void play() {
        System.out.println("Goalie blocking shots!");
    }
}