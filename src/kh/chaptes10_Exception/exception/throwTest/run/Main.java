package kh.chaptes10_Exception.exception.throwTest.run;

import kh.chaptes10_Exception.throwTest.controller.ThrowsTest;

public class Main {

	// 메인 메소드에서까지 예외처리를 던지면 
	// 프로그램이 강제 종료된다!
	public static void main(String[] args) /*throws Exception*/ {
		// 예외 상황을 확인하기 위한
		// 실행 전용 메소드
		
		ThrowsTest th = new ThrowsTest();
		
		// 문제가 발생하는 예외 구문을
		// try-catch 구문으로 묶어 직접
		// 예외를 처리할 수 있다.
		try {
			//문제(예외)가 발생할 수 있는 코드를 작성하는 부분
			th.methodA();
			
		} catch (Exception e){
			//예외가 발생한 시점에 동작할 대체 내용을 작성하는 부분
			//본기능 : 소스코드 유출이 될 수 있기 때문에
			
			//e.printStackTrace(); // 굳이 보여줄 필요가 없기 때문
			
			System.out.println("-- 실행 중 예외가 발생했습니다!! --");
			System.out.println("      관리자에게 문의하세요!");
		} finally {
			// 예외가 발생하든 하지 않든
			// 예외 발생 여부와 관계 없이 실행할 코드를 작성하는 부분
			System.out.println("실행할 내용을 마무리합니다.");
			
		}
		System.out.println("프로그램 정상 종료");
		
		
	}

}
