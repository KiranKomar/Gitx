package InterviewPart3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingListString {

	public static void main(String[] args) {
		List<String>s=new ArrayList<String>();
		s.add("kom");
		s.add("srin");
		s.add("aviju");
		Collections.sort(s);
		for (String string : s) {
			System.out.println(string);
		}

	}

}
