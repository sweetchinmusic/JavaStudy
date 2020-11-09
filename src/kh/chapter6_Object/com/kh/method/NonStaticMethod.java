package kh.chapter6_Object.com.kh.method;
public class NonStaticMethod {
	// 매개 변수의 유무, 반환 자료형의 유무에 따른
	// 일반 기능 제공 메소드 사용하기
	
	// 1. 매개변수 X, 반환 자료형 X
	public void method1(){
		// 아무 값도 받지 않고,
		// 어떤 값도 반환하지 않는(돌려주지 않는)
		// 일반 기능 제공 메소드
		// 자신의 역할을 수행한 뒤 종료 시에
		// 자신을 호출했던 위치로 돌아간다.
		
		System.out.println("매개변수 X, 반환값 X 인 메소드입니다. ^_^");
		
		return; // 모든 메소드는 return을 반드시 해야 하지만,
				// 반환 자료형이 없는 void는 return을 생략할 수 있다.
				// 생략할 경우 JVM이 자동으로 만들어 수행한다.
	}
	
	// 2. 매개변수 X, 반환 자료형 O
	public String method2() {
		// 메소드의 특정 기능을 수행한 후
		// 선언된 반환 자료형에 따른 값을
		// 돌려주는 메소드
		
		String str = "매개변수 X, 반환값 O인 메소드입니다. -_-";
		return str; // 반환 자료형이 있을 경우 반드시 return을 써야 한다!
	
	
	}
	
	// 3. 매개변수(전달인자:parameter: param) O, 반환 자료형 X
	public void method3(int num1, int num2) {
		// 주어진 매개변수를 활용하여
		// 특정 기능을 실행하는 메소드
		
		
		System.out.println(num1 + num2);
	
	}
	
	// 4. 매개변수 O, 반환 자료형 O
	public int method4(int num1, int num2) {
		// 매개변수를 활용하여
		// 특정 값을 돌려주는 일반 메소드
		
		return (num1 - num2) ;
	}
}
















