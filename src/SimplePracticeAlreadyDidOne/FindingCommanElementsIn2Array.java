package SimplePracticeAlreadyDidOne;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FindingCommanElementsIn2Array {

	public static void main(String[] args) {
		int a[]= {3,2,3,3,3,4,23,43};
		int b[]= {4,3,2,43};
		
		Set<Integer>su=new HashSet<Integer>();
		Set<Integer>hu=new HashSet<Integer>();

		for(int n:a)
		{
			su.add(n);
		}
for (int f : b) {
if(su.contains(f)){
	hu.add(f);
}

}

System.out.println(hu);
}
	}


