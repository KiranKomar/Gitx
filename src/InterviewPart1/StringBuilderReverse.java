package InterviewPart1;

public class StringBuilderReverse {
	
	
	public static void main(String[] args) {
    String input = "hello";

    // Using StringBuilder's built-in reverse() method
    StringBuilder sb = new StringBuilder(input);
    String reversed = sb.reverse().toString();
    
System.out.println(reversed);
	
	
	}
	
}

