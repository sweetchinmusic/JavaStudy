package kh.chapter8_Polymorphism.poly.model.vo;

public class Child2 extends Parents{
	
	public Child2() {
		// 기본 생성자는 객체의 틀을 갖추기 위해
		// super() 를 사용하며, 만약 직접 작성하지
		// 않을 경우 super(); 생락되어 JVM에 의해 
		// 자동으로 추가된다.
	}
	
	@Override // 부모꺼 안 쓰고 내꺼 쓰겠다
	public void sayMyName() {
		System.out.println("나는 두번째 자식입니다.");
		
	}
	
	public void study() {
		System.out.println("나는 공부를 잘할 거에요!!");
		
	}
	
	
}
