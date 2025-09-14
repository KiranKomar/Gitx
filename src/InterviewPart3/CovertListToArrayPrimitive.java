package InterviewPart3;

import java.util.ArrayList;
import java.util.Arrays;

public class CovertListToArrayPrimitive {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(432);
		a.add(43);

		int[] j = new int[a.size()];
		for (int i = 0; i < a.size(); i++) {
			j[i] = a.get(i);
		}
		System.out.println(Arrays.toString(j));

	}

}
