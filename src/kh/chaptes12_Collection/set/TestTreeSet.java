package kh.chaptes12_Collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		// Tree 구조를 활용하여
		// 데이터를 저장함으로써
		// 자동으로 정렬 처리까지 수행하는 클래스
		
		TreeSet tset = new TreeSet();
//		Set tset = new TreeSet();//다형성 활용해서 만들 수 있다.
		
		tset.add("순대국밥");
		tset.add("파스타");
		tset.add("제육덮밥");
		tset.add("우동");
		tset.add("튀김우동");
		tset.add("회덮밥");
		
		// 1. tree set을 사용하면
		// 데이터 저장 시 자동으로
		// 오름차순 정렬을 수행한다.
		System.out.println("tset : " + tset);
		
		// set은 순서 유지가 안되기 때문에
		// 하나씩 출력하는 방법이
		// list와 다르다!
		
		// 1. Object[] 로 만들어 하나씩 꺼내는 방법
		Object[] arr = tset.toArray();
		
		for( int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
			
		
		// 2. Iterator 로 목록화(일렬로 나열)처리하여
		// 	  하나씩 꺼내는 방법
		Iterator iter = tset.iterator();
		
		while(iter.hasNext()) {
			
			System.out.println(iter.next());
		}
		
		
		
		
		
		
		
		
	}

}
