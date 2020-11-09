package com.kh.member.model.vo;

public class Member {
	// 1. 필드 변수(멤버 변수/클래스 변수)
	private String name;
	private String grade;
	private int point;
	//처음부터 부모를 만들지말고 자식을 만든다음에 필요한것을 부모로 승격하면 됨.
	// 2. 생성자
	// 반드시 하나 이상의 생성자를 정의해야 한다.
	public Member() {}
	
	public Member(String name, String grade, int point) {
		this.name = name;
		this.grade = grade;
		this.point = point;
	}
	
	// 3. 기능 제공 메소드
	// Getter & Setter
	
	public String getName() {
		return name;
	}
	public String getGrade() {
		return grade;
	}
	public int getPoint() {
		return point;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	// 모든 자식들이 사용할 수 있는
	// 등급별 포인트 적립 메소드
	public double getIncen() {
		
		return point * 0.0; // 기본은 적립 없음
	
	}
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
