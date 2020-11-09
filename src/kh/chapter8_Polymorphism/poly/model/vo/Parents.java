package kh.chapter8_Polymorphism.poly.model.vo;

public class Parents {

	protected int inherit;
	protected String firstName;
	
	public Parents() {}
	
	public void sayMyName() {
		System.out.println("나는 부모 입니다.");
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
}
