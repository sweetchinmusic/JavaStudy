// 1. 패키지 생성 : 어떠한 기능을 가진 클래스들을 하나로 묶는 용도
package kh.chapter2_Variable.var;

public class TestVariable1 {
// 2. 클래스 생성 : 앞글자는 대문자!!!!
// 				여러 기능을 가진 자바 객체 설계도면 ( 틀 )
	                                     //여기선 메인으로 사용 안했다.public static void main(String[] args) {
	public void method1() {
		// 공간 <- 값
		int num1 = 100; //대입연산자
		int num2 = 200;
		
		System.out.println(num1);
	
		System.out.println(num2);
	
		int salary = 30000000; //컴퓨터에 저장을 해놓으면 나중에 불러올때 오타나지 않고 제대로 불러올 수 있기 때문. salary - 변수
		
		System.out.println(salary);
		
	}


	public void method2() {
		
		//변수 선언하기
		
		// 1. 변수 선언 (개인정보)
		String name;    // 이름
		int age;        // 나이
		String phone;   // 전화번호
		String address; // 주소
		char gender;	// 성별 - 바이트 용량을 줄이려고?
		String blood;   // 혈액형 - char 로 가능한지??--RH +- 도 넣으려고 하심
		double weight;  // 몸무게
		// --------------- //
		
		// 2. 선언한 변수에 값 대입하기
		name = "조은성";
		age = 27;
		phone = "010-";
		address = "서울시";
		gender = '남';
		blood = "O";
		weight = 50.5;
		
		// 3. 변수에 저장된 값 확인하기
		System.out.println(name);
		System.out.println(age);
		
	}
	
}