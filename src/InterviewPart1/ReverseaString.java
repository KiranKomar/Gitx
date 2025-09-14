package InterviewPart1;

import java.util.Iterator;

public class ReverseaString {

	public static void main(String[] args) {
		String k="kiran";
		String r = "";
		for (int i=k.length()-1;i>=0;i--)
		{
			 r=r+k.charAt(i);
		}
		System.out.println(r);
	
		}

	}


