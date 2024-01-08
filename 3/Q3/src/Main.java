import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println(
                "************************************" +
                        "\n[1]\tStack" +
                        "\n[2]\tGraph" +
                        "\n[3]\tLinked List" +
                        "\n************************************");
        String userRequest = userInput.nextLine();

        switch (userRequest) {
            case "1":
                stackOverview();
                break;
            case "2":
                // Add your code for option 2 (Graph) here
                break;
            case "3":
                // Add your code for option 3 (Linked List) here
                break;
            default:
                System.out.println("Invalid option");
        }
    }

    public static void stackOverview() {
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Pop elements from the stack
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }
    }
}
