package InterviewPart4;

public class Perfect {

	public static void main(String[] args) {
		int n=0;
		int sum=0;
		if(n==0)
		{System.out.println("it is zero");}
		 
		else
		{
			for(int i=1;i<=n/2;i++)
			 {
				 if(n%i==0)
				 {
					 sum+=i;
				 }
			 }
			 if(sum==n)
			 {
				 System.out.println("perfect");
			 }
			 else
			 {
				 System.out.println("not perfect");
			 }

		}}
		}


