package com.hw3.controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import com.hw3.model.vo.Book;

public class BookManager {

	Scanner sc = new Scanner(System.in);

	public BookManager() {
		super();
	}
	
	public void fileSave() {
		Book[] bk = new Book[5];
		
		bk[0] = new Book("자바_소녀_네티", "정경석", 
				        25000, setCalendar(2015, 10, 22), 0.1);
		bk[1] = new Book("이것이_자바다", "신용권", 
						30000, setCalendar(2015, 1, 5), 0.2);
		bk[2] = new Book("빨강머리_앤", "몽고메리",
						16000, setCalendar(2019, 5, 10), 0.3);
		bk[3] = new Book("바다탐험대_옥토넛", "편집부", 
						11800, setCalendar(2015, 5, 1), 0.4);
		bk[4] = new Book("고래의_꿈", "이광렬", 
				10800, setCalendar(2018, 4, 20), 0.5);
	
		try(ObjectOutputStream oos
					= new ObjectOutputStream(
							new FileOutputStream("books.dat"));){
			
			for(int i = 0 ; i < bk.length; i++) {
				
				oos.writeObject(bk[i]);
				
			}
			
			System.out.println("파일 저장 성공!!");
			
		} catch (IOException e) {
			
			System.out.println("파일 저장 중 에러 발생");
		}
	}
	
	public void fileRead() {
		Book[] bk = new Book[10];
		
		try(ObjectInputStream oin
				= new ObjectInputStream(
						new FileInputStream("books.dat"))) {
			
			for(int i = 0; i < bk.length ; i ++) {
				bk[i] = (Book) oin.readObject();
				
				System.out.println(bk[i]);
			}
			
		} catch(FileNotFoundException e) {
			
		} catch(ClassNotFoundException e) {
			
		} catch(EOFException e) {
			
		} catch(IOException e) {
			
		}
		
	}
	
	public Calendar setCalendar(int year, 
								int month, 
								int date) {
		Calendar cal = new GregorianCalendar();
		cal.set(year, month - 1, date);
		
		return cal;
		
	}
	
}







