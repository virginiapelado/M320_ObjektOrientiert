import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Team team = new Team();
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
                menu.play(); // Call the play method to add new players
            } else if (userRequest.equals("3")) {
                team.play();
            } else {
                System.out.println("\nOption doesn't exist");
                break;
            }
        }
    }
}