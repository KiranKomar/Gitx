package InterviewPart4;

import java.util.Iterator;

public class LargestWordInString {
	public static void main(String[] args) {
		String s = "ff dddsd";
		if(s==null||s.trim().isEmpty())
		{
			System.out.println("it is empty");
		}
		else {
		String[] s2 = s.split(" ");
		String lar = "";
		for (int i = 0; i < s2.length; i++) {
			if (s2[i].length() > lar.length()) {
				lar = s2[i];
			}
		}
		System.out.println("largest word is " + lar + " and length is " + lar.length());
		}
	}
}
