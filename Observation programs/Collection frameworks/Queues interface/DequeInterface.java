import java.util.Deque;
import java.util.LinkedList;

public class DequeInterface {
    public static void main(String[] args) {
        // Creating a Deque
        Deque<Integer> deque = new LinkedList<>();
        deque.add(110);
        deque.add(120);
        deque.add(130);
        System.out.println(deque);
        deque.offer(400);
        System.out.println(deque);
        deque.addFirst(100);
System.out.println(deque);
System.out.println(deque.offerFirst(90));

System.out.println(deque.offerLast(1000));
deque.addLast(500);

System.out.println(deque);
System.out.println(deque.peekFirst());
System.out.println(deque.peekLast());
        deque.pollFirst();
        System.out.println(deque);
        deque.pollLast();
System.out.println(deque);
        deque.removeFirst();
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);

    }
}
