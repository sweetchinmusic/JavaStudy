package kh.chapter3_Operator.op.test2;
import java.util.*;
public class 논리부정연산자 {
	// !논리값 : 해당하는 논리값을 반대로 뒤집는 연산자
	// !true --> false, !false --> true
	
	public void testMethod() {
		
		System.out.println("!true의 반대 : " + !true);
		System.out.println("!false의 반대 : " + !false);
		
		// 활용하기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		System.out.println("입력한 정수가 짝수인가요? : "
					+ (num % 2 == 0));
		System.out.println("입력한 정수가 홀수인가요? : "
					+ !(num % 2 == 0));
		
		System.out.println("입력한 정수가 양수인가요? : "
					+ (num > 0));
		System.out.println("입력한 정수가 양수가 아닌가요? : "
					+ !(num > 0));
		
	}

}
