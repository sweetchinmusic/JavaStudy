package kh.chapter4_Statement.silsub;

import java.util.Random;
import java.util.Scanner;

public class SilsubTest3 {
Scanner sc = new Scanner(System.in);
	public void test1() {
		//월급 계산 프로그램
		
		
		System.out.println("월 급여액을 입력하세요 : ");
		int sal = sc.nextInt();
		System.out.println("월 매출액을 입력하세요 : ");
		int mae = sc.nextInt();
		if(mae >= 50000000) { int bns = (int) (mae*00.5);
		System.out.println("총 급여는 : " + bns + sal + "입니다."); 
		}// break는 언제 쓸 수 있나?
		else if(mae >=30000000 && mae <50000000) { int bns = (int) (mae*0.03);
		System.out.println("총 급여는 : " + bns + sal + "입니다.");
		}
		else if(mae >=10000000 && mae <30000000) { int bns = (int) (mae*0.01);
		System.out.println("총 급여는 : " + (bns + sal) + "입니다.");
		}
		
		
	}
	
	public void test2() {
		// 잔돈 계산 프로그램
		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("받으신 금액을 입력하세요 : ");
//		int rcv = sc.nextInt();
//		System.out.println("상품 가격을 입력하세요 : ");
//		int prc = sc.nextInt();
//		int ros =(rcv-prc);
//		int sum = 0;
//		if(ros>=50000) { }
		int unit = 50000;// 화폐의 단위 (총 8가지)
		// 50000 -> 10000 -> 5000 -> 1000 -> 500 -> 100 -> 50 -> 10
		
		boolean sw = true; // 단위 변경용 변수
		int money = 0, charge = 0; // 계산될 금액 변수
		int cnt = 0; // 각 화폐 개수 저장용 변수
		
		System.out.print("받으신 금액을 입력하세요 : ");
		money = sc.nextInt();
		
		System.out.print("상품 가격을 입력하세요 :");
		money -= sc.nextInt();
		charge = money;
		
		if(money < 1) {
			System.out.println("금액이 부족합니다.");
			return; // 현재 메소드 종료시키는 문법(명령어)
		}
		
		System.out.println("====================");
		for(int i = 0; i < 8 ; i++) { // 화폐종류가 8종류니깐 반복도 8번!
			
			cnt = money/unit; // 각 금액을 단위로 환산하여 
							  // 몇 매가 필요한지 학인하기
			if(cnt !=0) {
				
			if(i < 4) {

			System.out.println(unit + "원 권 지폐" + cnt + "장");
					
			} else {
			System.out.println(unit + "원 동전 " + cnt + "개");
			
			}
		}
		
		money = money - (cnt * unit); 
		// 금액에서 먼저 계산된 잔금을 뺀
		// 나머지 잔금 계산하기
		if(sw) { // 5로 시작하는 단위일 경우
			unit /= 5;
						
		} else { // 1로 시작하는 단위일 경우
			unit /= 2;
		}
		sw = !sw; // true 면 false로 , false면 true로;
	}
	System.out.println("===========");
	System.out.println("총 거스름돈 : " + charge + "원");
	}
	public void test3() {
		// 1~100 사이의 임의의 난수를 구하는 방법
		// 1. java.lang.Math 클래스 사용방법
		double nance1 = Math.random();
		
		System.out.println("Math.random : " + nance1);
		
		// Math.random()은 0~1 전까지의 임의의 수를
		// 구하는 메소드로 이를 활용하여 여러  숫자를 
		// 임의의 수로 구할 수 있다.
		// 0~0.999... / +1 / *100 --> 0~99.9999.. + 1 --> 1~100.999
		// (int) --> 1 ~ 100
		int nance2 = (int)(Math.random() * 100) + 1;
		System.out.println("Math.random 결과 : " + nance2);
		// 2. java.util.Random 클래스 사용방법
		Random rnd = new Random();
		// 위에 얘가 좀 더 빠름
		int nance3 = rnd.nextInt(100) +1; // 0~99
		System.out.println("Random().nextInt() : " + nance3);
		
		System.out.println("----------------------");
		
		int num = rnd.nextInt(100) +1 ; //임의의 난수 생성
		int count = 0; // 정답 맞춘 횟 수 카운트 변수
		
		do {
			
			System.out.println("숫자 입력 : ");
			int answer = sc.nextInt();
			count++;
			
			if(answer == num) {
				System.out.println("정답입니다!");
				System.out.println(count + "회 만에 정답을 맞추셨습니다!");
				break;
			} else if(answer > num) {
				System.out.println("입력하신 정수보다 작습니다.");
			} else {
				System.out.println("입력하신 정수보다 큽니다.");
			}

		}while(true);
		
		
		
	}
	
	
	

}

