package kh.chaptes12_Collection.kh_review.model.vo;

public class Dessert {
	private String name; // 디저트 이름
	private double cal; // 칼로리
	private int piece; // 조각
	private String origin; // 원산지
	public Dessert() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dessert(String name, double cal, int piece, String origin) {
		super();
		this.name = name;
		this.cal = cal;
		this.piece = piece;
		this.origin = origin;
	}
	public String getName() {
		return name;
	}
	public double getCal() {
		return cal;
	}
	public int getPiece() {
		return piece;
	}
	public String getOrigin() {
		return origin;
	}
	@Override
	public String toString() {
		return "Dessert [name=" + name + ", cal=" + cal + ", piece=" + piece + ", origin=" + origin + "]";
	}
	
	
	

}
