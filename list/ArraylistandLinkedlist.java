package list;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArraylistandLinkedlist {
   public static void main(String[] args) {
	 
	   ArrayList<String>List=new ArrayList<String>();
	   List.add("Java");
       List.add("Python");
       List.add("JavaScript");
       
       LinkedList<String>List1=new LinkedList<>();
       
       List1.add("cat");
       List1.add("books");
       List1.add("pens");
       
      List.remove(1);
      
      List1.remove(2);
      
   // Printing modified LinkedList
      System.out.println("Modified ArrayList: " + List);

      // Printing modified LinkedList
      System.out.println("Modified LinkedList: " + List1);
  }
}
