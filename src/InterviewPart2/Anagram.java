package InterviewPart2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String a="ABcd";
		String b="Cdb    A";
		
		a=a.toLowerCase();
		b=b.toLowerCase();
		
a=a.replaceAll("\\s", "");
b=b.replaceAll("\\s", "");

char[]a1=a.toCharArray();
char[]b1=b.toCharArray();


Arrays.sort(a1);
Arrays.sort(b1);

boolean res=Arrays.equals(a1, b1);
if (res)
{
	System.out.println("anagram");
	}
else
{
	System.out.println("not anagtam");}


	}

}
