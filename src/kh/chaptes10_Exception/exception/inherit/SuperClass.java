package kh.chaptes10_Exception.exception.inherit;

import java.io.IOException;

public class SuperClass {
	public SuperClass() {}
	//예외를 처리하는 메소드
	// 자식에게 예외 처리를 throws 하는
	// 메소드를 물려주는 부모 클래스
	public void exceptionTest() throws IOException {
	
		System.out.println("IO 예외가 발생할 경우 " + " 호출한 곳으로 던지는 메소드");
	}		
}
