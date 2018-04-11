package exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test04SortJavaLibs {
	
	public static void main(String []args) {
		// sort using java libs		
		List<Integer> list = Arrays.asList(2,67,3,4,9,2,3,1);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
	}
	
}
