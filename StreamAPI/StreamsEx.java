package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class StreamsEx {
	public static void main(String[] args) {
		
		List<Integer>list= Arrays.asList(2,5,6,8,9,7);
		
//		for(int i =0;i<list.size();i++) {
//		    System.out.println(list.get(i));
//		}
		
		for(int n :list) {
			System.out.println(n);
		}
		
		list.forEach(n -> System.out.println(n));
	}
}
