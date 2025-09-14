package InterviewPart2;

public class CapsFirstLetterOfWordRestSmall {

	public static void main(String[] args) {
	String s="koHFr kIran";
	
String[]q =	s.split(" ");
StringBuilder sb=new StringBuilder();

for(String k:q)
{
	if(k.length()>0)
	{
		String rt=k.substring(0, 1).toUpperCase()+k.substring(1).toLowerCase();
		sb.append(rt).append(" ");
	}


	
	
	}
String re=sb.toString().trim();
System.out.println(re);

	}

}
