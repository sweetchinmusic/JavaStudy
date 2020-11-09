package kh.chapter4_Statement.loop;

import java.util.Scanner;

public class ForLoopTest {
	//Ctrl + Shift + Oㅐ (자동임포트)
	Scanner sc = new Scanner(System.in);
	
	public void beforeForLoop() {
		
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		
	}
	public void testForLoop1() {
		// 반복문
		// 어떠한 문자, 계산식 혹은
		// 반복할 수 있는 코드를
		// 직접 하나하나 작성하지 않고
		// 컴퓨터를 통해서 자동으로
		// 반복을 수행하도록 하는 문법
		
		// 1. For문 (반복 횟수 제한이 있는 반복문) ☆
		// 2. While문 (반복 횟수 제한이 없는 반복문) ☆
		// 3. do-while문(처음 한 번은 무조건 실행시키는 반복문)
		
		// for 반복문
		// [사용방법]
		// for (시작할 변수 ; 끝 값 비교 조건식 ; 증감식) {...}
		
		// 1부터 10까지의 합을 구하세요.
		// 일반적
		// System.out.println(1 + 2 + 3 + 4 + ... + 9 + 10)
		
		// for문을 사용할 경우 
		int sum = 0; // 합을 저장할 공간
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("i 값 확인 : " + i);
		
			
			// sum = sum + i;
			sum += i;
			
			
		}
		
			System.out.println("sum 값 확인 : " + sum);
	}
	
	public void testForLoop2() {
		// For문은 반복 회수가 정해져 있을 때 사용한다.
		
		// 단순 반복 확인(기본형태)
		// 0~9 반복
		for(int i = 0; i < 10 ; i++) {
			System.out.println("i 값 확인  : " + i);
		}
		
		System.out.println("---------------");
		
		// 1~ 5까지 반복 확인하기
		// 반복 횟수 확인 : 1
		// 반복 횟수 확인 : 2
		// . . .
		for (int i = 0 ; i< 5 ; i++) {
			System.out.println("반복 횟수 확인 : " + i);
		}
		System.out.println("---------------");
	
		// 5 ~ 1 까지 반복 확인하기
		for (int i = 5 ; i>0 ; i--) {
			System.out.println("반복 횟수 확인 : " + i);
		}
		
		// 1~ 10 까지의 합 구하기
		// 변수 sum 을 선언하여
		// 1~10까지의 합을 구하시오.
		int sum = 0;
		for(int i = 0 ; i< 11; i++) {
		sum +=i;
		}
		
		System.out.println("sum : " + sum);
		}

		public void testForLoop3() {
			// for 반복문 응용하기1
			
		// 2 * 1 = 2
		// 2 * 2 = 4
		//. . 
		// 2 * 9 = 18
		// 구구단 2단 출력하기
		for(int i = 1; i < 10 ; i++ ) {
			System.out.printf(" 2 * %d = %d \n", i, (2 * i));
			}
		System.out.println("-------------------------");
		
		// for문 안에 if문 사용하기
		// 1 ~ 10까지  수 중 홀 수들의 합 구하기
		int sum1 = 0;
		
		for(int i = 1; i < 11; i++) {
			if(i % 2 != 0) {
				sum1 += i;
				
			}
		}
			
		System.out.println("sum1 : " + sum1);
		System.out.println("--------------------------");
		
		// for문 만으로
		// 1 ~ 10까지 홀수들의 합을 구해서
		// sum2에 담아 출력하기
		
		int sum2 = 0;
		for(int i = 1; i < 11; i +=2) {
			sum2 += i;
		}
		System.out.println("sum2 : " + sum2);
		System.out.println("--------------------------");
	
		int sum99 = 0;
		for(int i = 2; i < 11; i +=2) {
			sum99 += i;
		}
		System.out.println("sum99 : " + sum99);
		System.out.println("--------------------------");

		// 1 ~ 100까지의 짝수들의 합
		// if문 없이 작성해보세요
		
		// -- 푸는 방법 --
		// 1 ~ 100 횟수 반복 --> for문
		// -- 조건 구하기 --
		// 1. for문 사용에 필요한 식
		//  -초기값 ( 몇부터 시작할까..?)
		//  -조건식 ( 몇까지 증가할 것인지..?)
		//  -증감식 ( 몇 씩 증가 시킬까..?)
		// 2. 초기값 :
		// int i = 2;
		// 3. 조건식
		// i <= 100 --//--> i < 101
		// 4. 증감식
		// i + 2 --//--> i = i + 2
		// i += 2
		// 5. 값을 저장할 공간 선언(변수 필요함)
		// int sum3 = 0 ;
		// 6. 반복하면서 처리할 공간 계산식
		// sum3 = sum3 + i;
		// --//--> sum3 += i;
		
		int sum3 = 0;
		for(int i = 2; i < 101; i +=2) {
			sum3 += i;
		}
		
		System.out.println("sum3 : " + sum3);
		
	}
	
		public void testForLoop4() {
			//for문 + 스캐너
			
			// 실습 1
			// 정수 하나를 입력받아
			// 1부터 해당 숫자까지의 합을 구하기.
			System.out.println("정수 하나 입력 : ");
			
			int num = sc.nextInt(), sum = 0;
			
			for(int i = 1; i <= num; i++) {
				sum += i;
			}
			
			System.out.println("sum : " + sum);
			
			System.out.println("-----------------");
			
			// 실습 2
			// 한자리 정수를 입력받아 
			// 1부터 해당 숫자까지 짝수들의 합을 구하세요.
			System.out.print("정수 하나 입력 : ");
			int num1 = sc.nextInt(), sum1 = 0;
			if (num1 > 0 && num1 < 10) {
				for (int i = 2; i <= num1; i +=2) {
					sum1 += i;
				}System.out.println("짝수의 합은 : " + sum1);
			} else {
				System.out.println("한자리 정수를 입력 하세요!");
			}
			
			
			System.out.println("------------------");
			// 실습 3
			// 한자리 정수를 입력받아
			// 해당 숫자에 맞는 구구단을 출력해보세요.
			// -- 출력 양식 --
			// ----- N단 ------
			// N * 1 = M
			// N * 2 = M 
			
			System.out.print("정수 하나 입력 : ");
			int num2 = sc.nextInt();
			if (num2 > 1 && num2 <10) {
				for (int i = 1 ; i < 10 ; i++) {
					System.out.printf("%d * %d = %d \n", num2, i, (num2*i));
				}
			}else {
				System.out.println("2~9까지만 입력하세요!");
			}

			 /* int dan = sc.nextInt();
			 * 
			 * if(dan > 1 && dan < 10) {
			 *  System.out.println("-----" + dan + "단 -----");
			 *  
			 *  for(int i = 1; i< 10; i++) {
			 *  	System.out.println(dan+ "*" + i + "=" + (dan * i));
			 *  }
			 *  
			 *  } else {
			 *  	System.out.println("2~9까지만 입력하세요")
			 * 
			 */
		}
		
}

