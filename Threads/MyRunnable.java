package Threads;

class MyRunnable implements Runnable {
	    public void run() {
	        for (int i = 1; i <= 2; i++) {
	            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
	            
	            try {
	                Thread.sleep(50);	
	                
	                
	                } catch (Exception e) {
	                System.out.println("Thread interrupted: " + e.getMessage());
	            }
	        }
	    }
	}

	


