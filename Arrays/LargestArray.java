package Arrays;

public class LargestArray {

	public static void main(String[] args) {
		int arr[]=new int[] {89,75,95,35,65};
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
//		System.out.print(arr[i]+ " " );
			
		if(arr[i]>max) 
			max=arr[i];
		}
		System.out.println("Largest number is:" + max);
		
		
	}

}
