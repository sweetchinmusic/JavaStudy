package kh.chapter8_Polymorphism.product.run;

import kh.chapter8_Polymorphism.poly.model.vo.Product;
import kh.chapter8_Polymorphism.poly.model.vo.SmartPhone;
import kh.chapter8_Polymorphism.poly.model.vo.Tablet;
import kh.chapter8_Polymorphism.poly.model.vo.Tv;

public class Main {

	public static void main(String[] args) {
		// Product 클래스를 활용하여
		// 3가지 제품을 만들고
		// 각 제품을 display() 메소드로 실행확인하기
		// 가장 가격이 저렴한 제품 찾기
		
		// -- 입력 예시 --
		// PAVV 1000
		// Galasay 1500
		// IamPad 2000
		
		// -- 출력 예시 --
		// PAVV : 1번 채널 보여줍니다.
		// Galasay : 휴대폰화면을 보여줍니다.
		// IamPad : 태블릿 화면을 보여줍니다.
		
		Product[] pArr = new Product[3];
		pArr[0] = new Tv("PAVV", 1000);
		pArr[1] = new SmartPhone("Galasay", 1500);
		pArr[2] = new Tablet("IamPad", 2000);
		
		Product minPrice = pArr[0];
		/* 일반 for 문
		for(int i = 0; i < pArr.length ; i++) {
			pArr[i].display();
//			
//			if(pArr[i].getPrice() < minPrice.getPrice()) {
//				minPrice = pArr[i];
//			}
			
			// 삼항 연산자 사용하기
			minPrice = (pArr[i].getPrice() < minPrice.getPrice()) ? pArr[i] : minPrice;
		
		}
		*/
		
		// for-each 반복문 사용하기
		for(Product p : pArr) {
			p.display();
			
			if(p.getPrice() < minPrice.getPrice()) {
				minPrice = p;
			}
			
			if(p instanceof Tv) {
				((Tv)p).setChannel(10);
				
				p.display();
			}
		}
		
		System.out.println("------------------");
		System.out.println("가장 저렴한 제품은 "
						 + minPrice.getModelName() + "입니다.");
		
				
				
				
				
			
//		Tv[] t = new Tv[10];
//		SmartPhone[] s = new SmartPhone[10];
	// 다형성!
//		Product[] p = new Product[10]; // 통합관리가 편하기 때문 // 배열은 같은 자료형 아니면 같이 할 수 없는데 다형성은 가능하다.
//		p[0] = new Tv();
//		p[1] = new SmartPhone();
		
		
	}

}
