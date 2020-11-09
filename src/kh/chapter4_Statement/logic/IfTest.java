package kh.chapter4_Statement.logic;

import java.util.Scanner;

public class IfTest {
	// if 구문은 특정 조건을 만족하는 경우
	// 실행할 구문을 구현하는 조건문으로써
	// 하나의 조건에 대하여 여러가지 경우를
	// 구현할 필요가 있을 경우 사용한다.
	
	public void testIfMethod1() {
		// 기본적인 if 문 
		// 나이를 입력받아
		// 19세 이상일 경우 "성인입니다"
		// 19세 미만일 경우 "미성년자입니다"
		// 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		// 안내 문구
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		if(age >= 19) { // age > 18 로 바꾸면 두 번 비교하는 과정이 필요가 없다
			System.out.println("성인입니다.");
		}else {
			System.out.println("미성년자입니다.");
			
		}
	}
	public void testIfMethod2() {
		// 조건에 따른 결과가 3개 이상인 경우
		// if-else if 사용하기
		
		// 국어(kor), 영어(eng), 수학(mat) 점수를
		// 입력받아 평균에 따른 학점 출력하기
		
		// 평균이 90점 이상이면 A
		// 평균이 80점 이상이면 B
		// 평균이 70점 이상이면 C
		// 평균이 60점 이상이면 D
		// 평균이 60점 미만이면 F
		
		Scanner sc = new Scanner(System.in);
		
		// 안내 문구
		System.out.println("국어 점수 : ");
		int kor = sc.nextInt();
		
		System.out.println("영어 점수 : ");
		int eng = sc.nextInt();
		
		System.out.println("수학 점수 : ");
		int mat = sc.nextInt();
		
		int sum = (kor + eng + mat);
		int avg = sum / 3;
		
		String grade = "";
		
		if( avg > 89 ) {
			
			grade = "A";
				
		} else if( avg > 79 ) {
			
			grade = "B";
			
		} else if( avg > 69 ) {
			
			grade = "C";
			
		} else if( avg > 59 ) {
			
			grade = "D";
			
		} else {
			
			grade = "F";
			
		}
		
		System.out.printf("당신의 학점은 %s입니다. \n", grade);
	}
	public void testIfMethod3() {
		// if 조건을 활용하여 메뉴판만들기
		System.out.println("-- 맹재은's 과일 가게 ver 1.0 --");
		System.out.println("1. 사과");
		System.out.println("2. 딸기");
		System.out.println("3. 두리안");
		System.out.println("4. 애플망고");
		System.out.println("5. 블루베리");
		System.out.println("--------------------");
		// 2. 사용자에게 메뉴 고르게 하기
		System.out.println("원하는 과일 번호를 선택하세요 : ");
		
		Scanner sc = new Scanner(System.in);
		
		int select = sc.nextInt();
		
		if( select == 1) {
			System.out.println("사과를 선택하셨습니다.");
			
		} else if (select == 2 ) {
			
			System.out.println("딸기를 선택하셨습니다.");
			
		} else if (select == 3 ) {
			
			System.out.println("두리안을 선택하셨습니다.");
			
		} else if (select == 4 ) {
			
			System.out.println("애플망고를 선택하셨습니다.");
			
		} else if (select == 5 ) {
		
			System.out.println("블루베리를 선택하셨습니다.");
			
		} else { 
			
			System.out.println("해당 물품은 없습니다.");
			
		}
		
		
	}
	
	public void testIfMethod4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("과목: ");
		
		int sub = sc.nextInt();
		String grade = "";
		
		if( sub > 94 ) {
			
		    grade = "A+";
			} else if( sub > 94 ) {
				
			grade = "A";
			} else if( sub > 89 ) {
				
			grade = "B+";
			} else if( sub > 84 ) {
				
			grade = "B";		
			} else if( sub > 79 ) {
				
			grade = "C+";			
			} else if( sub > 74 ) {
				
			grade = "C";
			} else if( sub > 69 ) {
			} else {grade = "F";
		}
		System.out.printf("당신의 학점은 %s입니다. \n", grade);

		
			// 다중 if 문 (중첩 if문)
			// 학생의 점수를 입력받아
			// 90점 이상이면 A
			// 80점 이상이면 B
			// 70점 이상이면 C
			// 70점 미만이면 F
			// 단, F학점 이상이고,
			// 각 점수가 5점 이상이면 '+' 추가하기
			// 90 --> A / 95 --> A+
		}
}
