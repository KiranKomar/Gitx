package InterviewPart3;

import java.util.ArrayList;

public class ListToInteger {

	public static void main(String[] args) {
		ArrayList<Integer>a=new ArrayList<Integer>();
		a.add(432);
		a.add(43);
		
		Integer []r=a.toArray(new Integer[0]);
		for (Integer integer : r) {
			System.out.println(integer);
		}

	}

}
