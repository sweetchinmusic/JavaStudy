package kh.chaptes10_Exception.exception.myExcep.exception;

public class MyException extends Exception {
	// 내가 직접 예외 객체 만들기!
	// 예외처리 용 객체를 직접 만들 경우
	// 반드시 Exception을 상속 받아야한다.
	
	// 기본 생성자
	public MyException() { }
	
	// 예외 관련 메시지를 받을
	// 사용자 정의 생성자
	public MyException(String msg) {
		super(msg);
	}

}
