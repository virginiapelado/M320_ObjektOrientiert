public class Goalie extends Player {
    private double height;

    public Goalie(String playerName, double height ){
        super(playerName);
        this.height = height;}

    @Override
    public void play() {
        System.out.println("Goalie blocking shots!");
    }
}
