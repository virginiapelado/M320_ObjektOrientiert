import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Flight flight = new Flight();
        Scanner userInput = new Scanner(System.in);

        while (true) {
            System.out.println(
                    "\n[1]\tShow All Passengers" +
                            "\n[2]\tAdd new Passengers" +
                            "\n[3]\tRemove existing Passengers"
            );
                String userRequest = userInput.nextLine();

            if (userRequest.equals("1")) {
                flight.passengersListOutput();
            } else if (userRequest.equals("2")) {
                flight.addPassenger();
            } else if (userRequest.equals("3")) {
                flight.removePassenger();
            } else {
                System.out.println("\nOption doesnt exist");
                break;
            }
        }

    }
}