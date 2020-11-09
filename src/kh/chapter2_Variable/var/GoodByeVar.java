package kh.chapter2_Variable.var;
import java.util.*;
public class GoodByeVar {
	
	

		public void method() {
			// 기본 자료형의 사칙 연산
			int num1 = 10;
			int num2 = 20;
			
			
			//기본 자료형으로 값을 변수에 저장하여
			//사칙연산 수행하기
			// + = 덧셈
			// - = 뺄셈
			// * = 곱셈
			// / = 나눗셈
			// % = 나머지
			
			System.out.println(num1 + num2);
			System.out.println(num1 - num2);
			System.out.println(num1 * num2);
			System.out.println(num1 / num2);
			System.out.println(num1 % num2);
			
		}
		public void method2() {
			// 스캐너를 통해 두 수를 입력받고
			// 두 수의 사칙연산 결과 출력하기
			Scanner sc = new Scanner(System.in);
			 int num1;
			 int num2;
			
			 System.out.print("num1 : ");
			num1 = sc.nextInt();
			 System.out.print("num2 : ");
			num2 = sc.nextInt();
			
			
			
			
			 System.out.println(num1 + num2);
			 System.out.println(num1 - num2);
			 System.out.println(num1 * num2);
			 System.out.println(num1 / num2);
				
		}
		public void method3() {
			// 기본 자료형이 아닌 문자열과 덧셈하기
			// 문자열은 어떤 숫자나 수치를 더해도 문자열이 된다.
			// ex) "비밀번호" + 486 ---> "비밀번호486"
			// 	   "야" + 48 + 82 + " 너 내려"
			//         ---> " 야4882 너 내려"
			// 		"야 " + (48 + 82) + " 너 내려"
			//			---> "야 130 너 내려"
			System.out.println("안녕하세요" + 2020);
			System.out.println(2020 + "안녕하세요");
			System.out.println("안녕하세요" + 20 + 20);
			System.out.println(20 +20 + "안녕하세요");
			System.out.println("안녕하세요" + 20 +15.0 + 100);
			//문자열의 우선순위 중요.
			
			
			
			
			
			
			
			
		}
		
		
		
		
}
