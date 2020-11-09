package kh.chapter7_Inheritance.inheritance;

public class Main {

	public static void main(String[] args) {
		// 부모 클래스 정보 확인
		Parents p = new Parents();
		p.printStr();
		
		// 자식 1 테스트
		Child1 c1 = new Child1();
		c1.printStr();
		c1.myPrintStr(); // 부모껀 내꺼 내껀 내꺼 이게 무슨말??
		
		// 자식 2 테스트
		Child2 c2 = new Child2();
		c2.printStr();
		
	}

}
