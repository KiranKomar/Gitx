package Interview_part5;

public class PrintNumbersDivBy5n3NotBoth {

	public static void main(String[] args) {
		
		int n=40;
		
		for(int i=1;i<=n;i++)
		{
			if((i%3==0||i%5==0)&&!((i%3==0)&&(i%5==0)))
			{
				System.out.print(i+"    ");
			}
		}
	}
}
