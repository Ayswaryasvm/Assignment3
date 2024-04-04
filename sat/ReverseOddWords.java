package assignment3.sat;

public class ReverseOddWords {
	public static void main(String[] args) {
		String text = "I am a software tester";
		String words[] = text.split(" ");
		for (int i = 0; i < words.length; i++) {
			if (i % 2 == 1) {

				char[] a = words[i].toCharArray();
				for (int j = a.length - 1; j >= 0; j--) {
					System.out.print(a[j]);
				}
			} else {
				System.out.print("Output  :"+words[i]);
			}
			System.out.print(" ");

		}

	}
}
