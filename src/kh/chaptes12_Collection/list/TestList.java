package kh.chaptes12_Collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestList {
	// List :
	//   자료를 저장하는 구조(자료구조) 형태 중,
	//   순서가 유지되고 중복을 허용하는 자료구조 기법을 말한다.
	//   자바에서는 ArrayList, Vector, LinkedList 등이 있다.
	//   이 중 ArrayList와 Vector는 기능이 동일하나
	//   Vector는 ThreadSafe 기능이 있고, ArrayList는 ThreadSafe
	//   기능이 없는 클래스이다.
	
	public static void main(String[] args) {
		// ArrayList 연습
		
		ArrayList listA = new ArrayList();

		// 다형성을 적용한다면
		// List listA = new ArrayList();
		// Collection listA = new ArrayList();
		
		// 1. List를 포함한 Collection 객체들은
		// 여러 자료형을 하나에 담을 수 있다.
		
		listA.add("사과");
		listA.add(36764); // 기본 자료형의 경우
		listA.add(true);  // 일반 값이 래퍼 클래스로 바뀌면서
		listA.add(52.6);  // 객체화되어 들어간다.
		listA.add('A');   // int 값 --> Integer (Object의 후손)
						  // 오토박싱(Auto Boxing)이라고 한다.
		
		// 1. 순서가 유지된다.
		// 2. toString() 메소드가 재정의(Override)되어 있다.
		System.out.println(listA);
		
		// 순서가 유지되기 때문에
		// for문으로 값을 꺼낼 수도 있다.
		for(int i = 0 ; i < listA.size(); i++) {
			System.out.println(listA.get(i)); // arr[i]
		}
		
		// 3. 중복이 허용된다.
		listA.add("사과");
		listA.add(true);
		
		System.out.println("listA : " + listA);
		
		// 배열 중간의 값도 쉽게 바꿀 수 있다.
		listA.set(3, "포카칩");
		
		System.out.println("listA : " + listA);
		
		// 배열 중간에 값을 쉽게 추가할 수 있다.
		// 또한 값이 추가되며 해당 위치에 있던 값들이
		// 뒤로 밀려나는 것도 확인 할 수 있다.
		listA.add(5, "꼬북칩");
		System.out.println("listA : "  + listA);
		
		// 배열 중간 값을 삭제하면
		// 그 뒤의 값들이 앞으로 한 칸씩 이동한다.
		listA.remove(4);
		System.out.println("listA : " + listA);
		
		// 정렬 확인하기
		ArrayList sortList = new ArrayList();
		
		sortList.add("꼬북칩");
		sortList.add("포카칩");
		sortList.add("알새우칩");
		sortList.add("감자칩");
		sortList.add("초코칩");
		
		System.out.println("sortList : " + sortList);
		
		// 오름차순 정렬
		Collections.sort(sortList);
		System.out.println("sortList : " + sortList);
		
		// 내림차순 정렬
		Iterator iter = new LinkedList(sortList).descendingIterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}






