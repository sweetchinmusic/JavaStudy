package kh.chapter9_API.stringTest;

import java.util.StringTokenizer;

public class StringTest {
	// 문자열 관련 API 테스트

	public static void main(String[] args) {
		StringTest st = new StringTest();

		st.stringMethod1();
		st.stringBuffer();
		st.stringBuilder();
		st.stringSplit();
	}

	public void stringMethod1() {
		// 문자열 특성 확인하기
		// 1. 불변성이다. GC가 가져가기 전까진 한 번 들어가면 안 나감.
//		String str = "안녕";
//		
//		System.out.println(str.hashCode());
//		
//		str += "하세요"; // 이 순간 따로 저장한다는것을 알 수 있음
//		
//		System.out.println(str.hashCode());

		// 출력값 1611021 , 803356551

		// 2. 값이 변경될 때마다 Heap 영역의
		// 공간에 값을 일일이 저장한다.
		// 3. 도한 이미 동일한 값이 저장되어 있으면
		// 문자열을 새로 만들지 않는다.

		String str1 = "Hello World!";
		String str2 = "Hello World!";
		String str3 = new String("Hello World!"); // new를 쓰면 힙의 공간에 새로 늘어남 //new 쓰지말고 == 쓰는걸 권장 . 문자열의 불변성

		// 본래 두 객체의 주소는 달라야 하지만
		// 실행 시 "Hello World"라는 문자열이
		// 저장된 공간을 동시에 바라보고 있기 때문에
		// 두 주소를 동일하다고 판단한다.
		System.out.println("str1 과 str2 비교 : " + (str1 == str2)); // 문자열은 true 안나온다고 했는데 ??
		System.out.println("str1.equals(str2) : " + str1.equals(str2)); // ture

		// 위의 결과를 기준으로 한다면 str1 과 str3 비교 역시
		// true가 나와야 하나, new String()으로 문자열을 새로
		// Heap 메모리에 할당함으로써 두 주소를 다르다고 판단한다.
		System.out.println("str1 과 str3 비교 :" + (str1 == str3)); // false
		System.out.println("str1.equals(str3) : " + str1.equals(str3)); // true

	}

	public void stringBuffer() {
		// 문자열은 안의 내용이 변경될 때마다 새로운 공간을
		// 할당하고 값을 새로 집어넣는다.
		// 이를 막기 위해 임시 공간(buffer)을 하나 준비하여
		// 값을 임시공간에 차곡차곡 담아 두었다 한 번에 처리해주는
		// 클래스가 StringBuffer / StringBuilder이다.

		StringBuffer sb = new StringBuffer();

		sb.append("Hello");
		// 추가하다 더하다
		System.out.println(sb.hashCode());

		sb.append("World!");

		System.out.println(sb.hashCode());

		String str = sb.toString();
		System.out.println(str);
	}

	public void stringBuilder() {
		// Alice : 안녕하세요
		// Bob : 반가워요 (Thread safe의 예)
		// 안반녕가하워세요요 겹쳐서 나옴(동시제어 기능이 없으면)
		//
		// StringBuffer는 동시 제어 기능(Thread safe)을 가진다. //일처리의 단위 + 보호
		// 하지만, 간단한 프로그램 구현이나 동시 제어가 다른 곳에서
		// 일어나는 상황에서는 thread safe 기능이 굳이 필요하지 않다.
		// 따라서 이 기능만 뺀 똑같은 클래스를 사용하기도 하는데
		// 그게 바로 StringBuilder이다!
		
		// 동시기능 자체를 빼버리는 버퍼가 다른 곳에서 기능을 할 수 있어서 ???
		StringBuilder sb = new StringBuilder();

		sb.append("Hello");
		// 추가하다 더하다
		System.out.println(sb.hashCode());

		sb.append("World!");

		System.out.println(sb.hashCode());

		String str = sb.toString();
		System.out.println(str);
	}
	
	public void stringSplit() {
		// 어떠한 문자열을 받을 때
		// "OOO, XXX, AAA" 등의
		// 여러 문자열을 합하여 받는 경우
		// 해당하는 문자열을 다시 열어 개의
		// 문자열로 구분짓는 메소드
		
		String str = "Java, Oracle, HTML5, CSS3, JavaScript, JQuery";
		
		String[] strArr = str.split(", ");
		
		//for-each 반복문
		for(String s : strArr) {
			System.out.println(s);
		}
		
		System.out.println("---------------------");
		
		// split() 메소드처럼
		// 하나의 문자열을 여러 구분자나, 특정 구분자로 나누어
		// 관리하는 객체
		StringTokenizer strTokens = new StringTokenizer(str);
		
		while(strTokens.hasMoreTokens()) {
			System.out.println(strTokens.nextToken(", "));
		}
		
		// join()
		// 여러 문자열은 하나의 문자열로 붙이는 메소드
		// 원본은 변하지 않고 별도의 사본을 만들어서 결과로
		// 꺼내온다.
		
		System.out.println(String.join("-", strArr)); // 이런애들이 어떤데 static으로 만드는건지??
		System.out.println(str);
		
		
		
	}

}
