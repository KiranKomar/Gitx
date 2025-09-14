package InterviewPart2;

public class TwoArrayEqual {

	public static void main(String[] args) {
		int a[] ={4,4,5,3};
		int b[]= {4,4,3};
		boolean ts=true;
				if(a.length!=b.length)
				{
					ts=false;
				}
				for(int i=0; i<a.length;i++)
				{
					if(a[i]!=b[i])
					{
						ts=false;
						break;
					}
				}
System.out.println(ts);
	}

}
