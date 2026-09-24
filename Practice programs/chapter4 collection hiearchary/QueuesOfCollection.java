

import java.util.Queue;
import java.util.LinkedList;
//it is an queue interface which is implemented by linked list class
public class QueuesOfCollection {
    public static void main(String[] args) {
        // Creating a Queue
        Queue<Integer> queue = new LinkedList<>();
        queue.add(110);
        queue.add(120);
        queue.add(130);
        System.out.println(queue);
        //queue.remove();
        queue.offer(400);
        System.out.println(queue);

        queue.poll();
        System.out.println(queue);

        queue.remove();
        System.out.println(queue);
    System.out.println(queue.element());
    //System.out.println(queue.);
        queue.peek();
        System.out.println(queue);
        queue.isEmpty();
        System.out.println(queue);
        System.out.println(queue.contains(1200));
        //System.out.println(queue.c(130));
        queue.clear();
        System.out.println(queue);
    }
}