package SDETInterviewPractice;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SortingReverseSort {

	public static void main(String[] args) {
		int []a= {4,45,43,4};
		Integer []b= {4,3,34,32};
		// sorting
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		// reverse sorting
		
Arrays.sort(b,Collections.reverseOrder());
System.out.println(Arrays.toString(b));

	}

}
