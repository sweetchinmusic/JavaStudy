package kh.chapter4_Statement.loop;

import java.util.Scanner;

public class WhileLoopTest {
		// While 반복문 테스트
	
	 Scanner sc = new Scanner(System.in);
	 
	 public void beforeWhileLoop() {
		 
		 // while문은 특정 조건식만 일치하면
		 // 무수히 반복하는 특성을 지닌다.
		 // [사용방법]
		 // while(조건식) {...}
		 
		 while(true) { 
			 System.out.println("Hello While Loop!");
			 
		 }
	 }
		 public void testWhileLoop1() {
			 //for 반복문은 특정 범위 안의 반복을 수행할 때
			 //사용하지만,
			 //while 반복문은 조건만 충족하면 무한 반복을
			 //수행한다.
			 
			 // 따라서 while문을 일정 횟수만큼 반복하고자 한다면
			 // while문 전에 변수 하나를 선언하고 해당 변수를
			 // 조건문에 넣어 조건을 구현한다.
			 
			 // 1 ~ 10 까지의 합
			 int i = 1, sum = 0; // for문에서의 초기값
			 
			 while(i <= 10) { //for문에서의 조건식
				 sum += i;
				 i++; // for문에서의 증감식
			 }
			 
			 System.out.println("sum : " + sum);
		 
		 }
		 
		 public void testWhileLoop2() {
			 	// 문자열을 하나 입력받아
			 	// 문자열의 길이 (인덱스) 만큼
			 	// 문자 하나씩 추출하기
			 
			 System.out.println("문자열 입력 : ");
			 String str = sc.next();
			 
			 int i = 0;
			 while(i < str.length()) {
				 // 정해진 횟수가 존재하지 않을 때
				 // 즉 정해진 만큼 반복할 필요가 없거나
				 // 반복 횟수가 불확실할 때 사용한다.
				 
				 System.out.println( i +"번째 문자 : " + str.charAt(i));
				 i++;
			 }
		 }
		 public void testWhileLoop3() {
			 // 1부터 입력받은 수까지의 합 계산하기
			 //for문과 비슷하게
			 int sum = 0; 
			 
			 System.out.println("정수 입력 : ");
			 int num = sc.nextInt();
			 
			 int i = 1; 
			 
			 while(i <= num) {
				 
				 if(i !=num) {
					 System.out.print(i + " + ");
				 } else {
					 System.out.println(i);
				 }
				 
				 sum += i;
				 i++;
			 }
			 
			 System.out.println("정수들의 합 : " + sum);
			 
	}
	
		 public void testWhileLoop4() {
			// while문 중첩 사용하기
			// 2 ~ 9단까지 구구단 전부 출력하기
			 
			 int dan = 2;
			 
			 while(dan < 10) { // 각 단을 반복한다.
				 System.out.println("-----" + dan + "단 -----");
			 int su = 1;
				 
			 while(su < 10) { // 각 단에 대한 1 ~ 9 곱셈 반복
					 System.out.println(dan + "*" + su + "=" + (dan*su));
					 su++;
			 }
			System.out.println("-----------");
			dan++;
			
		}
		 }
		public void testWhileLoop5() {
			// while문을 이중 반복하여
			// 직사각형 * 찍기 
			// 가로, 세로 길이를 입력받아
			// 직사각형 모양으로 별 찍기
			
			System.out.print("세로 줄 수 : ");
			int row = sc.nextInt();
			
			System.out.print("가로 줄 수 : ");
			int col = sc.nextInt();
			
			int i = 1;
			while(i <= row ) { // 세로 반복 수(row)
				
				int j = 1; 
				while(j <= col) {// 가로 반복 수(col)
					
					if(j !=col) {
						System.out.print("*");
					} else {
					System.out.println("*");
					}
					j++;
				}
				i++;
			}
			
	 }
		public void testWhileLoop6() {
			//직각삼각형 만들기
			// *
			// **
			// ***
			// while for 바꾸는 법
			System.out.print("줄 수 입력 : ");
			int row = sc.nextInt();
			
			int i = 1;
			while(i <= row) {// 세로 길이
				int j = 1;
				while(j <= i) { // 가로 길이
					
					if(j == i) {
						System.out.println("*");
					} else {
						System.out.println("*");
					}
					j++;
				}i++;
			}
				}
			
			public void testWhileLoop7() {
				//while 과 for문은
				//서로 변환이 가능하다
				
				// for --> while
				// 1 ~ 5 까지의 합
				int sum = 0 ; 
				/*
				
					sum +=i;
				}
				 */
				int i = 1; // 초기값
				while (i < 6) { // 조건식
					sum += i;
					i++; // 증감식
					
				}
				// while --> for
				/*while(true) {
					sum += i;
				}
				*/
				for(;;) {
					sum += i;
				}
		}
}
