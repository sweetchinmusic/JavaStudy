package kh.chaptes10_Exception.exception.throwTest.controller;

public class ThrowsTest {
	// 예외 상황을 발생시키고
	// 어떻게 처리하는지 확인하기 위한
	// 메소드 그룹을 가진 클래스

	public void methodA() throws Exception {
		System.out.println("메소드 A가 호출 되었습니다!");
		
		methodB();
		
		System.out.println("메소드 A가 종료됩니다!"); // 종료됩니다는 왜 출력이 안 되는지??
	}
	public void methodB() throws Exception {
		System.out.println("메소드 B가 호출 되었습니다!!");
		methodC();
		
		System.out.println("메소드 B가 종료됩니다!");
	}
	public void methodC() throws Exception {
		System.out.println("메소드 C가 호출 되었습니다!!!");
		
		// throw : 강제로 특정 예외를 발생시키는 구문 //예외라는건 자바에서 해결할 수 있는것 , error는 할 수 없는것
		throw new Exception(); //여기서 부터 튕겨서 아래까지 못 감.
		
		// 예외상황이 발생할 경우
		// 해당 구문까지만 프로그램에서 실행되고
		// 그 이후에 코드는 실행되지 않는다!
		
//		System.out.println("메소드 C가 종료됩니다!");
	}
}
