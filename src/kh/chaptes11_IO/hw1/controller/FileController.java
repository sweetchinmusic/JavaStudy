package com.hw1.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileController {
	Scanner sc = new Scanner(System.in);
	
	public FileController() {}
	
	public void fileSave (){
		StringBuilder sb = new StringBuilder();
		// “파일에 저장할 내용을 입력하시오
		// (\"exit\"을 입력하면 내용 입력 끝) :”
		
		System.out.println("파일에 저장할 내용 입력(exit는 종료) : ");
		
		// 값을 Scanner로 입력 받아 StringBuilder에 저장하고, “exit”을 입력 했을시 빠져
		// 나가는 while문 생성
		while(true) {
			
			String str = sc.nextLine();
			
			if(str.equals("exit")) {
				break;
			}
			
			sb.append(str + "\n");
		}
		
		// “저장하시겠습니까? (y/n)”
		// 입력 받은 값이 대문자이든 소문자이든 상관없이 “y”이면,
		System.out.print("저장할래? (y/n) : ");
		char ch = sc.next().toLowerCase().charAt(0);
		
		// sc.nextLine(); // 2. 엔터값 미리 처리하기
		if(ch == 'y') {
			System.out.print("파일명 입력 : ");
			String fileName = sc.nextLine();
			
			try(BufferedWriter bw
					= new BufferedWriter(
						new FileWriter(fileName))){
				
				bw.write(sb.toString());
				
				System.out.println("파일 저장 성공!");
				
			} catch(IOException e) {
				
				System.out.println("파일 출력 중 문제 발생!");
				
			}
		}
		
		System.out.println("다시 메뉴로 돌아갑니다.");
	} 
	
	public void fileOpen (){
		// 열기 할 파일 명 입력
		System.out.print("열기 할 파일 명 : ");
		String fileName = sc.nextLine();
		
		try(BufferedReader br
				= new BufferedReader(
				      new FileReader(fileName))){
			
			StringBuilder sb = new StringBuilder();
			
			while(br.ready()) {
				sb.append(br.readLine() + "\n");
			}
			
			System.out.println("읽은 내용 :");
			System.out.println(sb.toString());
			
			System.out.println("파일 읽기 성공!");
			
		} catch (FileNotFoundException e) { 
			
			System.out.println("파일이 없습니다.");
			
		} catch (IOException e) {
			
			System.out.println("실행 중 문제 발생!");
			
		}
	} 
	
	public void fileEdit(){
		
		System.out.println("수정할 파일 명 : ");
		String fileName = sc.nextLine();
		
		try(
				BufferedReader br
					= new BufferedReader(
						new FileReader(fileName));
				
				BufferedWriter bw
					= new BufferedWriter(
						new FileWriter(fileName, true));
		){
			
			System.out.println("현재 저장된 내용");
			
			StringBuilder sb = new StringBuilder();
			
			while(br.ready()) {
				sb.append(br.readLine() + "\n");
			}
			
			System.out.println(sb.toString());
			sb.setLength(0);
			
			System.out.println("파일에 추가할 내용 입력 : ");
			
			while(true) {
				String str = sc.nextLine();
				
				if(str.equals("exit")) {
					break;
				}
				
				sb.append(str + "\n");
			}
			
			System.out.print("저장 할래 ? : ");
			
			char ch = sc.nextLine().toLowerCase().charAt(0);
			
			if(ch == 'y') {
				
				bw.write(sb.toString());
				
				System.out.println("수정 완료!");
			}
			
		} catch (Exception e) {
			System.out.println("문제 발생!");
		}
	} 
}























