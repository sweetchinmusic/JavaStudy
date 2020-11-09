package kh.chaptes12_Collection.list.sort;

import java.util.Comparator;

public class AscNameSort implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Product p1 = (Product) o1;
		Product p2 = (Product) o2;
		// 순서를 어떻게 아냐!?
		
		return p1.getName().compareTo(p2.getName());
		// "가나다", "마바사"
		// '가' - '마'
		// 100 - 104 = -4; --> -1;
		
		
		
	}

}
