package kh.chaptes12_Collection.list.sort;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// 객체 리스트 정렬하기
		
		// Sample Data 3 set prepare
		ArrayList list = new ArrayList();
		list.add(new Product("Ganyuksi", 500000, 0.005));
		list.add(new Product("myPhone", 1500000, 0.05));
		list.add(new Product("myAmmyPhone", 450000, 0.01));
		//뭐가 추가될지 모르니깐
		
		System.out.println("list : " + list);
		//list에는 다양한 형태가 저장되서 객체를 뽑으면 에러가 발생한다.
		for(Object obj : list) {
			System.out.println(obj);
		}
		
		// 가격 기준 오름차순 정렬하기
		//list.sort(정렬의 기준이 될 비교용 클래스);
		list.sort(new AscPriceSort());
		
		System.out.println("---------------------------");
		// 정렬의 기준을 잡아주면 생성해주는 인터페이스
		for(Object obj : list) {
			System.out.println(obj);
		}
		list.sort(new DescPriceSort());
		
		System.out.println("----------------");
		
		for(Object obj : list) {
			System.out.println(obj);
		}
		
		// 제품 명으로 오름차순 정렬하기
		list.sort(new AscNameSort());
		
		System.out.println("----------------------");
		
		for(Object obj : list) {
			System.out.println(obj);
		}
		
		// 제품 명으로 내림차순 정렬하기
		list.sort(new DescNameSort());
		
		System.out.println("-----------------");
		
		for(Object obj : list) {
			System.out.println(obj);
		}
	}
	
}
