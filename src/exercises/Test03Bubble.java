package exercises;

import java.util.*;

public class Test03Bubble {

	public static void main(String[] args) {

		Test03Bubble bu = new Test03Bubble();
		
		// List
		System.out.println("* Lists");
		
		// original
		List<Integer> list = Arrays.asList(2,67,3,4,9,2,3,1);
		System.out.println(list);
		System.out.println(bu.bubbleList(list));
		
		// Array
		System.out.println("* Arrrays");
		// original
		int array[] = {4,2,6,3,8,7,9};
		System.out.println(Arrays.toString(array));
		
		// sorted
		int sorted[] = bu.bubbleArray(array); 
		System.out.println(Arrays.toString(sorted));
		
		// reverse
		int reverse[] = bu.bubbleArrayReverse(array);
		System.out.println(Arrays.toString(reverse));

	}
	
	public List<Integer> bubbleList(List<Integer> list) {
		
		int it = 0;
		for(int i=0;i<list.size();i++) {
			
			boolean hasChange = false;
			for(int j=0;j<(list.size()-1);j++) {
				it++;
				if(list.get(j)>list.get(j+1)) {
					hasChange = true;
					int temp = list.get(j+1);
					list.set(j+1, list.get(j));
					list.set(j, temp);
				}
			}
			if(!hasChange) {
				break;
			}
		}
		//System.out.println("Iterations: "+ it);
		return list;
	}
	
	public int[] bubbleArray(int[] array) {
		int it = 0;
		for(int i=0; i< array.length; i++) {
			boolean hasChange = false;
			for(int j=0;j< (array.length-1);j++ ) {
				it++;
				if (array[j]>array[j+1]) {
					hasChange = true;
					int temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
			if(!hasChange) {
				break;
			}
		}
		//System.out.println("Iterations: "+ it);
		return array;
	}
	
	public int[] bubbleArrayReverse(int[] array) {
		int it = 0;
		for(int i=0; i< array.length; i++) {
			boolean hasChange = false;
			for(int j=0;j< (array.length-1);j++ ) {
				it++;
				if (array[j]<array[j+1]) { // <------------ the difference is here
					hasChange = true;
					int temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
			if(!hasChange) {
				break;
			}
		}
		//System.out.println("Iterations: "+ it);
		return array;
	}
}
