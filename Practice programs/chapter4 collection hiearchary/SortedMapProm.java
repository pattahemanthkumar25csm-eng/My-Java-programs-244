
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.NavigableMap;


public class SortedMapProm {
    public static void main(String[] args) {
        SortedMap<String, String> sortedMap = new TreeMap<>();
        // Add key-value pairs to the SortedMap
        sortedMap.put("c programming", "88");
        sortedMap.put("java programming", "88");
        sortedMap.put("python programming", "88");
        sortedMap.put("c++ programming", "88");
        sortedMap.put("data structures", "95");
        System.out.println(sortedMap);
        // Retrieve a value using a key
        System.out.println(sortedMap.get("java programming"));
        System.out.println(sortedMap.firstKey());
        System.out.println(sortedMap.lastKey());
        // Remove a key-value pair
        System.out.println(sortedMap.headMap("java programming"));
        System.out.println(sortedMap.tailMap("java programming"));
        System.out.println(sortedMap.remove("python programming"));
        System.out.println(sortedMap.containsKey("c programming"));
        System.out.println(sortedMap.subMap("c programming", "java programming"));
        System.out.println(sortedMap.firstEntry());
        System.out.println(sortedMap.lastEntry());
        System.out.println(sortedMap.pollFirstEntry() + " " + sortedMap.pollLastEntry());
        System.out.println(sortedMap);
        System.out.println(sortedMap.size());

 NavigableMap<String, String> navigableMap = new TreeMap<>();
        navigableMap.put("c programming", "88");
        navigableMap.put("java programming", "88");
        navigableMap.put("python programming", "88");
        navigableMap.put("c++ programming", "88");
        navigableMap.put("data structures", "95");
        System.out.println(navigableMap);
        System.out.println(navigableMap.ceilingEntry("java programming"));
        System.out.println(navigableMap.floorEntry("java programming"));
        System.out.println(navigableMap.higherEntry("java programming"));
        System.out.println(navigableMap.lowerEntry("java programming"));
        System.out.println(navigableMap.descendingMap());
        System.out.println(navigableMap.descendingKeySet());
        navigableMap.firstEntry();

        navigableMap.lastEntry();
        System.out.println(navigableMap.firstEntry()  + " " + navigableMap.lastEntry());
        System.out.println(navigableMap.pollFirstEntry() + " " + navigableMap.pollLastEntry());
        














    }
}
