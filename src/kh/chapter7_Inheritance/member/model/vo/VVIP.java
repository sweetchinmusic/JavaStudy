package com.kh.member.model.vo;

public class VVIP extends Member{

		public VVIP() {}
		
		public VVIP(String name, String grade, int point) {
			super(name, grade, point);
		}
		
		@Override
		public double getIncen() {
		
			return super.getPoint() * 0.15;
		}
		
}
