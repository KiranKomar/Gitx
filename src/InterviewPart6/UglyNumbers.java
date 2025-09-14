package InterviewPart6;

public class UglyNumbers {
	   public static void main(String[] args) {
	        int num = 14;  // Change this to test different numbers

	        if (isUgly(num)) {
	            System.out.println(num + " is an Ugly Number");
	        } else {
	            System.out.println(num + " is NOT an Ugly Number");
	        }
	    }

	    public static boolean isUgly(int num) {
	        if (num <= 0) return false;

	        while (num % 2 == 0) num /= 2;
	        while (num % 3 == 0) num /= 3;
	        while (num % 5 == 0) num /= 5;

	        return num == 1;
	    }

}
