package kh.chapter7_Inheritance.inheritance;


public class Child1 extends Parents { // 이건 어떤 용도로 사용하는거??
	
	// 부모와 똑같은 메소드를 가질 수도 있다.
//	public void printStr() { // 이거 그냥 이 클래스의 메소드??
//		System.out.println("난 자식입니다.");
//	} //내가 수정했다는 것을 알리는 예약어 오버라이딩
	
	// 부모와 같은 이름의 메소드를 가질 경우
	// 이름이 동일하여 원래 누구의 것인지 헷갈리는
	// 상황이 발생할 수 있다.
	// 이를 방지하기 위해 부모와 같은 이름을 메소드로
	// 재정의할 경우 @Override 어노테이션을 달아준다.
	//
	// @(어노테이션) : JVM 이 컴파일할 때에 해당 코드를
	// 				읽고 어떤 처리를 해야 하는지
	//				가이드해주기 위한 명령어 
	
	@Override // 재정의 메소드
	public void printStr() {
		System.out.println("난 자식 클래스 입니다.");
	}
	
	public void myPrintStr() {
		System.out.println("Child1 만의 메소드입니다~");
	}
}
