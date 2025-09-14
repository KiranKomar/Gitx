package InterviewPart2;

public class MissingNinSeries {

	public static void main(String[] args) {
		int []a= {1,2,3,4,5,7};
		int n=7;
		
		int sum=0;
		int exp=n*(n+1)/2;
		for(int k:a)
		{
			sum+=k;
		}
		int m=exp-sum;
		System.out.println(m);

	}

}
