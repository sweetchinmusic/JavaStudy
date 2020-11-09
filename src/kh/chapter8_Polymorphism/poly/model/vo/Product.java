package kh.chapter8_Polymorphism.poly.model.vo;

// class 예약어 
// final : 종단클래스 (자식을 만들 수 없다고 함)
// abstract : 미완성 클래스, 사용하기 위해서는 반드시
// 			  상속을 통해서 자식 클래스를 생성해야만 사용할 수 있는
//			  사용할 수 있는 클래스
// ** 만약에 클래스 내에 abstract (미완성) 메소드를
//	  하나라도 포함하고 있다면 반드시 이 예약어를 사용해야 한다.
public abstract class Product { // 추상 클래스
	// 필드 선언
	private String modelName;
	private int price;

	public Product() { // 정말 기본적인걸 수행할 수 있습니다.
		this.modelName = "모델없음";
		this.price = 0;
	}
	
	public Product(String modelName, int price) { // 매개변수
		super();
		this.modelName = modelName;
		this.price = price;
	}

	// Getter & Setter
	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// 공통 메소드
	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}

	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}

	// abstract : 미완성 메소드
	// 만약에 메소드 내부에서 실행될 내용이 굳이 구현할 필요가 없는
	// 즉, 다른 자식 클래스들이 무조건 바꾸게 해야할 경우 해당 자식들에게
	// 반드시 이걸로 구현해 주세요~ 라는 규칙을
	// 지정하기 위한 예약어
	
	public abstract void display();

	
	
}
