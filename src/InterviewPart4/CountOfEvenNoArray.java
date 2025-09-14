package InterviewPart4;

public class CountOfEvenNoArray {

	public static void main(String[] args) {

		int a[]= {43,43,555,544343,42};
		int count=0;
		for (int i = 0; i < a.length; i++) {
			int eac=a[i];
			int nc=0;
			while (eac!=0)
			{
nc++;
eac=eac/10;
		}
			if(nc%2==0)
			{
				count++;
			}

	}
System.out.println(count);
}}
