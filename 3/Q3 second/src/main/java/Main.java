import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ShoppingList shoppingList = new ShoppingList();
        UserInterface userInterface = new UserInterface();

        boolean isrunning = true;

        while (isrunning) {
            try {
                String item = userInterface.readString();
                int quantity = userInterface.readInt();

                for (int i = 0; i < quantity; i++) {
                    shoppingList.addItem(item);
                }

                shoppingList.displayList();
            } catch (InvalidInputException e) {
                System.out.println("Fehler: " + e.getMessage());
            }
            System.out.println("Do you want to add something else to the list?");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("yes")){
                isrunning = true;
            }else {isrunning = false;}
        }
    }
}