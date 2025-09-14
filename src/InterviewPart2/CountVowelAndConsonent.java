package InterviewPart2;

public class CountVowelAndConsonent {

	public static void main(String[] args) {
		String s = "kihgn";
		int vowe=0;
		int cons = 0;
		s=s.toLowerCase();

		for (int i = 0; i < s.length(); i++) {

			char as = s.charAt(i);
			if (as=='a'||as =='e'||as=='i'||as=='o'||as=='u')

			{
				vowe++;
			} 
			else {
				cons++;
			}

		}
		System.out.println(" vowel "+vowe+" cons "+cons);

	}

}
