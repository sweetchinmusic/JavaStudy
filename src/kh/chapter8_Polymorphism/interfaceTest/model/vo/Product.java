package kh.chapter8_Polymorphism.interfaceTest.model.vo;


// 미완성 클래스 / 추상 클래스
public abstract class Product {
	public Product() {}
	
	public void printProduct() {
		System.out.println("제품 정보 내용입니다.");
	}
	
	// 미완성 메소드 / 추상 메소드
	// 구현부( { } )가 없는 메소드의 머리만 있는 구조
	public abstract void testMethod1();
	
}
// bin에서 봤을 땐 클래스 파일로 뜬다.
class Test {
	
}