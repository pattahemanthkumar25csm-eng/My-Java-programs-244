import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigablesetProgram {
    public static void main(String[] args) {
        NavigableSet<Integer> navigableSet = new TreeSet<>();
        navigableSet.add(100);
        navigableSet.add(200);
        navigableSet.add(300);
        
        System.out.println("NavigableSet: " + navigableSet);
        // to get the first and last elements of the NavigableSet
        System.out.println("First element: " + navigableSet.first());
        // to get the last element of the NavigableSet
        System.out.println("Last element: " + navigableSet.last());
        navigableSet.lower(200);
        // to get the greatest element less than 200
        System.out.println("Lower than 200: " + navigableSet.lower(200));
        // to get the least element greater than 200
        
        navigableSet.higher(200);
        System.out.println("Higher than 200: " + navigableSet.higher(200));
        navigableSet.floor(200);
        System.out.println("Floor of 200: " + navigableSet.floor(200));
        navigableSet.ceiling(200);
        System.out.println("Ceiling of 200: " + navigableSet.ceiling(200));
        navigableSet.pollFirst();
        System.out.println("After polling first element: " + navigableSet);
        navigableSet.pollLast();
        System.out.println("After polling last element: " + navigableSet);
        navigableSet.descendingSet();
        System.out.println("Descending Set: " + navigableSet.descendingSet());

// to get headSet, tailSet, and subSet with inclusive/exclusive bounds
        NavigableSet<Integer> headSet = navigableSet.headSet(200, true);
        System.out.println("HeadSet (elements less than or equal to 200): " + headSet);
 // to get tailSet with exclusive bound       
        NavigableSet<Integer> tailSet = navigableSet.tailSet(200, false);
        System.out.println("TailSet (elements greater than 200): " + tailSet);
       // to get subSet with inclusive/exclusive bounds 
        NavigableSet<Integer> subSet = navigableSet.subSet(100, true, 300, false);
        System.out.println("SubSet (elements between 100 and 300): " + subSet);
        
        System.out.println("Descending Set: " + navigableSet.descendingSet());
        
        navigableSet.remove(200);
        System.out.println("NavigableSet after removing 200: " + navigableSet);
        
        System.out.println("Contains 100? " + navigableSet.contains(100));
        System.out.println("Size of the NavigableSet: " + navigableSet.size());
        System.out.println("Is the NavigableSet empty? " + navigableSet.isEmpty());
        
        navigableSet.clear();
        System.out.println("NavigableSet after clearing: " + navigableSet);
    }
}
