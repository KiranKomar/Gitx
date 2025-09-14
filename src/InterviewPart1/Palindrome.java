package InterviewPart1;

public class Palindrome {

	public static void main(String[] args) {
		String s="ksk";
		
		String r="";
		for(int i =s.length()-1;i>=0;i--)
		{
			r=r+s.charAt(i);
		}
		if(r.equals(s))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}

}
