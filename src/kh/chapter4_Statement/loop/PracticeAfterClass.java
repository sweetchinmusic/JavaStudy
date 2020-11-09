package kh.chapter4_Statement.loop;
import java.util.Scanner;

public class PracticeAfterClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~100 입력 : ");
		int num = sc.nextInt();
		if(num>= 1 && num <= 100) {
			if(num == 1) {
				System.out.print("1은 소수가 아닙니다");
			}else {
				for(int i = 2; i<num;i++) {
					if(num % i == 0) {
					System.out.println(i);
					System.out.println(num + "은 소수가 아닙니다!");
					}
					System.out.println(i);
				}
				System.out.print(num + "은(는) 소수입니다");
			}
		}
	}
}
