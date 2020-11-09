package kh.chapter2_Variable.input;

import java.util.Scanner; 

public class InputTest {

	
	public void inputMethod1() {
		// 1. 변수를 미리 선언하고
		//	   값을 나중에 넣어 출력하기
		
		// [주제 : 도서 정보 출력]
		// -------변수 선언------ //
		String title;// 책이름 
		String author;// 작가
		String publisher;// 출판사
		char genre;// 장르 (인 : 인문학, 과: 과학, 사: 사회학, 역 : 역학)
		int price;// 가격
		boolean rental; // 대여여부 (true / false)
		double discount; // 할인율
		// --------변수에 값 대입하기(초기화) ------ //
		title = "자바의정석";
		author = "남궁성";
		publisher = "도우출판";
		genre = '인';
		price = 27000;
		rental = true;
		discount = 0.15;
		
		 // --------- 변수에 저장한 값 출력하기 -----------//
		System.out.println("책 이름 : " + title);
		System.out.println("저자 : " + author);
		System.out.println("출판사 : " + publisher);
		System.out.println("장르 : " + genre);
		System.out.println("가격 : " + price);
		System.out.println("대여여부 : " + rental);
		System.out.println("할인율 : " + discount);
		
		System.out.println("--------------------------");
		
		// --- 스캐너를 사용하여 변수에 값 대입하기 ----//
		
		Scanner sc = new Scanner(System.in);
		
		// 스캐너에서 값을 받는 종류에 따라 사용하는 메소드가 다르다.
		// 만약에 int 를 받겠다면 sc.nextInt();
		// double을 받겠다면 sc.nextDouble();
		// boolean을 받겠다면 sc.nextBoolean();
		// byte를 받겠다면 sc.nextByte();
		// String를 받겠다면 sc.next(), sc.nextLine();
		//   - sc.next() : 문자열을 입력받되, 띄어쓰기나
		//                 엔터 전까지 문자열을 읽어서 가져오는 메소드
		//   - sc.nextLine() : 문자열을 띄어쓰기까지 포함하여
		//					      한 줄 전체를 읽어오는 메소드
		// char를 받겠다면...? sc.next().charAt(n); n = 0 이상의 정수
		// 0번이 첫번째임
		
		
		System.out.print("도서명 입력 : ");
		title = sc.next();
		System.out.print("저자 입력 : ");
		author = sc.next();
		
		sc.nextLine(); // 엔터값 제거용
		
		System.out.print("출판사 입력: ");
		publisher = sc.nextLine();
		System.out.print("장르 입력 (인/과/사/역): ");
		genre = sc.next().charAt(0);
		// 만약 '인문학' 이라고 입력했다면
		// 		^이 부분의 문자 순서는 0이다.		
		
		System.out.print("가격 입력 : ");
		price = sc.nextInt();
		
		System.out.print("대여 여부 : ");
		rental = sc.nextBoolean();
		
		// --- 스캐너 저장한 값 출력하기 --- //
		System.out.printf("책이름 : %s \n", title); //f 는 찍은다음에 마저 채워준다??
		System.out.printf("저자 명 : %s \n", author);
		System.out.printf("출판사 : %s \n", publisher);
		System.out.printf("장르 : %c \n", genre);
		System.out.printf("가격 : %d \n", price);
		System.out.printf("대여여부 : %b \n", rental);
		System.out.printf("할인율 : %.1f \n", discount);
		
		//System.out.printf("책 이름 : %s \n저자 명 : %s \n출판사 : &s \n", title, author, publisher);

//
	}
}
