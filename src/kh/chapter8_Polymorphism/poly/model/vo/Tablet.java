package kh.chapter8_Polymorphism.poly.model.vo;

public class Tablet extends Product {
	private boolean usablePen;

	public Tablet() {
	} // super는 생략이 가능함.

	public Tablet(String modelName, int price) {
		super(modelName, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		System.out.println(super.getModelName() + " : " + "태블릿 화면울 보여 줍니다.");
	}

}
