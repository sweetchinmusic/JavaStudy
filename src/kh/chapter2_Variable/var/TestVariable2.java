// 1. 클래스가 속한 폴더 
package kh.chapter2_Variable.var;

// 2.  클래스 이름 선언하기
// 	 - 클래스 앞글자는 영 대문자로
//   - 클래스 이름은 파일이름과 동일하게!
public class TestVariable2 {
	// 전역변수(멤버변수 / 필드변수 ) 와 지역변수
	// 만약 사용하고자 하는 변수의 내용을 여러 메소드 (기능)에서 공용으로
	// 사용하고 싶을 경우. 클래스 선언 부 바로 밑에 변수 선언을 할 수 있다.
	// - 전역변수(Global 변수 / 멤버변수 / Field 변수)
	
	// 전역 변수로 선언된 변수들은 Heap 메모리 영역에 담기며
	// 값을 직접 초기화 하지 않으면, JVM에 의해 초기값으로 대입된다.
	
	int num1 = 10;
		
	public void method1() {
		// - 지역변수
		// 메소드 안에 선언한 변수를 지역변수라고 한다.
		// 지역 변수는 Stack 메모리 영역에 담기며
		// 메소드가 호출될 때 만들어지고, 메소드가 끝날 때 함께 소멸된다.
		int num2 = 20;
		System.out.println("전역변수 테스트 : "+ num1);
		System.out.println("지역변수 테스트 : "+ num2);
		
	}
	
	public void method2() { // method2 메소드 시작!
		// 지역변수에서 따로 선언을 하지 않은 전역 변수는
		// 다른 메소드에서도 접근이 가능하지만,
		// 다른 메소드의 지역변수는 접근할 수 없다.
		System.out.println("전역변수 테스트2: " + num1);
		//System.out.println("지역변수 테스트2: " + num2); --> Error!!
		
	} // method2 메소드 종료!!
	
	public void method3() { // ~~ method3 시작!
		//전역변수와 지역변수의 이름이 같을 경우
		//지역변수를 가져온다!
		int num1 = 500;
		
		System.out.println("num1 : " + num1);
		
    } // ~~ method3 종료!!
}
