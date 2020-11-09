package kh.chapter6_Object.com.kh.method;

public class MethodTest {
	// 메소드는 다른 메소드를 호출할 수 있다!
	
	public void method1() {
		System.out.println("메소드 1입니다!!!!");
		// method1(); 재 귀 호 출 = 자바로 알고리즘 풀 때 밖에 
		// method2();
		
	}
	
	public void method2() {
		System.out.println("메소드 2 입니다~~~~");
		
		method3();
	
	}
	
	public void method3() {
		System.out.println("메소드 3 입니다....");
	
	}
	
	
	
}
