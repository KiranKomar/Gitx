package SDETInterviewPractice;

public class NoOfOccuranceOfaChar {

	public static void main(String[] args) {
		String s="kiran sk beaast aaabot";
		/*s=s.toLowerCase();
char u[]=s.toCharArray();
int c=0;
for(int i=0;i<u.length;i++)
{
if(u[i]=='a')
{c++;}
		}
System.out.println(c);
	}*/
	int a=s.length();
	s=s.toLowerCase();
	int af=s.replace("a", "").length();
	
		
		System.out.println(a-af);
	
		
	}
}
