package InterviewPart6;

public class StrongNumber {

	public static void main(String[] args) {
		int a=1245;
		int yu=a;
		int sum=0;
		while(a!=0)
		{
			int g=a%10;
			int f=1;
			while(g!=0)
			{
				f=f*g;
				g--;

			}
			sum=sum+f;
			a=a/10;
			
		}
		if(sum==yu)
		{
			System.out.println("it is strong");
			}
			else {
				System.out.println("not");
			}

}}
