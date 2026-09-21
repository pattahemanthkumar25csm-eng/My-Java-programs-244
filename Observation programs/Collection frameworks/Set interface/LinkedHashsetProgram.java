import java.util.Set;
import java.util.LinkedHashSet;

public class LinkedHashsetProgram {
    public static void main(String[] args) {
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(100);
        linkedHashSet.add(200);
        linkedHashSet.add(300);
// to know the elements in linkedhashset
        System.out.println("LinkedHashSet: " + linkedHashSet);
        
        linkedHashSet.remove(200);
        // to delete the elements in linkedhashset
        System.out.println("LinkedHashSet after removing 200: " + linkedHashSet);
   // to check if a specific element is present in the LinkedHashSet     
        System.out.println("Contains 100? " + linkedHashSet.contains(100));
        System.out.println("Size of the LinkedHashSet: " + linkedHashSet.size());
        System.out.println("Is the LinkedHashSet empty? " + linkedHashSet.isEmpty());
        // to clear all elements from the LinkedHashSet
        linkedHashSet.clear();
        System.out.println("LinkedHashSet after clearing: " + linkedHashSet);
    }
}
