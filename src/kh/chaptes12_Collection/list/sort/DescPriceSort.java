package kh.chaptes12_Collection.list.sort;

import java.util.Comparator;

public class DescPriceSort implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		Product p1 = (Product) o1;
		Product p2 = (Product) o2;
//		
//		int result = p1.getPrice() - p2.getPrice();
		// 값이 음수이면 자리를 바꾸지 않고 반대면 한다.

		int result = 0;
		if (p1.getPrice() > p2.getPrice()) {
			result = -1;
		} else if (p1.getPrice() < p2.getPrice()) {
			result = 1;
		}// 1 -1 판단이 더 빠름

		return result;
		
	}

}
