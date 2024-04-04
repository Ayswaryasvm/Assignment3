package assignment3.sun;

import java.util.ArrayList;
import java.util.List;

public class FindIntersectionList {
	public static void main(String[] args) {
		int a[] = { 3, 2, 11, 4, 6, 7 };
		int b[] = { 1, 2, 8,  4, 9, 7 };  
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		List<Integer> list3 = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			list1.add(a[i]);
			for (int j = 0; j < b.length; j++) {
				list2.add(b[j]);
			}
		}
		for (int temp : list1) {
			if (list2.contains(temp)) {
				list3.add(temp);
			}
		}
		System.out.println("Intersecting Elements are   :"+list3);
	}

}
