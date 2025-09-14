package SimplePracticeAlreadyDidOne;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class LengthOfString {

	public static void main(String[] args) {
// comman elements in the 2 array
		/*
		 * int a1[]= {1,2,3,4,5}; int b1[] = {4,5,6,7,8};
		 * 
		 * Set<Integer>s1=new HashSet<Integer>(); Set<Integer>s3=new HashSet<Integer>();
		 * 
		 * for(int a:a1) { s1.add(a); } for(int w:b1) { if(s1.contains(w)) { s3.add(w);
		 * } } System.out.println(s3);
		 */
// first and last element in the ArrayList
		ArrayList<String>s=new ArrayList<String>();
		s.add("kira");
		s.add("ks");
		s.add("kssa");
		s.add("ksio");
		
		System.out.println(s.get(0));
		System.out.println(s.get(s.size()-1));
	}

}
