public class Defender extends Player{

    public Defender( String playerName) {
        super(playerName);
    }

    @Override
    public void play() {
        System.out.println("Defender is defending!");
    }
}
