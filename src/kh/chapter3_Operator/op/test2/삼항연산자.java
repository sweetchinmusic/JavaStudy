package kh.chapter3_Operator.op.test2;
import java.util.*;
public class 삼항연산자 {
	//비교할 항목이 3개인 연산자
	// (조건식) ? "참일 때 값" : "거짓일 때 값";
	// 조건식이 반드시 참이나, 거짓이 나오게 하여
	// 해당하는 논리 결과에 맞는 값을 선택하여 꺼내오는 연산자
	
	public void testMethod() {
		// 정수 하나를 입력받아 양수인지, 음수인지 선택하는 조건문 만들기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 하나 입력 : ");
		
		int num = sc.nextInt();
		
		// 단일 사용 예시
		//String result = (num > 0) ? "양수입니다" : "음수입니다";
		
		// 중첩 사용 예시
		String result
		 = (num > 0) ? "양수입니다" : (num == 0) ? "0입니다" :
			 "음수입니다";
		
		System.out.println("결과 확인 : " + result);
		
		
		
	}
	
	public void myMethod() {
		//선언부
		Scanner sc = new Scanner(System.in);
		System.out.println("나이 입력 : ");
		int num = sc.nextInt();
		String result = (num >24 ) ? "노년층입니다"
				: (9 <= num && num <= 24) ? "청소년입니다" : "아기입니다";
		System.out.print("결과 확인 : " + result);
		// 삼항 연산자를 사용해서 
		// 9 ~ 24 세의 청소년을 감별하는 코드 구현하기
		// [조건]
		// 만약 9 ~ 24세의 사람이 들어오면 "청소년입니다"
		//  9세 미만의 사람이 들어오면 "아기입니다"
		// 24세를 초과한 사람이 들어오면 "노년층입니다"
		
		
	}
		public void myMethod1() {
			Scanner sc = new Scanner (System.in);
			String result;
			int age = sc.nextInt();
			
		// 출력부
		// 청소년 ( 9 <= age <= 24 ) --> (age < 9) / (age > 24)
		result = (age < 9 ) ? "아기입니다" : (age > 24) ? "노년층입니다" : "청소년입니다";
		System.out.println("결과 확인 : " + result);
			
		
	}


}

