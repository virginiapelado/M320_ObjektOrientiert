import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Player> players;

    public Team() {
        this.players = new ArrayList<>();
    }

    public void showAllPlayers() {
        System.out.println("Team Players:");
        for (Player player : players) {
            player.showName();
        }
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void play() {
        for (Player player : players) {
            player.play();
        }
    }
}

