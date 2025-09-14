package InterviewPart2;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int[]a= {3,45,3,3,43};
		int u=a.length;
		int b[]=new int[u];
		int yu=0;
		
for (int i = 0; i < a.length; i++) {
	boolean hu=false;
	for (int j = 0; j < b.length; j++) {
		if(a[i]==b[j])
		{
			hu=true;
		}
	}
	if(!hu)
	{
		b[yu++]=a[i];
	}
}
for (int jd = 0; jd < yu; jd++) {
System.out.print(b[jd]+" ");
}
	}

}
