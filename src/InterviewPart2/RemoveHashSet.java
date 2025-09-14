package InterviewPart2;

import java.util.HashSet;

public class RemoveHashSet {

	public static void main(String[] args) {
		int n[]= {3,2,3,2,56};
		HashSet<Integer>set=new HashSet<Integer>();
		
		for (int ko : n) {
			set.add(ko);
		}
		System.out.println(set);
	}

}
