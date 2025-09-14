package InterviewPart1;

public class Fibonacci {

	public static void main(String[] args) {
		int sum;
		
		int a=0;
		int b=1;
		for(int i=0;i<15;i++)
		{
		sum=a+b;
		System.out.print("   "+a);
		a=b;
		b=sum;
	
		}
		

	}

}
