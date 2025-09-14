package SDETInterviewPractice;

public class RemovingSpecificCharacter {

	public static void main(String[] args) {
		String s="joh*(*(&*(&(&";
		s=s.replaceAll("[^a-zA-Z0-9]","" );// here other that these everything will be removed
		
		System.out.println(s);

	}

}
