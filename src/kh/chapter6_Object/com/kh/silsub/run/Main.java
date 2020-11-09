package kh.chapter6_Object.com.kh.silsub.run;

import kh.chapter6_Object.com.kh.silsub.model.vo.Book;

public class Main {
	public static void main(String[] args) {
		// 책의 정보를 입력할 Book 객체 3개를 선언하고
		Book bk1 = new Book();
		Book bk2 = new Book("데미안","민음사",7200);
		Book bk3 = new Book("토지","박경리","마로니에북스",243000, 0.1);
		
		// 각각의 생성자를 종류별로 사용하여 객체 할당하기
		bk1.setTitle("어린왕자");
		bk1.setAuthor("생텍쥐베리");
		bk1.setPublisher("문학나무");
		bk1.setPrice(15000);
		bk1.setDiscount(0.1);
		// 만약 객체 안에 값이 들어있지 않다면 setter로 값을 마저 추가하기
		
		// 화면에 bookInfo() 메소드 각각 출력하기
		bk1.bookInfo();
		
		System.out.println("--------------");
		
		bk2.bookInfo();
		
		System.out.println("--------------");
		
		bk3.bookInfo();
		
		
		
	}

}
