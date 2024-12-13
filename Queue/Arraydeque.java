package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Arraydeque {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        ArrayDeque<String> ad = new ArrayDeque<>();

        deque.addFirst("Shiva");
        deque.addLast("Rajesh");
        deque.addFirst("Ramu");
        deque.addLast("Ramesh");
        
        ad.push("Ashu");
        ad.push("Umesh");
        ad.push("Tillu");

        System.out.println("Deque: " + deque);

        System.out.println("First Element: " + deque.peekFirst());
        System.out.println("Last Element: " + deque.peekLast());

        // Removing elements
        System.out.println("Removed First: " + deque.removeFirst());
        System.out.println("Removed Last: " + deque.removeLast());

        System.out.println("Deque after removal: " + deque);
        
        
        System.out.println("ArrayDeque : " + ad);
        
        ad.pop();
        System.out.println(ad.pop());  
        
        ad.peek();
        System.out.println(ad.peek());
    }
}

