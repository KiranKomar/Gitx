package InterviewPart2;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int []n={33,33,33,33,};
		int la=Integer.MIN_VALUE;
		int sla=Integer.MAX_VALUE;
		for(int na:n)
		{
			if(na>la)
			{
				sla=la;
				la=na;
			
			}
			else if(na>sla&&na!=la)
			{
				sla=na;
			}
		}
if(sla==Integer.MIN_VALUE)
{
 System.out.println("no 2nd largest");
	}
else {
	System.out.println(sla);
}
	}

}
