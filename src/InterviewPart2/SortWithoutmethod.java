package InterviewPart2;

public class SortWithoutmethod {

	public static void main(String[] args) {
		int[] a = { 4, 5, 3, 54, 67 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}

			}
		}

		for (int num : a) {
			System.out.print(num+" ");
		}

	}

}
