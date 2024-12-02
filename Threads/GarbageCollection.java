package Threads;

public class GarbageCollection {
	    // Override finalize() method to track when the object is garbage collected
	    @Override
	    protected void finalize() throws Throwable {
	        System.out.println("An object is garbage collected!");
	    }

	    public static void main(String[] args) {
	        // Step 1: Create objects
	        GarbageCollection gc1 = new GarbageCollection();
	        GarbageCollection gc2 = new GarbageCollection();

	        gc1 = null; // obj1 is now eligible for garbage collection

	        gc2 = new GarbageCollection(); // The old object referenced by obj2 is now eligible for GC

	        System.gc();

	        try {
	            Thread.sleep(500);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        System.out.println("End of program.");
	    }
	}


