package SimplePracticeAlreadyDidOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class NonRepeatingNumber {

	public static void main(String[] args) {
		int []r= {44,4,3,3,33,2};
		
		ArrayList<Integer>j=new ArrayList<Integer>();
HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		
		for(int t:r)
		{
			map.put(t, map.getOrDefault(t, 0)+1);	
		}		
		
		for(Map.Entry<Integer, Integer> entry: map.entrySet())
		{
			if(entry.getValue()==1)
			{
				j.add(entry.getKey());
			}
			}
	
	System.out.println(j);
		
		
		
		
	}
}
