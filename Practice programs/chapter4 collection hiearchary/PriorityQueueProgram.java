
import java.util.PriorityQueue;
public class PriorityQueueProgram {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(100);
        priorityQueue.add(200);
        priorityQueue.offer(130);
        priorityQueue.offer(400);
        System.out.println(priorityQueue);
        //to know the elements in priority queue
        System.out.println(priorityQueue.peek());
        //to delte the elements in priority queue
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);
priorityQueue.remove();
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.contains(130));
        System.out.println(priorityQueue.size());
        System.out.println(priorityQueue.isEmpty());
        priorityQueue.clear();
        System.out.println(priorityQueue);




    }
}
