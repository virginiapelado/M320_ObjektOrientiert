import java.util.ArrayList;
import java.util.List;
public class ShoppingList {
    private List<String> items = new ArrayList<>();

    public void addItem(String item) {
        items.add(item);
    }
    
    public void displayList() {
        System.out.println("Einkaufsliste:");
        for (String item : items) {
            System.out.println("- " + item);
        }
    }
}
