package kh.chapter6_Object.oop.staticmethod;

import java.lang.reflect.Array;
import java.util.Scanner;

public class StaticMethod {
	// Field
	private static String value = "abcefqjskgjskldjgsl";
	
	// Constructor : 필드가 모두 static 일 때는 생성자 필요없음
	// 프로그램 시작 시 이미 생성되기 때문!
	/*
	 * public StaticMethod(){}
	 * 
	 * public StaticMethod(String value){
	 * 	this.value = value;
	 * }
	 */
	
	// value 필드 값 변경용 : 필드가 static 이면 setter도 static 이어야 함
	public static void setValue(String value) {
		
		StaticMethod.value = value;
	}
	
	// value 필드 값 조회용 : 필드가 static이면 getter도 static이어야 함
	public static String getValue() {
		
		return StaticMethod.value;
	}
	
	//필드가 모두 static 일 때는 메소드도 전부 static 이어야 함
	//static method
	//1. 반환값 없고 매개변수 없는 메소드
	//value 필드 값을 모두 대문자로 바꾸는 static 메소드
	//메소드명 : toUpper
	public static void toUpper() {
		
		setValue(value.toUpperCase());
		
		System.out.println(value);
		
	}
	
	//2. 반환값 없고 매개변수 있는 메소드
	//인덱스와 문자를 전달받아
	//value 필드에서 / 전달받은 인덱스 위치의 값을 전달받은 문자로 변경하는 static 메소드
	//메소드명 : setChar
	public static void setChar(int num, char ch) {
		
		if(num < 0 || num > value.length()) {
			
			System.out.println("다시 입력하여 주시기 바랍니다.");
			
		} else {
			
			char arr[] = new char[value.length()];
			for(int i = 0; i < arr.length; i++) {
				arr[i] = value.charAt(i);
			}
			
			Array.setChar(arr, num, ch);
			
			value = "";
			for(int i = 0; i < arr.length; i++) {
				value += arr[i];
			}
			
			setValue(value);
			
		}
		
		System.out.println(getValue());
	}
	

	//3. 반환값 있고 매개변수 없는 static 메소드
	//value 필드에 기록된 글자갯수 리턴 처리
	//메소드명 : valueLength
	public static String valueLength() {

		int num = getValue().length();
		
		return "value의 문자 갯수는 " + num + "입니다.";
	}
		
	
	//4. 반환값 있고 매개변수 있는 static 메소드
	//문자열값을 전달받아, value 필드값과 하나로 합쳐서 리턴 처리
	//메소드명 : valueConcat
	public static String valueConcat(String str) {
		
		setValue(getValue().concat(str));
		
		return getValue();
	}
	
	

}
