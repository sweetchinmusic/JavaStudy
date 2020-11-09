package kh.chapter2_Variable.day2.test;

import java.util.Scanner;

public class TestExample1 {

	public void example() {
	String name;
	int age;
	double tall;
	double weight;
	char gender;
	String phone;
	String E_Mail;
	
	name = "홍길동";
	age = 10;
	tall = 100.1;
	weight = 30.1;
	gender = 'M';
	phone = "01041321232";
	E_Mail = "axcasd@nadsf";
			
	
	
	/*
	 * Scanner sc = new Scanner(System.in);
	System.out.println("이름을 입력하세요 : " + name);
	name = sc.nextLine();
	System.out.println("나이를 입력하세요 : " + age);
	age = sc.nextInt();
	System.out.println("키를 입력하세요 : " + tall);
	tall = sc.nextDouble();
	System.out.println("몸무게를 입력하세요 : " + weight);
	weight = sc.nextDouble();
	System.out.println("성별을 입력하세요 : " + gender);
	gender = sc.next().charAt(0);
	System.out.println("전화번호를 입력하세요 : " + phone);
	phone = sc.nextLine();
	sc.nextLine();
	System.out.println("이메일을 입력하세요 : " + E_Mail);
	E_Mail = sc.nextLine();
	*/
	System.out.printf("이름 : %s \n", name);
	System.out.printf("나이 : %d \n", age);
	System.out.printf("키 : %.1f \n", tall);
	System.out.printf("몸무게 : %.1f \n", weight);
	System.out.printf("성별 : %c \n", gender);
	System.out.printf("전화번호 : %s \n", phone);
	System.out.printf("이메일 : %s \n", E_Mail);
	
	
	
	
	
	
}
}