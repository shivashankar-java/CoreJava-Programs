package Queue;

import java.util.PriorityQueue;

public class Priorityqueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(10);
        pq.add(20);
        pq.add(5);

        System.out.println("Priority Queue: " + pq);

        System.out.println("Head: " + pq.peek());

        System.out.println("Removed: " + pq.poll());
        System.out.println("Queue after removal: " + pq);
    }
}

