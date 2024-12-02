package Threads;

public class MainMyRunnable {
	    public static void main(String[] args) {
	        Thread thread1=new Thread(new MyRunnable());
	        Thread thread2=new Thread(new MyRunnable());

	        thread1.start();
//	        thread1.stop();
	        thread2.start();
	       
	    }
	}

