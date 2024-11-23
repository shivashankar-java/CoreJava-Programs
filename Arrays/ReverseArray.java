package Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int arr[]=new int[]{4,7,6,8,3};
		  System.out.println("Original array is:");
		  
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
           System.out.println();
           System.out.println("Reversed array is:");
           
           for(int i=arr.length-1;i>=0;i--) {
		System.out.print(arr[i] + " ");
	}	
  }
}


