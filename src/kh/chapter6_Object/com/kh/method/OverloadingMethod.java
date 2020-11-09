package kh.chapter6_Object.com.kh.method;

public class OverloadingMethod {
	// 오버로딩(Overloading)
	// 다른 매개변수를 가진, 같은 이름의 메소드를 선언할 수
	// 있도록 하는 메소드명 재사용 기법
	
	// 일반적으로 메소드는 주어진 매개변수를 사용하여
	// 정해진 소스코드를 실행하는 기능을 지닌다.
	// 이 때, 만약 같은 기능을 실행하는 메소드일 경우
	// 굳이 이름을 여러개로 만들 필요가 있을까?
	// 이런 문제점에 착안하여 같은 기능을 실행하되
	// 사용하는 매개변수가 다르면 같은 이름을 가지도록
	// 하는 기술이 오버로딩이다.
	
	/* ex)
	 * 	- 덧셈을 수행하는 메소드
	 * 	public int sumInt() { . . . }
	 * 	public double sumDouble() { . . . }
	 * 	public long sumLong() { . . . }
	 */
	
	// 1. 오버로딩 테스트
	public void isZero(int num) {
		if(num == 0) {
			System.out.println("0 입니다");
		} else {
			System.out.println("0이 아닙니다");
		}
	}
	
	public void isZero(double num) {
		if(num == 0.0) {
			System.out.println("0입니다.");
		} else {
			System.out.println("0이 아닙니다");
		}
	}
	public void isZero(char ch) {
		if(ch == '0') {
			System.out.println("0 입니다");
		} else {
			System.out.println("0이 아닙니다");
		}
	}
	
	// 2. 덧셈에 대한 오버로딩 테스트
	public int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	public double sum(double num1, double num2) {
		return num1 + num2;
	}
	
	// 오버로딩 구현 시 주의해야 할 규칙
	// * 1. 메소드 명은 반드시 같아야 한다.
	// * 2. 매개변수의 갯수나 자료형, 선언 순서가 반드시 달라야 한다.
	// * 3. 반환 자료형, 접근 제한자는 달라도 된다.
	// 		(오버로딩에 영향을 미치지 않는다.)
	
	public double sum (int num1, double num2) {
		
		return num1 + num2; 
	}
	
	public double sum(double num1, int num2) {
		
		return num1 + num2;
	}
	
	public double sum(double num1, double num2, double num3) {
		return num1 + num2 + num3;
	}
	// 2 의 증명
	
//// 안되는 경우!
	//1. 동일한 메소드를 만들 경우
	//public int sum(int num1, int num2) {
	//return num1 + num2 ;
	//}
	
	// 2. 반환 자료형만 다를 경우
	//public double sum(int num1, int num2) {
	//return num1 + num2;
	//}
	// 3. 접근 제한자를 다르게 만들 경우
	
	//private int sum(int num1, int num2) {
	//return num1 + num2 ;
	//} 오버로딩과 오버라이딩 개념 혼동X !
	
	
	
	
	
}
