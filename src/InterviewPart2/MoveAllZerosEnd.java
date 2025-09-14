package InterviewPart2;

public class MoveAllZerosEnd
{
	public static void main(String[] args) {
	int []a= {0,0,400,3,0,0,-32};
	
	int inde=0;
	
	for(int i=0;i<a.length;i++)
	{
		if(a[i]!=0)
		{
			a[inde++]=a[i];
		}
	}
	while(inde<a.length)
	{
		a[inde++]=0;
	}
	for(int n:a)
	{
		System.out.print(n+"  ");
	}

}
}