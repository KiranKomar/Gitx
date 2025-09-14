package SimplePracticeAlreadyDidOne;

import java.util.HashMap;
import java.util.Map;

public class MaxOccuranceHashMap {

	public static void main(String[] args) {
		String s="komar";
		s=s.replaceAll("\\s", "");
		
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		
	for(char ch:s.toCharArray())
	{
		if(map.containsKey(ch))
		{
			map.put(ch, map.get(ch)+1);	
		}
		else {
			map.put(ch, 1);
		}
		
		
	}
	int max=-1;
	char c=' ';
	for(Map.Entry<Character, Integer> me: map.entrySet())
	{
		if(me.getValue()>max)
		{
			max=me.getValue();
			c=me.getKey();
		}
		
	}
	System.out.println("max character is "+ c);

	}

}
