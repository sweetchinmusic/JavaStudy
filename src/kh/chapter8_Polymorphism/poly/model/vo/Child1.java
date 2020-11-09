package kh.chapter8_Polymorphism.poly.model.vo;

public class Child1 extends Parents{
	
	private String lastName;
	private int loan; // 빚

	// 오버라이드 성립 조건
	// 1. 부모 메소드와 반환자료형, 메소드명,
	//	   매개 변수 자료형이 모두 일치해야 한다. 
	// 2. 접근 제한자를 변경할 경우 부모가 가진
	//	   원조 메소드보다 더 큰 범위로만 변경할 수 있다.
	// 3. 예외 처리 시 부모 메소드 보다 예외의 갯수가
	//	   더 많으면 안된다.
	
	@Override
	public void sayMyName() {
		System.out.println("나는 첫번째 자식입니다!");
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
