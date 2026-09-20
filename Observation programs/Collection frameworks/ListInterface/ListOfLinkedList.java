import java.util.LinkedList;
public class ListOfLinkedList {
    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<Integer> list = new LinkedList<>();

        // Adding elements to the LinkedList
        list.add(110);
        list.add(120);
        list.add(130);
        System.out.println(list);
        list.addFirst(100);
        list.addLast(200);
//System.out.println(list.addLast(200));
        // Adding element at specific index
        System.out.println(list);
        list.add(3, 140);
        list.add(2, 120);
        System.out.println(list);

        // Getting element at specific index
        int element = list.get(2);
        System.out.println("Element at index 2: " + element);

        // Setting element at specific index
        list.set(2, 30);
        System.out.println("After setting index 2 to 30: " + list);

        // Removing element at specific index
        list.remove(2);
        System.out.println("After removing element at index 2: " + list);
        list.removeFirst();
        list.removeLast();
        System.out.println("After removing first and last elements: " + list);
        System.out.println("After removing first element: " + list);

        // Checking if the list contains a specific element
        boolean contains = list.contains(30);
        System.out.println("List contains 30: " + contains);
list.offer(250);
System.out.println("After offering 250 to the list: " + list);
        // Getting the size of the LinkedList
        int size = list.size();
        System.out.println("Size of the LinkedList: " + size);
System.out.println("Is the LinkedList empty? " + list.poll());
System.out.println("After polling the first element: " + list.peekFirst());
System.out.println("After peeking the first element: " + list.peekLast());
        // Clearing the LinkedList
        list.clear();
        System.out.println("After clearing the LinkedList: " + list);
    }
}
