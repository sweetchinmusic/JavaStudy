package kh.chapter4_Statement.loop;

import java.util.Scanner;

public class DoWhileLoopTest {
	// do - while 테스트
	Scanner sc = new Scanner(System.in);
	
	public void beforeDoWhile() {
		// 기존의 while문은
		// 실행할 조건이 참이냐 / 거짓이냐에 따라
		// 실행이 한 번도 되지  않을 경우가
		// 생길 수 있다.
		
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		
//		while(num < 5) {
//			System.out.println("Hello World!!");
//			num++;
//			
//		}
		
        //while 문일 경우 반복에 필요한 조건을
		// 먼저 확인하며, 만약 조건이 false 일 경우
		// 실행을 한 번도 하지 않는다.
		
		// 하지만, 만약 최소 한 번은 꼭 실행해야 하는
		// 상황이 생겼을 경우를 대비하여 do-while 문법도
		// 제공하게 되었다.
		
		do {
			
			System.out.println("Hello World!");
			num++;
			
			
		} while(num < 5);
		
		// do-while문을 사용하면
		// 반복을 수행하기 위한 조건을 최하단에 작성함으로써
		// 최소한 한 번은 실행시키고 조건을 이후에 비교하는
		// 반복문을 구현할 수 있다.
	}
	
	public void testDoWhile1() {
		// do-while 문법
		// [사용방법]
		// do {
		//  . . .
		// }while(조건식);
		
		// 키보드로 문자열을 입력받아
		// 화면에 출력하기
		// *단, exit 라는 문자열을 입력하면
		// 프로그램 종료하기
		
		String str = null; // 컴퓨터 상 아무것도 없는 공간 'null'
		// 문자열의 크기는 사용자가 입력하기 전까지 알 수 없다.
		// 따라서 이러한 문자열은
		// Heap 메모리 공간에 값이 저장된다.
		// 또한, 해당 값이 저장되어 있는 주소를 변수에 전달한다.
		// str(변수의 공간) = 공간의 주소 [ 값 ]
		
		
		do {
			System.out.print("문자열 입력 : ");
			str = sc.next();
			
			System.out.println("입력한 문자열은 " + str + "입니다.");
//			str == "끝내기" // ?
		} while(!str.equals("끝내기")); // 이러면 가능 // equals는 Heap내에 있는 주소에 그 값을 직접 찾아서 확인을 시켜줌.
		// 문자열 비교 시에 
		// "==" 는 현재 변수의 값 자체를 비교하는 연산자이기 때문에
		// 문자열의 주소 안의 실제 값을 올바르게 비교할 수 없다!
		// 따라서 문자열 비교 시엔 (참조 자료형 비교 시엔)
		// 변수명.equals("비교할 값")이라는 메소드를 사용한다.
		}
	public void testDoWhile2() {
		// 문자열 입력 시
		// 해당 문자열을 화면에 출력하기
		// 단, exit 이라는 문자열을
		// 입력하면 바로 프로그램을 종료하기
		
		String msg = null; // null : 빈 공간
		
		do {
			
			System.out.print("문자열 입력 (exit는 종료) : ");
			msg = sc.next();
			
			if(msg.equals("exit")) { // 입력한 문자열이 exit 이라면
								
				System.out.println("프로그램을 종료합니다.");
				break; // 분기문
				
			} else { // 입력한 문자열이 exit이 아니라면
				
				System.out.println("입력한 내용 : " + msg);
				
			}
			
			
		} while(true);
		
	}
}


















