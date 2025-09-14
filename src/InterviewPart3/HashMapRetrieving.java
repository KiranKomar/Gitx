package InterviewPart3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapRetrieving {

	public static void main(String[] args) {
		Map<String,Integer>map=new HashMap<>();
map.put("komar", 33);
map.put("rfd", 433);
map.put("kodmar", 43);
/*
 * for (Entry<String,Integer> entry: map.entrySet()) { String hu=entry.getKey();
 * Integer s=entry.getValue(); System.out.println(hu+" "+s); }
 */
for(String a:map.keySet())
{
	System.out.println(a);
	}
	
	}

}
