public class Player {
    private String playerName;

    public Player (String playerName) {
        this.playerName = playerName;
    }

    public void showName() {
        System.out.println("Player name: " + playerName);
    }

    public void play() {
        System.out.println(playerName + " is playing.");
    }
}
