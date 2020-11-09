package kh.chapter8_Polymorphism.poly.model.vo;

public class SmartPhone extends Product {
	private boolean telCheck;

	public SmartPhone() {} // 기본 생성자 super 는 왜 지우는 거??

	public SmartPhone(String modelName, int price) {
		super(modelName, price);
	}

	@Override
	public void display() {
		System.out.println(super.getModelName() + " : " + "휴대폰 화면을 보여줍니다.");
	}
	
	
	
}
