package InterviewPart2;

public class LargestAndSmallestInArray {

	public static void main(String[] args) {
		int[] a = { 30, 4, -90, 5 };
		int lar = a[0];
		int sl = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > lar) {
				lar = a[i];
			}
			if (a[i] < sl) {
				sl = a[i];
			}
		}
		System.out.println(lar + " " + sl);
	}

}
