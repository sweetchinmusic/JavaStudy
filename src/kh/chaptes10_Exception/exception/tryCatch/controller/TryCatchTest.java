package kh.chaptes10_Exception.exception.tryCatch.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchTest {
	// 예외처리를 직접 처리하는 try-catch 테스트
	
	public void methodA() {
		System.out.println("메소드 A 호출 확인");
		try {
		
		methodB();
		
		} catch (Exception e) { // catch문 다시 공부하기
			System.out.println("메시지 : " + e.getMessage());
			
		} finally {
			
			System.out.println("예외 발생과 여부에 관계없이 실행하는 부분");
			
		}
		
		System.out.println("메소드 A 종료");
	}
	
	public void methodB() throws Exception {
		System.out.println("메소드 B 호출 확인");
		
		// 강제로 예외 상황 발생
		throw new Exception("강제로 예외 상황이 발생했습니다!"); // new exception - 생성자 얘는 매개변수가 있다.
	}
	
	
	
	
	
	public void ioTest1() {
		// 자바 프로그램은 시스템에 어떠한 글을 작성하는
		// 입력 자원(System.in)과 화면에 출력하는 출력자원(System.out)
		// 으로 이루어져 있으나, 이를 직접 사용할 수는 없다. 메모리도 직접 다룰 수 없어서 못 보여준다. 썼으면 돌려준다.
		// 즉, 입출력 자원을 운영체제로부터 빌려오며
		// 이렇게 빌려온 입출력자원(IO Resource)을 반납해야한다.
		// 요놈이 입력 자원
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(
								new FileReader("test.txt"));
			
			// test.txt로부터
			// 받아 올 문자열을 담는 변수 만들기
			String str = "";
			
			do {
			
				// readLine() 메소드는 엔터 전까지
				// 한 줄 전체를 읽는 메소드이다.
					str = br.readLine(); // 키보드로 부터 값을 입력받거나 화면에 출력하기 위해서 쓰는건데 이 빌린걸 따른 애가 중간에 가져가버리면 사라져버리니깐
					// 중간에 try catch를 하는데
					
				
					if(str !=null) {
						System.out.println("내용 : " + str);
					}
					
				} while(str!=null);
			
				br = null; // 역할
			
		} catch (FileNotFoundException e) { 
				
			// 여러 개의 catch 구문을 통해 서로 다른 각각의
			// 예외 상황을 처리할 수도 있다.
			// 단, 이 경우 각 예외에 따른 상속관계를 유의해야한다.
			// 즉, 자식부터 부모의 순서로 예외를 나열해야한다.
			// 만약 각 예외가 형제관계이거나 서로 관련이 없는 예외일 경우
			// 둘 모두를 비교한다는 의미로
			// AException | Bexception
			// 비트 비교 연산자로 둘 모두를 비교할 수도 있다.
			
			
			e.printStackTrace();
			
		} catch (IOException e) { // 위에께 자식 이게 부모, 그래서 땡겨서 다 해결해줄 수 있다. 그래서 순서에 맞게 자식부터 부모로,그래야 세분화, 부모가 어떤 상황인지 
			//if else처럼 위에서 잡고 그다음에 나머지를 아래로, 서로 뒤바뀌었을 경우 그냥 File이거 하나만 설정해도 된다.
			e.printStackTrace();
		
		} finally {
			// 빌려온 입출력 자원 반납하기 // 자바는 기본적으로 블록단위로 실행함.
			
			try {
				// 다중 try-catch도 가능하다.
				br.close();
				
			} catch (IOException | NullPointerException e) {
				// 왼쪽 빨간거는 체크드 익셉션 오른쪽은 언체크트 
				// 왼쪽꺼지우면 빨간줄 안뜸
//					e.printStackTrace();
				System.out.println("입력자원 반납 중 문제가 발생했습니다.");
				
			 
			}
		}
	}
	public void ioTest2() {
		// try with resource
		// try 안에 작성한 입출력 자원을
		// 모두 사용한 후 자동으로 close()하여
		// 해당 자원을 알아서 반납해주는 예외처리 구문
		// 자바 1.7 (현 7버전이라 칭함) 때 생성되었음
		
		try(//짧게 쓸 수 있고 에러를 직접 잡아줌.
					BufferedReader br = new BufferedReader(new FileReader("test.txt"));
				){
			String str = "";
			
			do {
				str = br.readLine();
				
				if(str != null) {
					System.out.println("읽은 내용 : " + str);
				
				}
				
			} while(str != null);
	
		} catch(Exception e) { //
			// 이렇게 상속&다형성을 활용하여
			// 문제가 발생하는 예외보다 상위의 예외로
			// 한 번에 해당 내용을 처리할 수도 있다.
			// 두 가지 다 하자
			e.printStackTrace();
		}
	}
		
}
		



