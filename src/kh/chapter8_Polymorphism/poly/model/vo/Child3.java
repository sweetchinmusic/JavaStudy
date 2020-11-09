package kh.chapter8_Polymorphism.poly.model.vo;

public class Child3 extends Parents {
	
	public Child3() {}
	
	@Override
	public void sayMyName() {
		System.out.println("나는 세번째 자식입니다.");
	}

	public void singing() {
		System.out.println("나는 가창력이 뛰어나요!");
	}
}
