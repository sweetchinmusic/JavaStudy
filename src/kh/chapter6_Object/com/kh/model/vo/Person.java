package kh.chapter6_Object.com.kh.model.vo;

public class Person {
	// 1. 필드 변수 선언하기 
	private String name;  // 이름
	private int age;      // 나이
	private char gender;  // 성별
	private String email; // 이메일
	private String phone; // 연락처

	// 2. 생성자
	public Person() { } // 기본 생성자
	
	public Person(String name, int age,
				  char gender, String email,
				  String phone) {
		this.name = name; 
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
		
	} 
	// 3. 기능 제공 메소드
	public void personInfo() {
		// 현재 객체가 가진 정보를 출력하는 기능
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("이메일 : " + email);
		System.out.println("연락처 : " + phone);
		
	}
	// Getter & Setter
	
	// Getter
	// 현재 객체의 필드 변수 값을 밖으로 꺼내주는 메소드
	
	public String getName() { // 반환해줄게 없다 그러면 void들을 입력
		return name;
	}
	
	public int getAge() {
		return age;
		
	}
	
	public char getGender() {
		return gender;
		
	}
	
	public String getEmail() {
		return email;
		
	}
		
	public String getPhone() {
		return phone;
		
	}
	
	
	//Setter
	// 현재 객체의 필드 변수 값을
	// 밖에서 가져온 매개 변수의 값으로 변경하는 메소드
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhone(String phone) {
		this.phone = phone ;
	}

}
