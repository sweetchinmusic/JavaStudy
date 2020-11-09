package kh.chapter8_Polymorphism.poly.model.vo;

public class Tv extends Product { // 좋다 상속을 해버림;
	private int channel = 1;

	public Tv() {
	}

	public Tv(String modelName, int price) {
		super(modelName, price);
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	@Override
	public void display() {
		
		System.out.println(super.getModelName()+" : " + channel + "번 채널을 보여줍니다.");
		
	}

}
