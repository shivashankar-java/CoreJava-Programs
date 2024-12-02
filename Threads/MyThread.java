package Threads;

	class MyThread extends Thread {
	    public void run() {
	        for (int i = 1; i <= 5; i++) {
	            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
	            
	            try {
	                Thread.sleep(500); // Pause for 500ms
	                
	            } catch (InterruptedException e) {
	                System.out.println("Thread interrupted: " + e.getMessage());
	            }
	        }
	    }
	}
	

	


