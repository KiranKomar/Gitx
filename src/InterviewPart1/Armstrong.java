package InterviewPart1;

public class Armstrong {

	public static void main(String[] args) {
		int n=153;
		
		int exp=n;
	
		int temp;
		 int sum=0;
		 while(n!=0)
		 {
			  temp=n%10;
			  sum=sum+(temp*temp*temp);
			  n=n/10;	
		 }
		if(exp==sum)
		{
			System.out.println("armstrong");
		}
		else {System.out.println("not arm");}

	}

}
