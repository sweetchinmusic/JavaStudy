package kh.chapter5_Array.array;

import java.util.Scanner;

public class ArrayExercise {
	// 배열 실습
	
	Scanner sc = new Scanner(System.in);
	
	public void test1() {
		// int형 배열 1개 선언한 후에
		// 값을 1 ~ 5 까지 추가하기
		int[] arr = { 1, 2, 3, 4, 5};
		 
		//출력도 반복문으로 하나씩 해야 한다. length 입장에선 1~5
		//java 입장에선 0~4
		for(int i = 0; i < arr.length; i++) {
			System.out.println("값 확인 : " + arr[i]);
		}
	}
	public void test2() {
		// 문자열을 반복해서 입력 받아
		// 크기가 5인 배열에 저장하고
		// 모두 저장되었을 대 저장한 문자열을
		// 하나씩 출력한 뒤 종료하는 프로그램 만들기
		String[] arr = new String[5];
		//입력문
		for(int i = 0; i < arr.length ; i++) {
			System.out.println("문자열 입력 : ");
			arr[i] = sc.next();
			
		}
		// 출력문
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println(i+"번째 문자열 : " + arr[i]);
		}
	}
	public void test3() {
		// 길이가 5인 숫자 배열을 선언하고 
		// 값을 100, 200, 300, 400, 500의 값으로
		// 초기화 한 뒤, 숫자 하나를 입력받아
		// 숫자번호에 맞는 값을 출력하고 
		// 만약 없는 숫자라면 "입력한 공간은 없습니다" 라고 출력하기
		// (Hint. {100, 200, 300, 400, 500 } 으로 선언하기
		
		// -- 출력 예시 --
		// 숫자 입력 : 1
		// 해당 값 : 200
		// -------------
		// 숫자 입력 : 7
		// 입력한 공간은 없습니다.
		int arrr[] = {100,200,300,400,500}; //숫자 배열 선언 , 굳이 깊은 배열 복사를 한 이유??
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();

		if(num<arrr.length && num > -1) {
			System.out.printf("해당 값 : %d", arrr[num]);
		
		} else {
			System.out.println("입력한 공간은 없습니다.");
		}
		System.out.println("---------------");
		//for문을 사용하지 않은.
		//크리구조 = 검색엔진
			
	
		
		
	}
	public void test4() {
		// 문자열을 입력 받아
		// 해당 문자열을 문자 배열에 하나씩 차곡차곡 저장한 후
		// 이 배열을 활용하여
		// 문자열을 거꾸로 출력하기 (Hint. 문자열변수.length() 활용하기)
		// 
		// -- 출력 예시 --
		// 문자열 입력 : 고양이 
		// 결과 : 이양고
		
		System.out.print("문자열 입력 : ");
		String str = sc.next();
		
		char[] chArr = new char[str.length()];
		//입력부
		for(int i = 0; i < chArr.length; i++) {
			chArr[i] = str.charAt(i);
			}
		//출력부
		System.out.print("결과 : ");
		for(int i = chArr.length - 1; i> -1 ; i--) {
			System.out.print(chArr[i]);
		}
	
		
		
	}	
	
	
	
	
	
	
	
	
	
	
	
	
}