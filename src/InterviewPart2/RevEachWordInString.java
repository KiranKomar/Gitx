package InterviewPart2;

public class RevEachWordInString {

	public static void main(String[] args) {
		String s="kiran komar bhai";
		String[]l=s.split(" ");
		
		StringBuilder sb=new StringBuilder();
		
		for(String wo:l)
		{
			StringBuilder yh=new StringBuilder(wo);
			sb.append(yh.reverse()).append(" ");
			
		}
		String res = sb.toString().trim();
		System.out.println(res);

	}

}
