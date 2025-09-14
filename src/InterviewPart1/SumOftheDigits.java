package InterviewPart1;

public class SumOftheDigits {

	public static void main(String[] args) {
		int n=4343;
		int sum=0;
		int t;
		while(n>0)
		{
			sum+=(n%10);
			n/=10;
		}
		System.out.println(sum);

	}

}
