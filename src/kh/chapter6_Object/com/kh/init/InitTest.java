package kh.chapter6_Object.com.kh.init;

public class InitTest {
	// 객체의 필드를 초기화하는 방법
	// 1. JVM이 명시한 초기값 사용하는 경우
	private int num1 ; // 캡슐화 ---> 0
	
	// 2. 필드 생성과 동시에 직접 초기값을
	//	    대입하여 사용자 명시적 초기화를 수행하는 경우
	private int num2 = 10;
	
	
	// [3. 초기화 블록을 사용하는 경우] // 안 쓰는 경우도 있다.
	/*
	{ // 초기화 블록
		num1 = 100;
		num2 = 200;
		int sum = 100; // 테스트 용도. 초기화를 할 애들만 별도로 묶어놓는다.
	}
	*/
	
	// static 필드 변수의 경우
	private static int num3 = 10;
	
	static {// static 전용
		num3 = 100;
		// num1 = 200; //스테틱은 스테틱 끼리만 사용한다.
		}
	


// 4. 생성자를 통해 객체를 생성하며 
//    초기화를 수행하는 경우
// ** 이전에 어떤 값으로 초기화를 수행하든지 간에
//    생성자를 통해 수행한 초기화가
//	    가장 마지막으로 발생하며
//    이전 값을 덮어쓰게 된다.

	public InitTest() { // 기본 생성자 문제가 생길 때 이것을 먼저 봐야함.
		this.num1 = 500;
		this.num2 = 300;
	
	}
	public InitTest(int num1, int num2) {
		// 사용자 정의 생성자
		this.num1 = num1;
		this.num2 = num2;
	}
	public InitTest(int num1) {
		this(); // 자기 자신이 가진 생성자를
				// 호출하여 코드의 중복을 줄일 수 있다.
				// 단, 작성 시 반드시 메소드 안의
				// 제일 위에 선언되어야 한다...
		this.num2 = 30; //m 수정이 안된다고 하지 않았나??
	}
	// Getter & Setter 초기화가 아닌 수정
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public static int getNum3() {
		// static 예약어를 사용하면 공유용도로 쓰는 애들은 this를 쓸 수 없다.
		// this.을 붙일 수 없다.
		return InitTest.num3;
	}
	
	public static void setNum3(int num3) {
		InitTest.num3 = num3;
	}
	
}