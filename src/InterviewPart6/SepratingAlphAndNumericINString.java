package InterviewPart6;

public class SepratingAlphAndNumericINString {

	public static void main(String[] args) {
	String s="ki33333ran45kor";
	StringBuilder al=new StringBuilder();
	StringBuilder Nu=new StringBuilder();
	for(char ch:s.toCharArray())
	{
		if(Character.isLetter(ch))
		{
		al.append(ch);	
		}
		else if(Character.isDigit(ch))
		{
			Nu.append(ch);
		}
	}
System.out.println(al.toString());
System.out.println(Nu.toString());
	}

}
