package kh.chaptes12_Collection.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestGenerics2 {

	public static void main(String[] args) {
		// 맵 객체에 제네릭 적용하기
		
		HashMap<String, Book> hmap
		= new HashMap<>();

		inputMap(hmap);
		outputMap(hmap);
		
	}

	
	public static void inputMap(HashMap<String, Book> hmap) {
		// 전달받은 HashMap에 객체 저장하기
		//list,set은 add로 저장하지만
		hmap.put("1", new Book("수학익힘책"));
		hmap.put("2", new Book("언어의온도"));
		hmap.put("3", new Book("1Q84"));
		hmap.put("4", new Book("해리포터 시리즈"));
		hmap.put("5", new Book("부자아빠 가난한아빠"));
		hmap.put("6", new Book("마시멜로 이야기"));
		
		System.out.println("총 " + hmap.size()
		 		 		 + "만큼의 책이 저장되었습니다.");
		
	}
	
	public static void outputMap(HashMap<String, Book>hmap) {
		// 매개변수로 map을 받아
		// 하나씩 꺼내는 메소드
		
		// 1. keySet() 사용하기
		Set<String> keys = hmap.keySet();
		
		Iterator<String> iter = keys.iterator();
		
		while(iter.hasNext()) {
			String key = iter.next();
			
			System.out.println(hmap.get(key));
		}
		// 값만 가져오는, 책만 가져오는!
		
		// 2. values() 사용하기
		ArrayList<Book> list = new ArrayList<>(hmap.values());
		
		for(Book b : list) {
			
			System.out.println(b);
			
		}
		
		// 3. entrySet() 사용하기
		
		Set<Entry<String, Book>> entrySet = hmap.entrySet();
		
		Iterator<Entry<String, Book>> iter2 = entrySet.iterator();
		
		while(iter2.hasNext()) {
			Map.Entry<String, Book> entry = iter2.next();
			
			String key = entry.getKey();
			Book value = entry.getValue();
			
			System.out.println(key +  " : " + value);
		}
		
	}
}
