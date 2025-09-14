package InterviewPart2;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		int []a= {1,3,6,3,2};
		
		int b[]=new int[a.length];
		int i=0;
		int k=a.length-1;
		while(i<a.length)
		{
			b[k--]=a[i++];
		}
		System.out.println(Arrays.toString(b));

	}

}
