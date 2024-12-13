package Map;

import java.util.Hashtable;

public class ThreadSafe {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    hashtable.put(i, "Value" + i);
                    System.out.println("Thread 1: Added key " + i);
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(100); // Allow some additions to occur
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Thread 2: Retrieved key " + i + " -> " + hashtable.get(i));
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}


