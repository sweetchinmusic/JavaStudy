package kh.chapter2_Variable.cast;

public class CastingTest {
	// String, System
	// java.lang 패키지에 속한 클래스로써
	// 별도의 import 선언 없이도 사용이 가능한데,
	// 그 이유는 java.lang 패키지가 자바의
	// 기본 패키지이기 때문이다.
	// 따라서 java.lang 을 import 하지 않아도
	// 컴파일 과정에서(.java -> .class) 자동으로 추가된다.
	
	
	public void castMethod1() {
		/*
		 * 본래 컴퓨터는 어떠한 값을 처리할 때
		 * 같은 자료형 끼리만 계산이 가능하다.
		 * 하지만, 다른 자료형과도 계산이 필요한
		 * 순간이 종종 있기 때문에
		 * 각각의 자료형으로 변환해주는 캐스팅(형변환)
		 * 기술을 제공한다.
		 * 기본적으로 정수형은 실수형으로 자동 형변환이 가능하며,
		 * 실수형은 정수형으로 자동 형변환이 불가능하다.
		 * 
		 * 또한, 각각의 자료형이 다르더라도
		 * 해당 자료형 크기보다 바꾸고자하는 자료형의 크기가
		 * 더 큰 경우 자동으로 형변환을 해준다
		 * 
		 * *자료형 크기 : 1byte -> 2byte
		 */	
		// 자동 형변환이 일어나는 경우
		int num = 'A'; 
		System.out.println("num : " + num);
		
		int num2 = '안';
		System.out.println("num2 : " + num2);
		
		// char 자료형에 정수값이 저장되는지 확인하기
		char ch = 97;
		System.out.println("ch : " + ch);
		// 유니코드가 지원하는 숫자 범위 내에서는
		// 문자 자료형으로 변환이 가능하다
		
		// char 자료형에 음수 값을 넣어보기
		// char ch2 = -97;
		// char 자료형에 음수 값을 넣을 수 없다!
		
		// int로 선언한 변수를 char로 형변환하기
		// int로 이미 선언된 변수를 char에 담으려고하면
		// 4byte -> 2byte 로 바꾼다는 의미가 되어 에러가 발생한다!
		
		// 만약, 자동형변환이 안되는 상황에서 우리가 강제로 형변환을
		// 시킬 경우 변수 앞에 (바꿀 자료형)을 명시하여
		// 강제 형변환을 시켜야 한다.
		int num3 = 100;
		char ch3 = (char)num3;
		
		System.out.println("ch3 : "+ ch3);
		
		// 만약 음수 값을 명시적 형변환으로 변환한다면 ...?
		int num4 = -97;
		char ch4 = (char)num4;
		
		System.out.println("ch4 : " + ch4);
		}
	public void castMethod2() {
		// 다른 자료형들끼리 사칙연산을 수행할 경우
		// 두 자료형을 비교하여 더 큰 단위를 가진
		// 자료형으로 자동 형변환을 해준다.
		
		int num1 = 100;
		long num2 = 200;
		
		System.out.println(num1 + num2);
		
		// 1. 둘 중 더 범위가 큰 자료형으로 결과를 받는 경우
		long result1 = num1 + num2;
		
		System.out.println("result1 : " + result1);
		
		// 2. 자료형에 관계없이 강제 형변환으로 결과를 받는 경우
		//int result2 = num1 + (int)num2;
		int result2 = (int)(num1 + num2);
		System.out.println("result2 : " + result2);
		
		// 3. 해당 데이터를 처리할 수 있는 가정 큰 자료형을
		// 사용하는 경우
		
		double result3 = num1 + num2;
		
		System.out.println("result3 : " + result3);
		
		// 4. byte와 short 자료형은 사칙 연산 수행 시 그 결과가
		//	  무조건 int로 자동 형변환된다.
		
		byte num4 = 50;
		short num5 = 100;
		
		//short result4 = num4 + num5; --> Error!!
		int result4 = num4 + num5;
		
		System.out.println("result4: " + result4);
		
	}

	public void castMethod3() {
		// 데이터 손실 테스트
		long num = 250;
		
		byte result = (byte)num;
		
		System.out.println("result : " + result);
		
		// 실수형 
		double num2 = 123.45678912345;
		
		System.out.println("num2 : " + num2);
	
		float result2 = (float)num2;
		
		System.out.println("result2 : " + result2);
		
	}
	
} 

// 인트가 4바이트. 4개 전부를 부호비트 뒤에 숫자만 사용 플