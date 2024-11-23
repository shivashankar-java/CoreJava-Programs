package Arrays;

public class JaggedArray {

	public static void main(String[] args) {
		int arr[][]=new int[3][];
		
		arr [0]=new int[8];
		arr [1]=new int[6];
		arr [2]=new int[7];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
			   arr [i][j]=(int) (Math.random() * 10);
//			System.out.println(nums[i][j]);
		}
	 }
	 
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[i][j] + " ");
		}
		System.out.println();
	}


	}

}
