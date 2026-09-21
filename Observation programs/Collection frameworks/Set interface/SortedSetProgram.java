import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetProgram {
    public static void main(String[] args) {
        SortedSet<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(100);
        sortedSet.add(200);
        sortedSet.add(300);
        
        System.out.println("SortedSet: " + sortedSet);
        sortedSet.first();
        System.out.println("First element: " + sortedSet.first());
        System.out.println("Last element: " + sortedSet.last());
        SortedSet<Integer> headSet = sortedSet.headSet(200);
        System.out.println("HeadSet (elements less than 200): " + headSet);
        SortedSet<Integer> tailSet = sortedSet.tailSet(200);
        System.out.println("TailSet (elements greater than or equal to 200): " + tailSet);
        SortedSet<Integer> subSet = sortedSet.subSet(100, 300);
        System.out.println("SubSet (elements between 100 and 300): " + subSet);   
        sortedSet.comparator();
        System.out.println("Comparator: " + sortedSet.comparator());
        


        sortedSet.remove(200);
        System.out.println("SortedSet after removing 200: " + sortedSet);
        
        System.out.println("Contains 100? " + sortedSet.contains(100));
        System.out.println("Size of the SortedSet: " + sortedSet.size());
        System.out.println("Is the SortedSet empty? " + sortedSet.isEmpty());
        
        sortedSet.clear();
        System.out.println("SortedSet after clearing: " + sortedSet);
    




    }
}