import java.util.Scanner;

/**
 * The Menu class represents a menu for interacting with the football tournament application.
 * It extends the Player class and includes a Scanner for user input and a reference to the Team.
 * It allows users to add new players to the team through the play method.
 */
public class Menu extends Player {
    private Scanner userInput = new Scanner(System.in);
    private Team team;

    /**
     * Constructor to initialize a Menu object with a given player name and a reference to the Team.
     *
     * @param playerName The default name of the player in the menu.
     * @param team       The Team object to which players can be added.
     */
    public Menu(String playerName, Team team) {
        super(playerName);
        this.team = team;
    }

    /**
     * Simulate adding a new player to the team through user input.
     */
    @Override
    public void play() {
        System.out.println("Name of Player: ");
        String newPlayerName = userInput.nextLine();

        Player newPlayer = new Player(newPlayerName);
        team.addPlayer(newPlayer);

        System.out.println("\nPlayer added successfully.");
    }
}