import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Flight {
    private List<Passengers> passengersList = new ArrayList<>();
    private Scanner userInput = new Scanner(System.in);
    private Passengers passengers = new Passengers();

    public void passengersListOutput(){
        if (passengersList.isEmpty()){
            System.out.println("\nNo Passengers found");
        }

        for (Passengers p: passengersList){
            p.nameOutput();
        }
    }

    public void addPassenger(){
        System.out.println("Name of Passenger: ");
        String newPassengers = userInput.nextLine();
        passengers.setPassengerNames(newPassengers);
        passengersList.add(passengers);
        System.out.println("\nPassenger added successfully.");
    }

    public void removePassenger(){
        System.out.println("\nName of Passenger: ");
        String passengerName = userInput.nextLine();

        passengers.setPassengerNames(passengerName);
        if (passengersList.remove(passengers)){
            System.out.println("Passenger removed successfully.");
        } else {
            System.out.println("\nPassenger doesn't exist");
        }
    }
}
