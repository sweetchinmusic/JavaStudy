package kh.chaptes12_Collection.list.sort;

public class Product {
	// Fields
	private String name;// 이름
	private int price;// 가격
	private double discount;// 할인율
	
	
	
	// 생성자 (Constructor)
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Product(String name, int price, double discount) {
		super();
		this.name = name;
		this.price = price;
		this.discount = discount;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}


	@Override
	public String toString() {
		return name + ", " + price + ", " + discount;
	}
	
	
	



	
	
}
