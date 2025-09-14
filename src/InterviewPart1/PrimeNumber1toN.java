package InterviewPart1;

import java.util.Iterator;

public class PrimeNumber1toN {

	public static void main(String[] args) {
int n=1453;
int ac=n;
int sum=0;
while(n!=0)
{
int temp=n%10;
sum+=Math.pow(temp, 3);
n=n/10;
}
if(ac==sum)
{
	System.out.println("armstron");
		}
	else{
		System.out.println("not an armstron");
	}
	}
	}


