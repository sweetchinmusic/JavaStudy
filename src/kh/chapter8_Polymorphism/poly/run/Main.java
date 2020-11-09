package kh.chapter8_Polymorphism.poly.run;

import kh.chapter8_Polymorphism.poly.model.vo.*;

public class Main {

	public static void main(String[] args) {
		// 다형성 테스트용 실행 메소드

		// 상속만을 사용한 경우
//		Parents p = new Parents();
//		Child1 c1 = new Child1();
//		Child2 c2 = new Child2();
//		
//		p.sayMyName();
//		c1.sayMyName();
//		c2.sayMyName();
		// 다형성을 사용한 경우
		Parents p = new Parents();
		Parents c1 = new Child1();
		Parents c2 = new Child2();

		// Child1,2도 Parents의 속성을 다 가지고 있기 때문에 가능하다.
		p.sayMyName(); // 정적 바인딩
		c1.sayMyName(); // 동적 바인딩
		c2.sayMyName(); // 동적 바인딩
		// Child1의 기준으로 봤을 때 Parents의 코드를

		// 부모가 가진 메소드 접근 확인
		p.setFirstName("김");
		c1.setFirstName("김");
		c2.setFirstName("김");

		// 자식이 가진 메소드 접근 확인
		// 상속 관계에서는 부모가 자식의 메소드, 필드 변수 정보를
		// 접근할 수 없다.
		// p.setLastName();

		// 자식 자신이 가진 메소드 접근 확인
		// 자식 객체이지만 부모 클래스를 통해 만들었기 때문에
		// 부모 기능들만 접근이 가능하고, 본인의 메소드는 접근이 불가능하다.
		// c1.setLastName(); 못 쓴다
		// 원래 내꺼는 못 찾아 가는건가? 부모꺼밖에 안되면??
		// 그 때 다형성의 다운캐스팅을 쓴다.

		// 자식 본인의 메소드 접근하기 ( Down Casting : 하향 형변환 )
//		(Child1)c1.setLastName("밥"); // 뒤에서부터 읽기때문에 따로 묶어야함
		((Child1) c1).setLastName("밥"); // Parent를 바꾸고 자식 1로 채워놓은거
		// 주관식 hint 변수를 초기화하는 방법; overloading 작성,
//		객체지향 3대 특징, 기본자료형 종류 크기,부분점수 포함,

		// 다형성을 사용하지 않았다면...?
		Child1 child1 = new Child1();
		Child2 child2 = new Child2();
		Child3 child3 = new Child3();
		// . . .
		// Child50 . . . ?

		// 만약 다형성을 사용한다면
		Parents[] siblings = new Parents[3];

		siblings[0] = new Child1();
		siblings[1] = new Child2();
		siblings[2] = new Child3();

		// study() 메소드 사용하고 싶다면...?

		// Child1로 만든 객체는 같은 형제라고하더라도
		// Child2나 Child3이라는 전혀 다른 (공통점이 부모말고 없는) 클래스의
		// 메소드를 공유할 수 없다.
		// 또한, 해당 클래스로 형변환도 불가능하다!
		// ClassCastException : 자식1로 만든 객체는 자식2로 바꿀 수 없다!
//		((Child2) siblings[0]).study();
		
		for(int i = 0; i< siblings.length; i++) {
			// instanceof : 왼쪽의 객체가 오른쪽의 클래스로도 바꿀 수 있느냐?
			if(siblings[i] instanceof Child2) { // instance 객체 실체화하면서 배움 new 하면서
				((Child2)siblings[i]).study(); // 위에서는 차일드 2로 바꿀 수 있는지 확인만, 여기서는 형변환을 해준다.
				} else {
					System.out.println(i+"번째 방에는 Child2가 아닙니다!");
				}
				siblings[i].sayMyName();
			
			} // 설명 다시 듣기

	}
}
