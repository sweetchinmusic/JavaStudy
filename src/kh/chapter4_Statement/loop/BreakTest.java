package kh.chapter4_Statement.loop;

import java.util.Scanner;

public class BreakTest {
	// Break : 분기문의 하나로
	// 반복문 내에서 특정 조건에 해당하는 구간을
	// 만났을 때 반복 중인 내용을 종료하는 목적의 문법
	// 단, switch 에서는 예외적으로 각 case를 실행한 후
	// 빠져 나가는 목적으로 작성한다.
	
	// 일반적으로 if문과 함께 특정 조건에서
	// 반복을 종료할 목적으로 쓰인다.
	// if(조건문) { break; }
	
	Scanner sc = new Scanner(System.in);
	
	public void testBreak1() {
		// 문자열을 입력받아 글자 갯수를 출력하는
		// 반복 프로그램 작성하기
		// 단, "end"가 입력되면 프로그램 종료하기
		
		String str = null;
		
		do {
		
		System.out.print("문자열 입력 : ");	
		str = sc.next();
		
		if (str.equals("end")) {
			break; // 반복 강제 종료
		} else {
			System.out.println("문자열 갯수 : " + str.length());
		}
		
		} while(true);
		
		
	}
	
	public void testBreak2() {
		// 숫자를 입력받아
		// 1부터 해당 숫자까지의 합 구하기
		// 단, for문으로 무한 반복을 구현한 뒤
		// break로 빠져 나가기
		
		System.out.println("숫자 하나 입력 : ");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 0; ;i++) {
			sum += i;
			
			if(i == num) {
				break;
			}
		}
	
		System.out.println("1부터 입력한 숫자까지의 합 : " + sum);
	}
	
	
}
