package kh.chapter4_Statement.logic;

import java.util.Scanner;

public class BeforeLogicTest {

	// 제어문에서 어떠한 조건을 만들어
	// 선택 사항을 구현하려면
	// 먼저 비교 연산자를 잘 쓸 수 있어야 한다.
	public void testMethod1() {
		// 조건식에 들어갈 비교 연산자 연습
		
		// 아래 4개의 변수를 활용하여
		// 비교 연산자를 사용한 true / false 결과를 각각
		// 15개씩 만들어 보기
		int num1 = 10;
		int num2 = 15;
		double num3 = 10.0;
		char ch = 'A';
		
		
		//15개 ----------- true ------------- //
		System.out.println(num1 < num2);
		System.out.println(num1 <++ num2);
		System.out.println(num1 %2 == 0);
		System.out.println(num1 == num3);
		System.out.println(num2 % 2 == 0);
		//30개 ----------- false ------------ //
		System.out.println(!(0<num1));
		System.out.println(num2 % 2 == 1);
		System.out.println(0<num1&&num1<10);
		System.out.println(num1 == num2);
		System.out.println(num2 == num3);
		System.out.println(num1 != num1);
		System.out.println(num2 != num2);
		System.out.println(num3 != num3);
		System.out.println(num1 <-- num3);
		System.out.println(num1 < num3);
		System.out.println(num1 <++ num3);
		System.out.println(num1 > num2);
		System.out.println(num1*num2 <num3);
	}
	
	public void testMethod2() {
		// 참, 거짓으로 조건식을 만들어
		// 선택문장 구현하기
		
		// 삼항 연산자를 사용한 경우
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 하나 입력: ");
		int num = sc.nextInt();
		
		String result = (num > 0) ? "양수다" : "양수 아니다";
		
		System.out.println("입력한 숫자는 " + result);
		// 조건을 처리하기 위한 if 조건문
		// [사용법] if(조건식) { 실행할 코드 }
		//  : 만약에 조건식이 true 라면 {} 안의 코드를 실행한다.
		// 만약 실행할 코드가 한 줄이라면,
		// if (조건식) 실행할 내용; // 즉, {} 생략이 가능하다.
		if(num > 0) { // -- if 문 시작
			
			System.out.println("입력하신 숫자는 양수 입니다.");
			
		}else { 
			// if 조건문에 해당되지 않을 경우
			// 실행하는 구문을 else에 작성한다.
			System.out.println("입력하신 숫자는 양수가 아닙니다.");
		}
		
		// 만약 표현하고자 하는 선택이 3가지 이상이라면 
		// if- else if -else 형태로 구현한다.
		if(num >0) {
			
			System.out.println("양수입니다.");
		} else if(num == 0) {
			System.out.println("0 입니다.");
		} else {
			
			System.out.println("음수 입니다.");
		}
		//삼항연산자랑 작업속도는 비슷하다 컴퓨터는 if else로 받아들이기 때문에
		
		
	}
}
