public class FriendsNetwork{
    public static void main(String[] args) {
        HashMapWithListValues friendsNetwork = createFriendsNetwork();
        friendsNetwork.displayNetwork();

        String personWithCar = friendsNetwork.findPersonWithCar("David");

        if (personWithCar != null) {
            System.out.println("Found someone with a car: " + personWithCar);
        } else {
            System.out.println("No one with a car found in the network.");
        }
    }

    public static HashMapWithListValues createFriendsNetwork() {
        HashMapWithListValues network = new HashMapWithListValues();

        network.addEdge("Alice", "Bob");
        network.addEdge("Alice", "Charlie");
        network.addEdge("Bob", "David");
        network.addEdge("Charlie", "Eve");
        network.addEdge("Eve", "Frank");

        return network;
    }
}
