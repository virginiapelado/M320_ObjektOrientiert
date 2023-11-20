public class Passengers {
    String passengerNames;

    public void nameOutput(){
        System.out.printf("\n"+passengerNames);
    }

    public String getPassengerNames() {
        return passengerNames;
    }

    public void setPassengerNames(String passengerNames) {
        this.passengerNames = passengerNames;
    }
}
