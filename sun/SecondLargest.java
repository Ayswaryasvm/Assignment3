package assignment3.sun;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargest {
	public static void main(String[] args) {
		int a[]= {3, 2, 11, 4, 6, 7};
		List<Integer> list=new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			list.add(a[i]);
		}
		Collections.sort(list);
		System.out.println("Sorted List  :"+list);
		int size = list. size();
		int element=list.get(size-2);
		System.out.println("Second Largest Number is  :"+element);
	}

}
