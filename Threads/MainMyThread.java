package Threads;

public class MainMyThread {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.start(); // Start thread 1
        thread2.start(); // Start thread 2
    }
}
