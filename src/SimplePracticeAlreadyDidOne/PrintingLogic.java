package SimplePracticeAlreadyDidOne;

import java.util.Iterator;

public class PrintingLogic {

	public static void main(String[] args) {
		int n=1;
		
		int c=2;
		System.out.print("*"+n);
		for(int i=0;i<4;i++)
		{
			int cd=n*10+c;
			
			System.out.print("*"+ cd);
			n=cd;
			c++;
		}
		
	}

}
