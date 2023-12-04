import java.util.InputMismatchException;
import java.util.Scanner;
public class UserInterface {
    private Scanner scanner = new Scanner(System.in);

    public String readString() {
        System.out.print("Geben Sie einen Artikel ein: ");
        return scanner.nextLine();
    }

    public int readInt() throws InvalidInputException {
        try {
            System.out.print("Geben Sie die Menge ein: ");
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            throw new InvalidInputException("Ungültige Eingabe. Bitte geben Sie eine ganze Zahl ein.");
        } finally {
            scanner.nextLine();
        }
    }
}
