package assignment3.sat;

public class OddToUpperCase {
	public static void main(String[] args) {

		String test = "changeme";
		char[] a = test.toCharArray();
		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 1) {
				a[i] = Character.toUpperCase(a[i]);
			}
		}
		String result = new String(a);
		System.out.print("Output  :"+result);
	}
}
