package kh.chaptes10_Exception.exception.myExcep.controller;

import java.util.Scanner;

import com.kh.exception.myExcep.exception.MyException;

public class MyExceptionTest { //우리도 에러를 만들 수 있다.
	
	public void inputAge() {
		// 나이를 입력받아 19세 이상이면 성인입니다.
		// 19세 미만이면 "미성년자는 출입 불가능합니다."
		// 예외 만들기
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		try {
			checkAge(age);
		} catch(MyException e) {
			// 1. 사용자에게 어떤 에러가 발생했는지 알려주는 코드
			System.out.println(e.getMessage());
			
			// 2. 어디서부터 에러가 발생했는지 알려주는 코드
			e.printStackTrace();
		}
		
	}
	
	public void checkAge(int age) throws MyException{
		
		if(age > 18) {
			System.out.println("성인입니다.");
		} else {
			throw new MyException("미성년자는 출입이 불가능합니다");
		}
	}

}
