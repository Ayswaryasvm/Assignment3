package assignment3.sat;


public class MisingElement {

	public static void main(String[] args) {
		int a[] = { 1, 4, 3, 2, 8, 6, 7 };
		int temp = 0;
		System.out.println("Sorted array ");

		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a.length; j++) {
				if (a[j - 1] > a[j]) {
					temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;

				}

			}

			System.out.println(a[i]);

		}
		System.out.println("Missing element is  " );
		for (int i = 0; i < a.length; i++) {
			if (a[i] != i + 1) {
				
				System.out.println((i+1));
				break;
				
			}

		}

	}
}
