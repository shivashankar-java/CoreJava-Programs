package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample{
    public static void main(String[] args) {
       Queue<String> queue= new LinkedList<>();

        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");

        System.out.println("Queue: " + queue);

        // Accessing the head of the queue
        System.out.println("Head: " + queue.peek());

        // Removing elements from the queue
        System.out.println("Removed: " + queue.poll());
        System.out.println("Queue after removal: " + queue);

        System.out.println("Size: " + queue.size());
    }
}

