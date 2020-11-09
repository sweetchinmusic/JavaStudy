package kh.chapter2_Variable.var;


import java.util.Scanner;

public class InputVariable {
	// 기능 제공용 클래스
	
	public void InputMethod2() {
		// system.in : 키보드(입력)
		// system.out : 모니터(출력)
		// system.err : 블루스크린(에러전담)
		
		// 자바 1.5 버전 이후부터 키보드 입력값을 보다 쉽게 처리하기 위한 객체가 생성되어 제공된다. ( Scanner)
		
		// Scanner : 자료형 별로 값을 각각 입력받을 수 있는 객체
		
		Scanner sc = new Scanner(System.in);
		//java.util.Scanner sc = new java.util.Scanner(System.in);
		
		//키보드 입력값을 받기 위한 변수 공간 선언
		String name;    //이름
		int age;		//나이
		double height;	// 키
		
		// 화면에 값을 받기 위한 안내 메시지 출력하기
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine();
		
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		
		System.out.print("키를 입력하세요 : ");
		height = sc.nextDouble();
		
		//키보드로 입력한 내용 출력하기
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		System.out.println();
		// - 끝 -
		
		
	}
}
