package kh.chaptes12_Collection.kh_review.model.vo;

import java.io.Serializable;

public class Coffee implements Serializable {

	// 1. Field
	// 	    객체의 요소로 ( 저장할 공간으로 ) 사용할
	//    변수 선언
	private String coffeeName; // 커피 이름
	private int price;		   // 가격
	private int cups;		   // 잔의 수
	
	// 2. 생성자
	//    새로운 객체를 만들 때 사용하는 특별한 메소드
	//		오버로딩 : 같은 이름의 메소드라도
	// 				 매개변수의 자료형, 개수, 순서가
    //					 다르면 다른 메소드로 인식하는 기법
	public Coffee() {}
	
	public Coffee(int type, int cups) {
		setCoffeeName(type);
		setCups(cups);
	}

	
	// Getter & Setter 
	public String getCoffeeName() {
		return coffeeName;
	}

	public void setCoffeeName(int type) {
		switch(type) {
		case 1: coffeeName = "아메리카노";
				price = 3000;
				break;
		case 2: coffeeName = "카페모카";
				price = 3200;
				break;
		case 3: coffeeName = "에스프레소";
				price = 3300;
				break;
		}
		
//		coffeeName = (type != 1) ?
//						(type !=2) ? "에스프레소" : "카페모카" : "아메리카노";
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCups() {
		return cups;
	}

	public void setCups(int cups) {
		this.cups = cups;
		setPrice(price * cups);
		
	}

	@Override
	public String toString() {
		return "커피명 : " + coffeeName + ", "
				+ "가격  : " + price + ", "
				+ "잔 수 : " + cups;
	}
	
	
	
	
}
