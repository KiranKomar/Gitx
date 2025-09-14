package InterviewPart2;

public class PermutationOfString {

	public static void main(String[] args) {
		String s="tgrrt";
		int cou=0;
		int fa=1;
		for(int i=0;i<s.length();i++)
		{
			cou++;
		}
		for(int j=cou;j>0;j--)
		{
			fa=fa*j;
		}
		System.out.println(fa);
	}

}
