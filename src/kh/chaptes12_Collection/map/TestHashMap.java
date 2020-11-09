package kh.chaptes12_Collection.map;


import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMap {
	// Map : 
	// 	 데이터를 저장할 때
	//	 각각의 자료를 구분 지을 수 있는
	//	 고유의 값을 정하여 해당 값으로
	//	 접근할 수 있는 실제 객체를 묶어
	//	 함께 관리하는 자료 구조 클래스
	//	 해당 객체를 저장할 때에,
	//	 Key(고유의 값)는 Set의 특성으로,
	//	 Value(실제 객체)는 List의 특성으로
	//	 관리한다.
	//	 종류는 크게 HashMap, HashTable, TreeMap,
	//	 Properties 등이 있다.
	
	
	
	public static void main(String[] args) {
		// HashMap 연습
		// HashMap은 HashTable의 신버전으로 
		// 내용은 똑같으나 ThreadSafe(동시 제어) 기능이
		// 빠진 클래스이다.
		// ex) StringBuffer & StringBuilder
		//	   vector & ArrayList
		
		HashMap hmap = new HashMap();
		// 같은 변수명으로 다른 객체를 만들 수 있다?!?
		// Map hmap = new HashMap();
		// Map에 값을 저장할 때에는
		// put() 메소드를 사용하는데
		// 키(key)와 값(value) 두 가지 객체를
		// 하나로 묶어 저장해야한다.
		
		
		hmap.put("today", new Date());
		hmap.put("user01","user01입니다.");
		hmap.put(123, 12345); // 리터럴 - 박싱 -> 래퍼 클래스
		// 객체 단위로 하다보면 이 순서대로 되지 않는다.
		System.out.println("hmap : " + hmap);
		
		// 1. 키는 중복되지 않는다.
		//	    중복된 값이 들어오면 이전의 키에 대한
		//	   value를 덮어 씌운다.
		hmap.put("user01", "중복된 내용입니다.");
		
		System.out.println("hmap : " + hmap);
		
		// 2. value는 값이 중복되어도 된다.
		hmap.put("user02", "중복된 내용입니다.");
		
		System.out.println("hmap : " + hmap);
		
		System.out.println("user01 : " + hmap.get("user01"));
		System.out.println("123 : " + hmap.get(123));
		System.out.println("today : " + hmap.get("today"));
		// 명단을 만들어서 거기서 찾게 함.
		
		
		// 저장된 map 객체를 하나씩 꺼내오는 방법
		// 1. keySet() 메소드를 활용하여
		//	  set을 하나씩 꺼냈던 것 처럼 동일한 방법으로
		// 	    처리하는 방법
		
		Set keys = hmap.keySet();
		
		Iterator iter = keys.iterator();
		
		while(iter.hasNext()) {
			// key를 하나씩 꺼내어
			// value를 찾아오는 방법
			Object key = iter.next();
			
			System.out.println(hmap.get(key));
		}
		
		System.out.println("----------------------");
		// 2. values() 메소드를 활용하는 방법
		
		Collection values = hmap.values();
		
		Iterator iter2 = values.iterator();
		
		while(iter2.hasNext()) {
			
			System.out.println(iter2.next());
			// 나올 수 있으면 계속 나온다.
			
		}
		System.out.println("-----------------");
		// 3. Map.Entry 객체를 활용하는 방법
		//    key와 value 모두 꺼내어 사용할 수 있다.
		
		Set entrySet = hmap.entrySet();
		Iterator iter3 = entrySet.iterator();
		
		while(iter3.hasNext()) {
			
			// key와 value 모두를 가지는 객체를 꺼내어 온다.
			Map.Entry entry = (Map.Entry)iter3.next();
			
			// 가져온 key와 value를 각각 분리한다.
			Object key = entry.getKey();
			Object value = entry.getValue();
			
			// 출력하여 확인하기 
			System.out.println(key + " = " + value);
		
		}
		
	}
	
	

}
