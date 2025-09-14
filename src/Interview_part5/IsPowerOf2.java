package Interview_part5;

public class IsPowerOf2 {

	public static void main(String[] args) {
		int n=8;
		
		while(n%2==0&&n!=0)
		{
			n=n/2;
		}
		if(n==1)
		{
			System.out.println("it is power of 2");
		}
		else {
		System.out.println("not power of 2");
		}
	}

}
