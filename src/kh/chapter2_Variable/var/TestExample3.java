package kh.chapter2_Variable.var;

public class TestExample3 {
	public void example() {
		// ---- 선언부 : 변수를 선언하는 공간
		String name;   // 이름
		int age;       // 나이
		double height; // 키
		double weight; // 몸무게
		char gender;   // 성별
		String phone;  // 전화번호
		String email;  // 이메일
		
		// ---- 입력부 : 선언한 변수에 정보 기록
		name = "홍길동";
		age = 10;
		height = 180.99;
		weight = 55.05;
		gender = 'M';
		phone = "010-1111-2222";
		email = "test@example.com";
		
		// ---- 출력부 : 입력한 정보 출력하기
		/*
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);
		System.out.println("성별 : " + gender);
		System.out.println("연락처 : " + phone);
		System.out.println("이메일 : " + email);
		*/
		
		System.out.printf("이름 : %s \n", name);
		System.out.printf("나이 : %d \n", age);
		System.out.printf("키 : %.1f \n", height);
		System.out.printf("몸무게 : %.1f \n", weight);
		System.out.printf("성별 : %c \n", gender);
		System.out.printf("연락처 : %s \n", phone);
		System.out.printf("이메일 : %s \n", email);
		
	}
}
