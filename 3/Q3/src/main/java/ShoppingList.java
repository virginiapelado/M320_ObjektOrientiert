import java.util.ArrayList;
import java.util.List;
public class ShoppingList {
    private List<String> items = new ArrayList<>();

    // Methode zum Hinzufügen von Elementen zur Liste
    public void addItem(String item) {
        items.add(item);
    }

    // Methode zum Anzeigen der Einkaufsliste
    public void displayList() {
        System.out.println("Einkaufsliste:");
        for (String item : items) {
            System.out.println("- " + item);
        }
    }
}
