import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ShoppingList shoppingList = new ShoppingList();
        UserInterface userInterface = new UserInterface();

        boolean isrunning = true;

        while (isrunning) {
            try {
                // Artikel hinzufügen
                String item = userInterface.readString();
                int quantity = userInterface.readInt();

                // Delegation zur ShoppingList-Klasse
                for (int i = 0; i < quantity; i++) {
                    shoppingList.addItem(item);
                }

                // Einkaufsliste anzeigen
                shoppingList.displayList();
            } catch (InvalidInputException e) {
                System.out.println("Fehler: " + e.getMessage());
            }
            System.out.println("Do you want to add something else to the list?");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.next();
            if (answer.toLowerCase() != "yes"){
                isrunning = false;
            }
        }
    }
}