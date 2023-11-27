public class Attacker extends Player {

    public Attacker(String playerName) {
        super(playerName);
    }

    public void jogTraining() {
        System.out.println("Attacker is practicing shooting!");
    }

    @Override
    public void play() {
        System.out.println("Attacker is scoring goals!");
    }


}
