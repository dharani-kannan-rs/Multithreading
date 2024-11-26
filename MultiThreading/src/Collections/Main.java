package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {

//		List<Integer> arr = new ArrayList<>();
//		arr.add(5);
//		arr.add(6);
//		arr.add(34);
//		arr.add(23);
//		arr.add(12);
//		Iterator<Integer> it = arr.iterator();
//		
//		
//			
//			while(it.hasNext()) {
//				int num = it.next();
//				System.out.println(num);
//			}
//			
//			
//			
//		for(int val : arr) {
//			
//			System.out.println(val);
//		}
		
		
		//Methods available in Queue interface.
		
//		Queue<Integer> queue = new LinkedList<>();
//		
//		
//	    queue.add(1);
//	    queue.offer(2);
//	    queue.add(3);
//	    queue.add(4);
//	    queue.add(5);
//	    for(int nums:queue) {
//	    	System.out.println(nums);
//	    }
//	    System.out.println("    ");
//	    queue.poll();
//	    
////	    queue.remove();
//	    
//	    int a = queue.peek();
//	    int b =queue.element();
//	    
//	    for(int nums:queue) {
//	    	System.out.println(nums);
//	    }
//	    
//	    System.out.println(a + "    " + b);
		
		
		int[] arr = new int[3];
		
		int[] arr1 = {1,2,3};
		
		ArrayList<Integer> arr2 = new ArrayList<>();
		
	//	ArrayList<Integer> arr3 = Arrays.asList(1,2,3,4); Type mismatch: cannot convert from List<Integer> to ArrayList<Integer>
		
	   ArrayList<Integer> arr4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4)); // Now, arr3 is a mutable ArrayList.
	   
	   List<Integer> arr5 = Arrays.asList(1, 2, 3, 4); // However, this list does not support structural modifications like adding or removing elements:

	 //  List<Integer> arr7 = List.of(1, 2, 3, 4); // java 9 -This is similar to Arrays.asList but guarantees immutability.

	   ArrayList<Integer> arr6 = new ArrayList<>();
	   arr6.add(1);
	   arr6.add(2);
	   arr6.add(3);
	   arr6.add(4);






	    
	}

}
