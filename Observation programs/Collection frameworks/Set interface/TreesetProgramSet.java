import java.util.Set;
import java.util.TreeSet;

public class TreesetProgramSet {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(100);
        treeSet.add(200);
        treeSet.add(300);
// to know the elements in treeset
        System.out.println("TreeSet: " + treeSet);
        //to delete the elements in treeset
        treeSet.remove(200);
        System.out.println("TreeSet after removing 200: " + treeSet);
    
        System.out.println("Contains 100? " + treeSet.contains(100));// the contains() method is used to check if a specific element is present in the TreeSet. It returns true if the element is found, and false otherwise.
        System.out.println("Size of the TreeSet: " + treeSet.size());
        // The size() method returns the number of elements in the TreeSet.
        System.out.println("Is the TreeSet empty? " + treeSet.isEmpty());
        // The isEmpty() method checks if the TreeSet is empty. It returns true if there are no elements, and false otherwise.
        treeSet.clear();
        System.out.println("TreeSet after clearing: " + treeSet);
    }
}
