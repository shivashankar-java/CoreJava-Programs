package list;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
    	
        Stack<String>stack=new Stack<>();

        System.out.println("Pushing elements into the stack:");
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        stack.push("Graphs");
        stack.push("Orange");
        
        System.out.println("Stack after pushing elements: " + stack);
                
        System.out.println("Top element: " + stack.peek());
     
        System.out.println("Popped element: " + stack.pop());
//        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after popping two elements: " + stack);

        int position = stack.search("Graphs");  
        if (position != -1) {
            System.out.println("'Graphs' found at position: " + position);
        } else {
            System.out.println("Graphs not found in the stack.");
        }

        
    }
}

