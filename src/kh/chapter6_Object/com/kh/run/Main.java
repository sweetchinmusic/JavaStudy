package kh.chapter6_Object.com.kh.run;

import kh.chapter6_Object.com.kh.model.vo.Human;
import kh.chapter6_Object.com.kh.model.vo.Person;

public class Main {

	public static void main(String[] args) {
		// 실행용 메소드
		// 객체를 선언하여 사용하는 방법
		// 클래스명 변수명 = new 생성자메소드();
		
		// 1. 기본 생성자를 사용하는 경우 
		Human h1 = new Human();
		
		System.out.println("h1 객체 메모리 할당 확인 : " + h1.hashCode());
		//메모리 할당 확인이 됐다면 heap라는 곳에서 잡혔다는 것이다.
		h1.name = "고길동"; // 직접 바꿨다
		
		h1.sayMyName(); 
		
		// 2. 사용자 정의 생성자를 사용하는 경우
		Human h2 = new Human("홍길동");
		
		System.out.println("h2 객체 메모리 할당 : " + h2.hashCode());
		
		h2.sayMyName();
		
		h2.setGender('남');
		
		System.out.println("홍길동 성별 : " + h2.getGender());
		
		// -------------------------
		
		Person p1 = new Person();
		Person p2 = new Person("홍길동",10,'남',"test@test.com", "010-1234-5678");
	
		p1.personInfo();
		p2.personInfo();
		
		p1.setName("신사임당");
		p1.setAge(15);
		p1.setGender('여');
		p1.setEmail("test2@test.com");
		p1.setPhone("010-1111-2222");
		
		p1.personInfo();
		
		System.out.println("p1의 나이 확인 : " + p1.getAge());
		
	
	
	
	}
	

}
