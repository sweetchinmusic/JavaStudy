package com.kh.member.run;

import com.kh.member.controller.MemberManager;
import com.kh.member.model.vo.*;
public class Main {

	public static void main(String[] args) {
		//각 회원 별 등급 확인 테스트
		
		MemberManager mm = new MemberManager();
		
		// 실버 등급 회원 저장
		mm.insertSilver(new Silver("전찬희","실버",1000));
		mm.insertSilver(new Silver("조성아","실버",2000));
		mm.insertSilver(new Silver("유정훈","실버",3000));
		
		
		mm.insertGold(new Gold("김승규","골드", 10000));
		mm.insertGold(new Gold("조은성","골드", 20000));
		mm.insertGold(new Gold("황창현","골드", 30000));
		
		//Vip 등급 회원 저장
		mm.insertVIP(new VIP("맹재은", "VIP",100000));
		mm.insertVIP(new VIP("박민혁", "VIP",200000));
		mm.insertVIP(new VIP("봉창희", "VIP",300000));
		
		//VVIP 등급 회원 저장
		mm.insertVVIP(new VVIP("문성희","VVIP",1000000));
		
		mm.memberPrint();

	}

	
}
