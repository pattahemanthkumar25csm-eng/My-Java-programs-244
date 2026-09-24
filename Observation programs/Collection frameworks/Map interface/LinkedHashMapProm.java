import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Hashtable;

public class LinkedHashMapProm {
    public static void main(String[] args) {
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        // Add key-value pairs to the LinkedHashMap
        linkedHashMap.put("c programming", "88");
        linkedHashMap.put("java programming", "88");
        linkedHashMap.put("python programming", "88");
        linkedHashMap.put("c++ programming", "88");
        linkedHashMap.put("data structures", "95");
        System.out.println(linkedHashMap);
        // Retrieve a value using a key
        System.out.println(linkedHashMap.get("java programming"));
        // Remove a key-value pair
        System.out.println(linkedHashMap.remove("python programming"));
        // Check if a key exists in the LinkedHashMap
        System.out.println(linkedHashMap.containsKey("c programming"));
        // Get the size of the LinkedHashMap
        System.out.println(linkedHashMap.size());
        System.out.println(linkedHashMap.containsValue("88"));
        System.out.println(linkedHashMap.isEmpty());
        // Get the keys, values, and entries of the LinkedHashMap
        System.out.println(linkedHashMap.keySet());
        System.out.println(linkedHashMap.values());
        System.out.println(linkedHashMap.entrySet());
// Create a Hashtable to store key-value pairs
       Map<String, String> hashtable = new Hashtable<>();
        hashtable.put("c programming", "90");
        hashtable.put("java programming", "78");
        hashtable.put("python programming", "98");
        hashtable.put("c++ programming", "68");
        hashtable.put("data structures", "95");
        System.out.println(hashtable);
        // Retrieve a value using a key
        System.out.println(hashtable.get("java programming"));
        System.out.println(hashtable.remove("python programming"));
        System.out.println(hashtable.containsKey("c programming"));
        System.out.println(hashtable.size());
    // Check if a value exists in the Hashtable
        System.out.println(hashtable.containsValue("98"));
        System.out.println(hashtable.isEmpty());
        // Get the keys, values, and entries of the Hashtable
        System.out.println(hashtable.keySet());
        System.out.println(hashtable.values());
        System.out.println(hashtable.entrySet());
    }
}
