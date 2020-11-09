package kh.chapter3_Operator.op.test2;
import java.util.*;

public class 일반논리연산자 {
	
	public void testMethod1() {
		// && (And, ~과 ~이 true일 때) - 11순위
		// || (Or, ~과 ~중 어느하나라도 true 일 때 ) - 12순위
		
		// 논리값(T/F) && 논리값(T/F)
		// 논리값(T/F) || 논리값(T/F)
		// ** 논리값이란, 어떠한 수식의 결과가 
		// 참이나 거짓으로 나오는 수식
		
		// ex) 청소년 나이
		// 9세 ~ 24세
		// 9 <= x <= 24
		// 9 <= x && x <= 24
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		System.out.println("입력한 정수가 9 ~ 24 사이인가요? "
					+ (num >= 9 && num <= 24));

		// 응용 1
		// 문자 -> 숫자
		// 대소문자 체크
		
		System.out.println("문자 하나 입력 : ");
		char ch = sc.next().charAt(0);
		
		System.out.println("대문자 인가요? " 
				+('A' <= ch && ch <= 'Z'));
		System.out.println("대문자 인가요? " 
				+( 65 <= ch && ch <= 91 ));
		
		// 응용
		System.out.println("계속하시려면 y나 Y를 입력하세요 : ");
		char ch2 = sc.next().charAt(0);
		
		System.out.println("영문자 y/Y 입력 확인 : "
				+(ch2 == 'y' || ch2 == 'Y'));
		
		
		
		
		
	}

}
