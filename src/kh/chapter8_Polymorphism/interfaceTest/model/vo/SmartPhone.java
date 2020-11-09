package kh.chapter8_Polymorphism.interfaceTest.model.vo;

import java.io.Serializable;

/*
 * - 상속 - 
 * 미완성 클래스 / 클래스 : extends
 * 인터페이스 : implements
 *  (인터페이스는 여러 개를 상속받을 수 있다.)
 *  
 */

public class SmartPhone extends Product 
						implements IProduct, Serializable { // 나중에 직렬화에 대해서 배움

	// 미완성 클래스는 어느 정도 완성된 내용을 가져다 쓸 수 있는
	// 선택형 규칙을 제공하는 기법
	// 인터페이스는 미완성 메소드들을 반드시 구현하도록
	// 강제성 규칙을 제공하는 기법
	
	
	@Override // 인터페이스는 클래스를 상속받을 수 없음.
	public void testMethod2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void testMethod3() {
		// TODO Auto-generated method stub

	}

	@Override
	public void testMethod1() {
		// TODO Auto-generated method stub

	}

}
