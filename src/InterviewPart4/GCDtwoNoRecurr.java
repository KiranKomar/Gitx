package InterviewPart4;

public class GCDtwoNoRecurr {
	public static void main(String[] args) {

int n1=100;
int n2=90;

while(n2!=0)
{
int temp=n2;
n2=n1%n2;
n1=temp;
}
System.out.println(n1);
}}
