import java.util.Scanner;

/**
 * The Main class contains the main method and serves as the entry point for the football tournament application.
 * It creates instances of the Team, Menu, Goalie, Attacker, and Defender classes and provides a user interface
 * for displaying players, adding new players, and watching the game.
 */
public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Team team = new Team();

        // Creating specific player instances (Goalie, Attacker, Defender) plus a default player in menu
        Menu menu = new Menu("Jude Bellingham", team);
        Goalie goalie = new Goalie("Yassine Bounou", 195.0);
        Attacker attacker = new Attacker("Lionel Messi");
        Defender defender = new Defender("Marcos Aoás Corrêa");
        team.addPlayer(goalie);
        team.addPlayer(attacker);
        team.addPlayer(defender);

        while (true) {
            System.out.println(
                    "**********************************" +
                    "\nFootball Tournament" +
                    "\n**********************************" +
                    "\n[1]\tShow Players" +
                    "\n[2]\tAdd new Players" +
                    "\n[3]\tWatch Game" +
                    "\n**********************************"
            );
            String userRequest = userInput.nextLine();

            if (userRequest.equals("1")) {
                team.showAllPlayers();
            } else if (userRequest.equals("2")) {
                menu.play();
            } else if (userRequest.equals("3")) {
                team.play();
            } else {
                System.out.println("\nOption doesn't exist");
                break;
            }
        }
    }
}