package com.hw1.run;

import java.util.Scanner;

import com.hw1.controller.FileController;

public class NoteMenu {

	public static void main(String[] args) {
		
		FileController mn = new FileController();
		
		Scanner sc = new Scanner(System.in);
		
		do{
			
			System.out.println("==== OOO's MyNote ====");
			System.out.println("1. 파일 저장하기");
			System.out.println("2. 파일 내용 불러오기");
			System.out.println("3. 파일에 내용 추가하기");
			System.out.println("4. 끝내기");
			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();
			
			switch(sel){
			case 1:
				mn.fileSave();
				break;
				
			case 2:
				mn.fileOpen();
				break;
				
			case 3:
				mn.fileEdit();
				break;
				
			case 4:
				System.out.println("프로그램을 종료합니다");
				return;
				
			default: 
				System.out.println("번호를 잘못 누르셨습니다.");
					
			}
			
		}while(true);
	}

}
