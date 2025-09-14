package InterviewPart2;

import java.util.Arrays;

public class MerginSortedArray {

	public static void main(String[] args) {
		int a[]= {2,2,6};
		int b[]= {1,3,5};
		
		int sum=a.length+b.length;
		int[]r=new int[sum];
int k=0;
int i=0;
int j=0;
while(i<a.length&&j<b.length)
{
if(a[i]<b[j])
{
	r[k++]=a[i++];
	}
else
{
	r[k++]=b[j++];
	}
	}
while(i<a.length)
{
	r[k++]=a[i++];
	}
while(j<b.length)
{
	r[k++]=b[j++];
	}

System.out.println(Arrays.toString(r));
	}
}
