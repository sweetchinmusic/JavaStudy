package kh.chapter6_Object.com.kh.method;

public class Main {

	public static void main(String[] args) {
//		// 메소드 테스트용 실행 메소드
//		//MethodTest m1 = new MethodTest();
//		//m1.method1();
//		
//		/* 일반 메소드 기능 테스트 */
		NonStaticMethod ntest = new NonStaticMethod();
//		
//		// 1. 매개변수 X, 반환값 X
		ntest.method1();
//		// 2. 매개변수 X, 반환값 O
		System.out.println( ntest.method2() );
//		
//		// 3. 매개변수(전달인자:parameter: param)O, 반환값 X
//		ntest.method3(100, 200);
//	
//	
//		// 4. 매개변수 O, 반환 자료형 O
//		System.out.println( ntest.method4(10, 20));
		
		
		// static 메소드들은 프로그램을 시작할 때
		// 정적 메모리 공간에 저장된다.
		// 따라서 new 할 필요가 없다!
		
//		StaticMethod.method1();
//		
//		System.out.println(StaticMethod.method2());
//		
//		StaticMethod.method3("홍김동");
//		
//		System.out.println(StaticMethod.method4("개똥벌레"));
//		
//		
	
		OverloadingMethod over = new OverloadingMethod();
		
		over.isZero(0);
		over.isZero('0');
		
		over.isZero(0.5);
		over.isZero('안');
		
		// 덧셈 오버로딩 테스트
		System.out.println(over.sum(7,10));
		System.out.println(over.sum(1.5, 20.5));
		
	
	}

}
