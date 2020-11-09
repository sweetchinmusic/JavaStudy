package kh.chapter4_Statement.logic;
import java.util.Scanner;

public class SwitchTest {
	// switch 조건문은 특정 조건을 비교하는 것이 아니라
	// 어떠한 변수나 값이 무엇인지를 비교하여
	// 그 값에 대한 문장을 실행하는 조건문
	// [사용법]
	// int num1 = 000; 
	// 
	// switch(num1) {
	//	 case 값: 실행할 문장; break;
	//	 case 값2 : 실행할 문장; break;
	//	 . . .
	//	 default : [break;] // [] 는 생략이 가능하다는 뜻;
	//	}
	
	Scanner sc = new Scanner(System.in);
	
	public void testSwitch1() {
		// switch를 사용하여 과일 메뉴 만들기
		
		// 1. 메뉴 화면 만들기
		System.out.println("--욕쟁이 조은성's 과일 가게 ver1.0--");
		System.out.println("1. 바나나");
		System.out.println("2. 수학");
		System.out.println("3. 드래곤후르츠");
		System.out.println("4. 짜장면");
		System.out.println("5. 두리안");
		System.out.println("--------------------");
		
		// 2. 안내문구 및 메뉴 받기 
		System.out.print("메뉴를 선택하세요 : ");
		int select = sc.nextInt();
		
		// 3. switch로 선택문장 구현하기
		switch(select) {
		  // select 변수로 특정 문장을 선택하겠다.
		case 1 : // if(select == 1)
			System.out.println("바나나를 선택하셨습니다.");
		    break; // 해당하는 case가 끝났다라는 의미
		case 2 :
			System.out.println("수박을 선택하셨습니다.");
			break; 
		case 3 :
			System.out.println("드래곤후르츠를 선택하셨습니다.");
			break;
		case 4 :
			System.out.println("자장면을 선택하셨습니다.");
			break;
		case 5 :
			System.out.println("두리안을 선택하셨습니다.");
			break;
		default : // else (나머지)
			System.out.println("잘못 선택 하셨습니다.");
			
		}
	}
	
	public void testSwitch2() {
		// fall-through 현상
		// switch 구문은 각 case 별로 break가 들어가지 않으면
		// 해당 case를 실행시킨 뒤에 밑으로 떨어지며
		// 나머지 코드들도 쭉 실행해 버린다.
		// 따라서 이러한 현상을 주의하여 코드를 작성해야 한다.
		
		// 혹은 이를 활용하여 코드 구현도 가능하다.
		
		// 한 자리 정수를 입력받아 그 수가 짝수인지,
		// 홀수인지 확인하는 코드
		
		System.out.print("한 자리 정수를 입력하세요 : ");
		
		int num = sc.nextInt() % 10; // 154 --> 4/ 1791 --> 1
		
		switch(num) {
		
		case 1 : case 3 : case 5 :	case 7 : case 9 :
			System.out.println("홀수입니다.");
			break;
		case 2 : case 4 : case 6 :	case 8 : case 0 :
			System.out.println("짝수입니다.");
			break;
		}
		
	}
	
	public void testSwitch3() {
		//switch를 활용하여 학생 점수에 계산하기
		System.out.println("학생 점수 입력 : ");
		int score = sc.nextInt();
		
		switch(score/10) {
		// 90 ~ 100 : A
		// switch문은 case에 조건식이나 수학 계산식 등을
		// 비교대상으로 넣을 수 없다!!!
		// case score > 89 : --> ERROR!!!
		case 10: case 9:
			System.out.println("A 학점입니다.");
			break;
		case 8:
			System.out.println("B 학점입니다.");
			break;
		case 7:
			System.out.println("C 학점입니다.");
			break;
		default :
			System.out.println("미안합니다...ㅠㅠ");
			
		}
	}
	
	public void testSwitch4() {
		// switch에 들어갈 수 있는 값은
		// 숫자, 문자 하나, 문자열이 있다.
		
		System.out.println("홍길동's 미니 계산기 ver 1.0");
		
		System.out.print("첫번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 숫자 : ");
		int num2 = sc.nextInt();
		
		System.out.print("수행할 연산(+,-,*,/) : ");
		char ch = sc.next().charAt(0);
		
		int result = 1;
		
		switch(ch) {
		case '+' : 
			result = num1 + num2;
			break;
		case '-' :
			result = num1 - num2;
			break;
		case '*' :
			result = num1 * num2;
			break;
		case '/' :
			result = num1 / num2;
			break;
		default :
			System.out.println("없는 연산식입니다. 담당자에게 문의하세요.");
		
			return; // 현재 실행하는 메소드 종료하기 뭘 종료를 했지? 예약어
		} // switch 끝~!
		
		//System.out.println(num1 + " " + ch + " " + num2 + " = " + result);
		System.out.printf("%d %c %d = %d", num1, ch, num2, result);

	}
	
}

