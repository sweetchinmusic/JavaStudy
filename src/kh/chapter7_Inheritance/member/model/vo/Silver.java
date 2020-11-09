package com.kh.member.model.vo;

public class Silver extends Member{
	
	public Silver() {}
	
	public Silver(String name, String grade, int point) {
		super(name, grade, point);
		
	}
	@Override
	public double getIncen() {
		
		return super.getPoint() * 0.03; // getPoint 는 멤버 클래스에 있는것 , 그것을 Incen이라 부르게 한다??? 이게 맞나?
	
	
	}
	// Getter & Setter
	
	
	
	
	
	
	
	
	
}
