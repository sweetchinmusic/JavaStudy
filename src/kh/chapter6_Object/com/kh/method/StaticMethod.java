package kh.chapter6_Object.com.kh.method;

public class StaticMethod {
	// 프로그램 실행 시 static 영역에 저장되고
	// 프로그램 종료 시 소멸되는 공유 용도의 메소드
	
	// 1. 매개변수 X 반환값 X
	public static void method1() {
		
		int num1 = 100;
		int num2 = 200;
		
		System.out.println("sum : " + (num1 + num2));
	}
	// 2. 매개변수 X 반환값 O
	public static int method2() {
		
		int num1 = 10000;
		int num2 = 1000;
		
		return num1 - num2;
	}
	
	// 3. 매개변수 O 반환값 X
	public static void method3(String name) {
		
		System.out.println(name + "님이 로그인하셨습니다."); 
	}
	
	// 4. 매개변수 O 반환값 O  //이게 왜 빨라 진다고???
	public static String method4(String name) {
		
		return name + "님께서 로그아웃 하셨습니다, 잘 가요!";
		
	}
}
