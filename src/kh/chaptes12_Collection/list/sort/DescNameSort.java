package kh.chaptes12_Collection.list.sort;

import java.util.Comparator;

public class DescNameSort implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Product p1 = (Product) o1;
		Product p2 = (Product) o2;
		
		return p2.getName().compareTo(p1.getName());

		
		
		// p1,2에 위치만 바꾸면 된다
	}

}
