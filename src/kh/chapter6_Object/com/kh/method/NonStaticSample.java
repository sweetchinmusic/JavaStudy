package kh.chapter6_Object.com.kh.method;

import java.util.Random;
import java.util.Scanner;

public class NonStaticSample {
	
	
	Scanner sc= new Scanner(System.in);
	//1. 반환값 없고 매개변수 없는 메소드
	//실행 요청시 1~45까지의 임의의 정수 6개 중복되지 않게 발생시켜 출력하는 메소드
	//메소드명 : printLottoNumbers
	public void printLottoNumbers() {
		Random nance = new Random();
		int[] arr = new int[6];
		//입력문
		for(int i = 0; i < arr.length ; i++) {
			 arr[i] = nance.nextInt(45)+1;
			 for(int j = 0;j<i;j++) {//중복 제거하는 방법
				 if(arr[i]==arr[j]){
					 i--;
					 break;
				 }
				 
			 }
		}
		//출력문
		for(int i = 0; i< arr.length ; i++) {
			System.out.print(arr[i] + " ");
			
		}	
}
	//2. 반환값 없고 매개변수 있는 메소드
	//실행 요청시 정수 하나, 문자 하나를 전달받아 문자를 정수 갯수만큼 출력하는 메소드
	//메소드명 : outputChar
	public void outputChar(int a,char b) {
		for(int i=0; i<a; i++) {
			
			
			System.out.print(b);	
		}
		
	}
	
	//3. 반환값 있고 매개변수 없는 메소드
	//실행 요청시 알파벳 범위의 임의의 영문자를 하나 발생시켜 리턴하는 메소드
	//메소드명 : alphabette
	//public static void main1(String[] args) {
//		int i = alphabette();
//		System.out.println((char) i);
//	}

	public int alphabette() {
		Random nance = new Random();
		int i = nance.nextInt(26)+65;
		return i;
	
} 
}