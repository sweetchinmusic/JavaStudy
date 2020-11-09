package com.kh.member.controller;

import com.kh.member.model.vo.*;

public class MemberManager { // 다형성 : 그냥 멤버로 퉁쳐서 40칸짜리 만들면 안 되나?? 이런 생각
	private Silver[] silvers = new Silver[10];
	private Gold[] golds = new Gold[10];
	private VIP[] vips = new VIP[10];
	private VVIP[] vvips = new VVIP[10];
	
	private int silverCnt;
	private int goldCnt;
	private int vipCnt;
	private int vvipCnt;
	
	public MemberManager() {}
	
	public void insertSilver(Silver s) {
		this.silvers[silverCnt++] = s;
	}
	
	public void insertGold(Gold g) {
		this.golds[goldCnt++] = g;
	}
	
	public void insertVIP(VIP v) {
		this.vips[vipCnt++] = v;
	}
	
	public void insertVVIP(VVIP vv) {
		this.vvips[vvipCnt++] =vv;
	}
	
	public void memberPrint() {
		System.out.println("---------회원 정보 출력------------");
		System.out.printf("%-15s%-15s%-15s%-15s\n", 
				"이름", "등급", "포인트", "인센티브");
		for(int i = 0; i< silverCnt; i++) {
			System.out.printf("%-15s%-15s%-15d%-15.2f\n", 
					silvers[i].getName(),
					silvers[i].getGrade(),
					silvers[i].getPoint(),
					silvers[i].getIncen());
		}
		
		for(int i = 0; i < goldCnt ; i++) {
			System.out.printf("%-15s%-15s%-15d%-15.2f\n", 
					golds[i].getName(),
					golds[i].getGrade(),
					golds[i].getPoint(),
					golds[i].getIncen());
		}
		for(int i = 0; i < vipCnt ; i++) {
			System.out.printf("%-15s%-15s%-15d%-15.2f\n", 
					vips[i].getName(),
					vips[i].getGrade(),
					vips[i].getPoint(),
					vips[i].getIncen());
		}
		for(int i = 0; i < vvipCnt ; i++) {
			System.out.printf("%-15s%-15s%-15d%-15.2f\n", 
					vvips[i].getName(),
					vvips[i].getGrade(),
					vvips[i].getPoint(),
					vvips[i].getIncen());
		}
	
	
	}





}

