import java.util.HashMap;
import java.util.Map;

public class MapInterface {
    public static void main(String[] args) {
        // Create a HashMap to store key-value pairs
        Map<String, Integer> map = new HashMap<>();

        // Add key-value pairs to the map
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);

        // Retrieve a value using a key
        int value = map.get("Banana");
        System.out.println("Value for key 'Banana': " + value);

        // Check if a key exists in the map
        boolean hasKey = map.containsKey("Cherry");
        System.out.println("Does the map contain 'Cherry'? " + hasKey);

        // Remove a key-value pair from the map
        map.remove("Apple");
        System.out.println("Map after removing 'Apple': " + map);

        // Iterate over the entries in the map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}