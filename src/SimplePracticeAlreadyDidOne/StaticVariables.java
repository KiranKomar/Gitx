package SimplePracticeAlreadyDidOne;

public class StaticVariables {
	static int c=0;
	
	 void count()
	{
		c++;
		System.out.println(c);
		
	}

	public static void main(String[] args) {
		StaticVariables s1=new StaticVariables();
		StaticVariables s2=new StaticVariables();
		StaticVariables s3=new StaticVariables();
s1.count();
s2.count();
s3.count();
		
		
		
		
	}

}
