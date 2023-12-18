import java.util.*;

public class HashMapWithListValues {
    private Map<String, List<String>> map;

    public HashMapWithListValues() {
        this.map = new HashMap<>();
    }

    public void addEdge(String key, String value) {
        map.computeIfAbsent(key, k -> new ArrayList<>()).add(value);
    }

    public void displayNetwork() {
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<String> values = entry.getValue();
            System.out.println(key + ": " + String.join(", ", values));
        }
    }

    public String findPersonWithCar(String startPerson) {
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.offer(startPerson);
        visited.add(startPerson);

        while (!queue.isEmpty()) {
            String currentPerson = queue.poll();

            if (hasCar(currentPerson)) {
                return currentPerson;
            }

            for (String friend : map.getOrDefault(currentPerson, Collections.emptyList())) {
                if (!visited.contains(friend)) {
                    queue.offer(friend);
                    visited.add(friend);
                }
            }
        }
        return null;
    }

    private boolean hasCar(String person) {
        return person.equalsIgnoreCase("David");
    }
}
