package assignment3.sun;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingNumList {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 10, 6, 8 };
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			list.add(a[i]);
		}

		Collections.sort(list);
		System.out.println("sorted   :" + list);
		System.out.println("Missing Elements are  :");
		for (int i = 1; i < 10; i++) {
			if (!list.contains(i))
				System.out.println( i);

		}

	}
}
