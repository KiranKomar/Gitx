package InterviewPart6;

public class DoublingEachCharacterString {

	public static void main(String[] args) {
		String s="komar";
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			sb.append(ch).append(ch);
			
		}
	System.out.println(sb.toString());

	}

}
