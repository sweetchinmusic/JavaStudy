package kh.chaptes12_Collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {
	// Set : 
	//    자료구조 유형 중 List와 대조되는 특성을
	//    가진 기법으로, 순서가 유지되지 않으며
	//    중복을 허용하지 않는다.
	//    이를 집합이라고 표현하기도 한다.
	//    이러한 set의 종류는 
	//    HashSet, TreeSet, LinkedHashSet 등이 있다.
	//
	public static void main(String[] args) {
		// HashSet 연습
		HashSet hset = new HashSet();
		
		// 다형성을 활용할 경우
		// Set hset = new HashSet();
		// Collection hset = new HashSet();
		
		hset.add("사과");
		hset.add(36764);
		hset.add(true);
		hset.add(52.6);
		hset.add('A');
		
		// 1. 저장 순서가 유지되지 않는다.
		// 2. toString() 이 재정의 되어 있다.
		System.out.println(hset);
		
		// 3. 중복을 허용하지 않는다.
		hset.add("사과");
		hset.add("파인애플");
		hset.add("10분 뒤에");
		
		System.out.println(hset);
		System.out.println("hset의 개수 : " + hset.size());
		System.out.println("특정 값 포함 여부 : " + hset.contains("사과"));
		
		// 순서가 유지되지 않는
		// Set의 각 요소를 차례대로 꺼내는 방법
		
		System.out.println("--------------------------------");
		
		// 1. set의 내용을 배열로 만들어
		//    하나씩 꺼내는 방법
		
Object[] oArr = hset.toArray();
		
		for(Object obj : oArr) {
			
			System.out.println( obj );
			
		}
		
		// 2. set 객체의 각 요소를 목록의 형태로
		//    만들어 (목록화하다 : iterator) 하나씩
		//    찾아오는 방법
		
		Iterator iter = hset.iterator();
		
		// 다음에 꺼내 올 요소가 있는지 확인한다.
		while(iter.hasNext()) {
			// 현재 요소를 꺼내오고 다음 차례로 이동한다
			System.out.println(iter.next());
		}

		// set 객체를 통째로 비우기
		hset.clear();
		
		System.out.println(hset);
		System.out.println("hset이 비었나요? " + hset.isEmpty());
		
	}
}







