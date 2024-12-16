package Constructors;

public class Rectangle {
	
	    int length, width;
	    public Rectangle() {
	        length = 0;
	        width = 0;
	    }

	    public Rectangle(int length, int width) {
	        this.length = length;
	        this.width = width;
	    }

	    public void area() {
	        System.out.println("Area: " + (length * width));
	    }
	}

	

