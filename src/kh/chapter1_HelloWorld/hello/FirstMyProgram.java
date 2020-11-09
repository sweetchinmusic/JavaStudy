// : 한 줄 주석
/*
 * : 여러 줄 주석
 */
package kh.chapter1_HelloWorld.hello; // 패키지는 클래스를 묶는 단위

/**
 * javadoc : 자바 문서 작성용 주석
 * 
 * 어떠한 클래스나 파일에 대한 내용을 
 * 설명하고자 할 때 적는 주석
 * @author 채우석
 * @when 2020-02-20
 * @version 1.0
 *
 */
public class FirstMyProgram {
	/*
	 * 자바 프로그램 작성 순서
	 * - 프로젝트 생성
	 * - src 폴더 안에(자동) 패키지 생성
	 *	  패키지 : 특정 목적을 가진 소스 코드들(.java / .class)을
	 *			 한 곳에 묶어 놓은 풀더
	 * ex) com.kh.hello
	 * 	   com.samsung.galaxyS20 ..
	 * 
	 * - 클래스 파일 생성
	 * 	 클래스(class) : 어떠한 요소를 작성할 때 사용하는 하나의 설계도면(붕어빵 틀)
	 * - 메소드(함수) 작성
	 * 	  메소드 : 특정 클래스 안에서 하나의 기능을 담당하는 함수를 칭한다
	 * 	  실행용 메소드 : 
	 * 		해당하는 프로젝트 전체에서 단 한 개만 존재하는 메소드
	 * 		프로그램 실행 시 동작하는 함수이다. 
	 * 		public static void main(String[] args) { . . . }
	 *		
	 *   기능 제공 메소드 : 
	 *  	나머지
	 */
	public static void main(String[] args) {
		new FirstMyProgram().myMethod();	//이렇게 꼬으면 메모리를 더 차지하나? 용량은?
		
		System.out.println("안녕하세요.");
			
		//	new FirstMyProgram().myMethod();
	}
	
	public void myMethod() { /// myMethod 시작!
	System.out.println("반갑습니다.");
	int x = 100;
	x--;
	System.out.println(x);
	} // ~ myMethod 끝
	

}
