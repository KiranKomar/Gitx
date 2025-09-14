package InterviewPart4;

public class HarshadNumber {

	public static void main(String[] args) {
		int n=20;
		int ac=n;
		int sum=0;
		while(n!=0)
		{
			int temp=n%10;
			sum+=temp;
			n=n/10;
		}
		if(ac%sum==0)
		{
			System.out.println("harshad");
		}
		else 
		{System.out.println("not harshad");}

	}

}
