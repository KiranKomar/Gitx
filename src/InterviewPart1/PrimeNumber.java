package InterviewPart1;

public class PrimeNumber {

	public static void main(String[] args) {
		int n=1;
		int count=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{count++;}
			
		}
		if(count==0 &&n>1)
		{System.out.println("it is prime");
		
		}
		else
		{
			System.out.println("not prime");
		}
	}

}
