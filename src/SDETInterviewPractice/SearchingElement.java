package SDETInterviewPractice;

import java.util.Scanner;

public class SearchingElement {

	public static void main(String[] args) {
	
	        int[] arr = {5, 12, 7, 9, 21, 33, 45};

	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the element to search: ");
	        int target = scanner.nextInt();

	        boolean found = false;
	        int index = -1;

	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == target) {
	                found = true;
	                index = i;
	                break;
	            }
	        }

	        if (found) {
	            System.out.println("Element " + target + " found at index " + index);
	        } else {
	            System.out.println("Element " + target + " not found in array.");
	        }

	        scanner.close();
	    

	}

}
