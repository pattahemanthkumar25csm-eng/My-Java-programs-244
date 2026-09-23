//package Observation programs.Collection frameworks.cursor;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
public class CursorIterator {
    public static void main(String[] args) {
        String[] arr = {"c programming", "java programming", "python programming", "c++ programming", "data structures"};
        Iterator<String> iterator = java.util.Arrays.asList(arr).iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
      iterator.next();
      System.out.println("After removing the element: " + iterator.next());
      iterator.remove();
      iterator.next();
      System.out.println("After removing the element: " + iterator.next());
      iterator.forEachRemaining(System.out::println);
    }
}
