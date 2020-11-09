package kh.chapter6_Object.com.kh.silsub.model.vo;

public class Book {
	// 1. 필드 변수 선언
	// 책 제목, 저자, 출판사, 가격, 할인율
	// 정보를 담을 수 있는 field 변수 선언
	// 단, 접근 제한자는 private 선언 - 고민하지말고
	private String title; //private field test참고
	private String author;
	private String publisher;
	private int price;
	private double discount;
	
	

	// 2. 생성자
	// * 기본 생성자
	public Book() {
		
	}
	// * 책 제목, 출판사, 가격을 매개변수로 받는 생성자
	public Book(String title, String publisher, int price) {
		this.title = title;
		this.publisher = publisher;
		this.price = price;
		
	}
	// * 필드의 모든 정보를 매개변수로 받는 생성자
	public Book(String title, String author,
				String publisher, int price, double discount) {
		this(title, publisher, price);
		this.author = author;
		this.discount = discount;
	}
	
	
	// 3. 기능 제공 메소드
	// * 모든 필드 변수에 대한 Getter & Setter
	// * 책의 정보를 하나씩 출력하는 bookInfo() 메소드 구현하기
	
	// Getter
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getPublisher() {
		return publisher;		
	}
	public int getPrice() {
		return price;
	}
	public double getDiscount() {
		return discount;
	}
	// Setter
	public String setTitle(String string) {
		return title;
	}
	public String setAuthor(String author) {
		return author;
	}
	public String setPublisher(String publisher) {
		return publisher;		
	}
	public int setPrice(int price) {
		return price;
	}
	public double setDiscount(double discount) {
		return discount;
	}
	
	public void bookInfo() {
		System.out.println("책 제목 : " + title);
		System.out.println("저자 : " + author);
		System.out.println("출판사 : " + publisher);
		System.out.println("가격 : " + price);
		System.out.println("할인율 : " + discount);
		
		
	}
}
