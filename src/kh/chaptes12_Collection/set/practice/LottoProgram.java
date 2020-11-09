package kh.chaptes12_Collection.set.practice;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

import kh.chaptes12_Collection.list.sort.Product;

public class LottoProgram {
		static Random nance = new Random();
		static HashSet hset = new HashSet();
		
	public static void main(String[] args) {
		// 1. 1~45 사이의 난수(랜덤 수) 6개
		// 2. 중복이 존재하지 않는다.
		// 3. 오름차순 정렬을 하여 화면에 보여주기
		// 4. Set 사용하기
		// 위의 조건을 만족하는 프로그램을
		// 만들어 보세요.
//	public int compare(Object o1, Object o2, Object o3, Object o4, Object o5, Object o6) {
//		Product p1 = (Product) o1;
//		Product p2 = (Product) o2;
//		Product p3 = (Product) o3;
//		Product p4 = (Product) o4;
//		Product p5 = (Product) o5;
//		Product p6 = (Product) o6;
		
//	Object[] oArr = hset.toArray();
//			
//			for(Object obj : oArr) {
//				
//				System.out.println( obj );
//		
//			}
		
		TreeSet lottoSet = new TreeSet();
		for( ; lottoSet.size()<6 ;) {
			
		lottoSet.add(new Random().nextInt(45)+1); //랜덤클래스
		}
		
		//while
		/*
		 while(lottoSet.size() < 6 {
		  	  lottoSet.add((int)(Math.random() *45 +1); //메스에 있는 메소드
		 */
	}

}
