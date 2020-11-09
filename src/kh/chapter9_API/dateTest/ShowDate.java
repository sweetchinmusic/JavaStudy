package kh.chapter9_API.dateTest;

import java.util.Scanner;

public class ShowDate {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("1. 특정 년도가 윤년인지 확인하기");

		DateCalendar dc = new DateCalendar();

		System.out.print("특정 년도 입력 : ");

//		int year = sc.nextInt();// 줄일 수 있다.

		String result = dc.isLeapYear(sc.nextInt()) ? "윤년" : "평년"; // 일회용

		System.out.println("입력하신 년도는 " + result + "입니다!");

		System.out.println("2. 1년 1월 1일터 현재까지 일 수 계산하기");

		long totalDate = dc.getDays();
	
		System.out.println("총 날짜 수 : " + totalDate);
		
//		String result =  ? "윤년" : "평년"; // 일회용

//		System.out.println("입력하신 년도는 " + dc.isLeapYear(sc.nextInt()) + "입니다!"); // 이런식으로
//
//		System.out.println("2. 1년 1월 1일터 현재까지 일 수 계산하기");
//
//		long totalDate = dc.getDays();
//	
//		System.out.println("총 날짜 수 : " + totalDate); // 얘도 쌈가능
		
		
		
		
		
	}

}
