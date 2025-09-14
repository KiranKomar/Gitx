package SimplePracticeAlreadyDidOne;

public class IntegerChecking {

	public static void main(String[] args) {
		String s[]= {"s","54","5"};

		int sum=0;
		for(String k:s)
		{
			try {
			sum+=Integer.parseInt(k);
		}
			catch (Exception e) {
				// TODO: handle exception
			}}
		
		System.out.println(sum);
	}

}
