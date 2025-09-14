package SimplePracticeAlreadyDidOne;

public class MaxOcuuredCharacter {

	public static void main(String[] args) {
		String s="kokkk kkk  markijjjj";
		s=s.replaceAll("\\s", "");
			System.out.println(s);	
		int arr[]=new int[256];
		
		for(int i=0;i<s.length();i++)
		{
			arr[s.charAt(i)]=arr[s.charAt(i)]+1;
			
			
		}
		
		int max=-1;
		char c=' ';
		for(int i=0;i<s.length();i++)
		{
		if(arr[s.charAt(i)]>max)
		{
			max=arr[s.charAt(i)];
		 c=s.charAt(i);
		}
		}
System.out.println("maximu repeted "+ c);
	}

}
