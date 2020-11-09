package kh.chapter4_Statement.silsub;

import java.util.Scanner;

public class SilsubTest2 {
	Scanner sc = new Scanner(System.in);
	
	public void test1() {
		// 문자열 한 개를 입력 받아, 
		// 총 10번 반복하여 해당 문자열을 화면에 
		// 출력하시오.  
		
		// for
		System.out.print("문자열 입력 : ");
		String str = sc.next();
		/*
		for(int i = 0; i < 10 ; i++) {
			System.out.println(str);
		}
		*/
		
		// while
		int i = 0;
		while(i < 10) {
			System.out.println(str);
			i++;
		}
		
	}
	
	public void test2() {
		// 정수 한 개를 입력 받아, 
		// 1부터 입력 받은 정수까지의 합을 
		// 출력하시오.
		
		System.out.print("정수 한 개 : ");
		int num = sc.nextInt();
		int sum = 0;
		
		//for
		/*
		for(int i = 1 ; i <= num ; i++) {
			sum += i;
		}
		*/
		// while
		int i = 1;
		while(i <= num) {
			sum += i;
			i++;
		}
		
		System.out.println("sum : " + sum);
	}
	
	public void test3() {
		// 정수를 입력 받아 
		// 1부터 입력 받은 정수까지의 수를 홀수와 짝수로 구분하여
		// 홀수면 "당", 짝수면 "근"을 반복하여 출력 하시오. 
		// 예) 4입력 : 
		//      당근당근
		//     5입력 :
		//      당근당근당

		// num % 2 == 0 (짝수)
		System.out.print("정수 입력 :");
		int num = sc.nextInt();
		//for
		/*
		for(int i = 1; i <= num ; i++) {
			if(i % 2 != 0) {
				System.out.print("당");
			} else {
				System.out.print("근");
			}
		}
		*/
		int i = 1;
		
		while(i <= num) {
			if(i % 2 != 0) System.out.print("당");
			else System.out.print("근");
			i++;
		}
		
	}
	
	
	
}
