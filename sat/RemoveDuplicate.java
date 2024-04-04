package assignment3.sat;

public class RemoveDuplicate {
	public static void main(String[] args) {

		String text = "We learn Java basics as part of java sessions in java week1";
		int count;

		text = text.toLowerCase();
		String words[] = text.split(" ");

		System.out.println("Duplicate words in a given string : ");
		for (int i = 0; i < words.length; i++) {
			count = 1;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {

					words[j] = " ";
					count++;
				}
			}

			if (count > 1) {
				if (count > 1 && words[i] != "0")
					System.out.println(words[i]);
				for (String word : words) {
					if (!word.isEmpty()) {
						System.out.print(word + " ");
					}
				}
			}
		}
	}
}