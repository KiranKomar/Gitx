package InterviewPart4;

import java.util.Iterator;

public class SplitEqualSum {

	public static void main(String[] args) {
		int []a= {4,2,5,4,8};
		int sum=0;
		for(int b:a)
		{sum+=b;};
		int ls=0;
		boolean is=true;
		for (int i = 0; i < a.length-1; i++) {
			ls+=a[i];
			int rs=sum-ls;
			if(rs==ls)
			{
System.out.println("split and works");
is=false; 
break;
			}
	}
	if(is)
	{
		System.out.println("it is not");
	}

}
}
