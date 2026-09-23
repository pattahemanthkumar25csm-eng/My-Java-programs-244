import java.util.ListIterator;
import java.util.ArrayList;
import java.util.List;

public class ListIteratorProm {
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Obtain ListIterator
        ListIterator<String> litr = list.listIterator();

        System.out.println("--- Forward Traversal & Modification ---");
        while (litr.hasNext()) {
            String element = litr.next();
            System.out.println("Index: " + litr.previousIndex() + " Value: " + element);
            
            // Replace "Banana" with "Blueberry" dynamically
            if (element.equals("Banana")) {
                litr.set("Blueberry"); 
            }
        }

        System.out.println("\n--- Backward Traversal ---");
        // The cursor is now at the end of the list
        while (litr.hasPrevious()) {
            System.out.println("Index: " + litr.previousIndex() + " Value: " + litr.previous());
        }
        list.remove(0);
        System.out.println(list);
    }
}

































    

