package Threads;

public class ThreadStatesExample {

    public static void main(String[] args) {
        Object lock = new Object(); // Used for synchronization

        // Thread in NEW state
        Thread newThread = new Thread(() -> {
            System.out.println("Inside Thread: RUNNABLE");
            synchronized (lock) {
                try {
                    lock.wait(); // WAITING state
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Print the NEW state
        System.out.println("State after creation: " + newThread.getState());

        // Start the thread (it becomes RUNNABLE)
        newThread.start();
        System.out.println("State after start: " + newThread.getState());

        // Create a thread to block the first thread
        Thread blockingThread = new Thread(() -> {
            synchronized (lock) {
                try {
                    Thread.sleep(2000); // TIMED_WAITING state
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Start blockingThread and let it acquire the lock
        blockingThread.start();
        try {
            Thread.sleep(500); // Ensure blockingThread gets the lock
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // The first thread (newThread) will now be BLOCKED
        System.out.println("State when waiting for lock: " + newThread.getState());

        // Notify the waiting thread
        synchronized (lock) {
            lock.notify();
        }

        try {
            // Wait for the first thread to finish
            newThread.join(); // WAITING state for main thread
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Thread has TERMINATED
        System.out.println("State after termination: " + newThread.getState());
    }
}

