import java.util.Scanner;

public class Menu extends Player {
    private Scanner userInput = new Scanner(System.in);
    private Team team;

    public Menu(String playerName, Team team) {
        super(playerName);
        this.team = team;
    }

    @Override
    public void play() {
        System.out.println("Name of Player: ");
        String newPlayerName = userInput.nextLine();

        Player newPlayer = new Player(newPlayerName);
        team.addPlayer(newPlayer);

        System.out.println("\nPlayer added successfully.");
    }
}
