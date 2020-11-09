package kh.chapter6_Object.com.kh.model.vo;

public class Human {
	// 객체 지향 언어 (OOP : Object Oriented Programing)
	// -> 객체를 사용하여 프로그램을 작성하는 것
	// 객체는 Class(클래스)에 의해 만들어짐
	// C++ : 클래스에 의해 만들어진 변수
	// 		  클래스명 변수명; 다른 언어 배운 사람은 object를 말하는 것임.
	// JAVA: Heap 메모리에 값을 할당하여
	// 		  주소값을 받을 수 있는 변수
	//  클래스명 변수명 = new 클래스명();
	// -- 작성순서 --
	// 1. 클래스 내에서 사용할 변수 (Field, Member, Global Variable)
	public String name;  // 이름
	int age; 	  // 나이
	private char gender;  // 성별
	protected String tel;   // 연락처
	String address;//집주소
	
	// 2. 생성자 ( Constructor)
	// 	해당 클래스를 통해 new 로 객체를 생성하기 위한 특별 메소드
	// 생성자 : 접근제한자 클래스명([매개변수명]) {...} // 괄호를 붙이면 생략가능?? 없이 나올 수 있는데 있다면 그건 변수 선언 같은거임; 
	// 	처음  : 처음 객체를 생성할 때 초기화값을 가지고 생성할 목적으로 선언한다.
	
	public Human() {
		// 기본 생성자(default Constructor) // 자동으로 해주는거 ,갈비지 콜렉터 , 형변환 ,자바 랭 패키지,리턴?,그 다음 기본 생성자 
	}
	
	public Human(String name) {// 사용자 정의 생성자
		// 어떠한 값을 전달 받아
		// 현재 비어있는 필드 변수에
		// 값을 채워 넣을 수도 있다.
		this.name = name; // 
		//원래 붙여야되는데 생략가능한거. 
	}
	
	// 3. 기능 제공 메소드
	// 현재 클래스의 정보를 활용하여
	// 특정 기능을 제공하고자 할 때
	// 구현하는 메소드
	// [선언방식]
	// 접근제한자 [예약어] 반환자료형 메소드명([매개변수]){ . . . }
	public void sayMyName() {
		System.out.println("내 이름은 " + name + "입니다.");
	}
	
	// Getter & Setter
	public char getGender() {
		return gender; 
	}
	
	public void setGender(char gender) {
		this.gender = gender;
		
	}
}
