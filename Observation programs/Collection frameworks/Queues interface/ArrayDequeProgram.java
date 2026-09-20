import java.util.Deque;
import java.util.ArrayDeque;

public class ArrayDequeProgram {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(110);
        deque.add(120);
        deque.add(130);
        System.out.println(deque);
        deque.addFirst(100);
        deque.addLast(500);
        System.out.println(deque);
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
        System.out.println(deque);
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        System.out.println(deque.offerFirst(90));
        System.out.println(deque.offerLast(1000));
        System.out.println(deque);
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        System.out.println(deque);
        System.out.println(deque.peek());
        System.out.println(deque.isEmpty());
deque.clear();
        System.out.println(deque);
    }
}
