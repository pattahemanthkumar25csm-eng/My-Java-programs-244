import java.util.Set;
import java.util.HashSet;

public class SetInterface {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        
        System.out.println("Set: " + set);
      set.remove("Banana");
        System.out.println("Set after removing Banana: " + set);
        
        System.out.println("Contains Apple? " + set.contains("Apple"));
        System.out.println("Size of the set: " + set.size());
        System.out.println("Is the set empty? " + set.isEmpty());
        
        set.clear();
        System.out.println("Set after clearing: " + set);

    }
}
