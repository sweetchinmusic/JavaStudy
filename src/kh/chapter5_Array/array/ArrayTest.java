package kh.chapter5_Array.array;

public class ArrayTest {
	// 기능 제공 메소드만을 담은 클래스
	
	public void testArray1() {
		// 배열 사용하기
		
		// 변수만 사용했다면...
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		int num5 = 50;
		// ... 50개라면 ?? ...
		
		// 5개의 변수들의 합 구하기
		int sum = 0;
		
		sum += num1; // 변수가 너무 많으면 해당 변수를
		sum += num2; // 관리하기 어려울 분더러
		sum += num3; // 후에 연산처리를 수행할 때도	
		sum += num4; // 변수의 이름이 각각 달라서
		sum += num5; // 반복문 조차도 사용할 수 없다.
		// 즉, 일일이 다 더해야 한다.
		// 50개나 써야 하는 상황..
		// 위의 코드를 배열을 통해 풀어본다면
		
		
		// 배열
		int[] arr = new int[5]; 
		// int arr[] = new int[5];
		
		// 각 배열의 방에 선언한 자료형{int)과
		// 일치하는 값(리터럴)을 하나씩 순서대로 저장이 가능하다.
		// 단, 시작 번호는 0부터
		
//		
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
//		
		// 배열을 사용하여 값을 저장할 경우
		// 반복문도 활용할 수 있다.
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = i * 10;
		}
		
		// 배열을 활용한 합계 구하기
		int sum2 = 0;
//		
//		sum2 += arr[0];
//		sum2 += arr[1];
//		sum2 += arr[2];
//		sum2 += arr[3];
//		sum2 += arr[4];
//		
		// 값을 연속으로 계산할 때에도
		// 반복문을 활용할 수 있다!
		for(int i = 0; i < arr.length ; i++) {
			sum2 += arr[i];
			
		}
		System.out.println("sum2 : " + sum2);
		
	}
	
	public void testArray2() {
		// 배열 사용방법
		// 선언 방식
		// 자료형[] 변수명;
		// 자료형 변수명[];

		// 배열을 선언하면 Heap 메모리에
		// 배열의 크기만큼 공간을 할당하고
		// 가장 앞에 있는 공간의 주소값을
		// 가져와 Stack 메모리에 저장한다.
		
		// 생성 및 초기화 방식
		// 1. 공간만 할당하는 경우
		int arr[] = new int[10];
		
		// 2. 배열의 값으로 초기화하며 선언하는 경우
		int[] arr2 = new int[] {1,2,3,4,5};
		
		// * 공간과 초기값을 함께 설정하는 경우
		// 컴퓨터가 공간을 기준으로 잡을 지
		// 값을 기준으로 잡을 지 몰라 에러가 발생한다!
//		int[] arr3 = new int[5] {1,2,3,4,5}; ===ERROR!!!
		
		// 3. 배열의 값으로 초기화하며 선언할 경우
		// 	  앞의  'new 자료형[]'이 생략 가능해진다.
		int[] arr3 = {1,2,3,4,5}; //숏핸드

		// 참조 자료형
		// String, 배열 등과 같이
		// Heap 메모리에 값을 저장하는 변수들은
		// 별도의 주소값을 가지게 되는데,
		// 이렇게 new로 생성하는 변수들을
		// 주소로 참조한다, 라고하여 참조 자료형이라 부른다.
		// (Reference Variable/Type)
		// 따라서 이러한 참조 자료형 변수들은 변수 자체는
		// 주소값을 가지고, 이 주소값으로 간접적인 값 접근을 한다.
		
		int[] arrTest1 = new int[10];
		char[] arrTest2 = new char[10];
		
		// heap 메모리는 우리가 직접 접근 할 수 없으나
		// 고유의 주소라는걸 간접적으로나마 볼 수는 있다
		
		System.out.println("arrTest1 : " + arrTest1);
		System.out.println("arrTest2 : " + arrTest2);
		
		// 위의 방식 외에도 고유 주소라는 것을 확인 할 수 있는
		// 메소드가 있는데, 바로 hashcode() 메소드이다.
		// java에서는 직접적인 하드웨어의 메모리 저장 위치를
		// 알 수 없도록 하였다-접근을 하지 못한다..운영체제를 건들이지 못하기 때문 C언어는 가능 JAVA는 운영체제 위에 JVM으로 개발하기 때문에
		// 대신 각 참조 변수들이 고유의 값을 가졌다는 것을
		// 해시 알고리즘을 통해 산출한 숫자데이터로 증명할 수 있다.
		
		System.out.println("arrTest1.hashCode() : " + arrTest1.hashCode()); 
		System.out.println("arrTest2.hashCode() : " + arrTest2.hashCode());
		
	}
	
	public void testArrayCopy() {
	// 얕은 복사와 깊은 복사
	// 얕은 복사는 배열의 주소만을 복사하는 방법
	// 마치 바로가기 아이콘처럼 실제 원본이 변경되었을 때
	// 원본의 변경된 내용이 사본 배열에도 그대로 반영되는 복사 방법
		
		int[] originArr = { 1, 2, 3, 4, 5}; //주소만 복사
		int[] copyArr = originArr;
	// 안에 있는 내용을 출력하는 반복문
	for(int i = 0; i < originArr.length ; i++) {
		System.out.print(originArr[i]+ " ");
		}
		
		System.out.println("\n-------------------");
		
		// 사본 배열 출력하기
		for(int i = 0; i < copyArr.length ; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println("\n===================");
		
		// 원본의 배열 0번째 값을 99로 변경한 뒤에
		// 다시 원본 배열과 사본 배열 확인하기
		originArr[0] = 99;
		
		System.out.println("원본 배열 변경 후 : ");
		
		for(int i =0; i< originArr.length ; i++) {
			System.out.print(originArr[i] + " ");
		}
		
		System.out.println("\n----------------");
		
		System.out.println("사본 배열 확인 : ");
		
		for(int i = 0; i < copyArr.length ; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println("\n====================");
	
	//얕은 복사를 해서 메모리 값을 직접 확인할 수 없기 때문에 주소지를 찾아간다?
		// 해시코드 확인하기
		System.out.println("원본 배열 해시코드 : " + originArr.hashCode());
		System.out.println("사본 배열 해시코드 : " + copyArr.hashCode());
	}
	//깊은 복사의 필요성..;;
	public void testArrayCopy2() {
		// 깊은 복사 방법 1
		// for문을 활용하여 1:1 값 대입하기
		
		int[] originArr = { 1, 2, 3, 4, 5};
		int[] copyArr = new int[originArr.length];

		// 복사하기 전 원본 배열과 사본 배열 확인하기
		for(int i = 0; i < originArr.length ; i++) {
			System.out.print(originArr[i] + " ");
		}
		
		System.out.println("\n--------------------");
		
		for(int i = 0; i < copyArr.length ; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println("\n===============");
		
		// 원본 배열을 사본 배열로 이동하기
		for(int i = 0; i < originArr.length ; i++) {
			copyArr[i] = originArr[i];
			// 0 <------ 1
			// 0 <------ 2
			// 	.	.	.
		}
		
		// 복사한 결과 확인하기
		// 원본 배열
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println("\n-----------------");
		// 사본 배열
		for(int i = 0; i< copyArr.length ; i++) {
			System.out.print(copyArr[i] + " ");
			
		}
		System.out.println("\n================");
		// 원본 배열의 0 번째 값을 99로 변경하고
		// 원본 배열과 사본 배열 확인하기
		
		originArr[0] = 99;
		
		System.out.println("원본 배열 변경 후 : ");
		for(int i = 0; i< originArr.length ; i++) {
			System.out.print(originArr[i] + " ");
			
		}
		System.out.println("\n----------------");
		System.out.println("사본 배열 확인 : ");
		for(int i = 0; i < copyArr.length ; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println("\n=================");
		// 두 배열 간 해시코드 확인
		System.out.println("원본 배열 해시코드 : " + originArr.hashCode());
		System.out.println("사본 배열 해시코드 : " + copyArr.hashCode());
	
	
	
	
	}
	
	public void testArrayCopy3() {
		// 깊은 복사 방법 2번째
		// system.arraycopy() 메소드 사용하기
		
		int[] originArr = { 1, 2, 3, 4, 5 };
		int[] copyArr = new int[10];
		
//		   System.arraycopy(복사할 원본 배열,
//					 	        원본 배열의 시작점,
//							사본 배열,
//							사본 배열의 시작점, -- 어디에 0번째부터 넣느냐?
//							복사할 개수)	
//		0 0 0 1 2 3 4 5 0 0 3번째라는게 사실상 4번째?
		System.arraycopy(originArr,0,copyArr,3,originArr.length);
		// 복사한 원본 배열과 사본 배열 비교하기
		
	for(int i = 0; i< originArr.length ; i++ ) {
			System.out.print(originArr[i] + " ");
		}
			System.out.println("\n----------------");
	for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
			
	}
	System.out.println("\n====================");
	
	}
	public void testArrayCopy4() {
		// 깊은 복사 방법 3번째
		// clone() 메소드 사용하기
		
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = new int[10];
		
		System.out.println("사본 배열 해시코드 : " + copyArr.hashCode());
		
		copyArr = originArr.clone();
		// clone() 메소드는 사본 배열이
		// 이전에 어떤 배열이었든지 간에
		// 원본 배열의 내용을 그대로 복제하여
		// 새로운 배열로 다시 만들어 준다.
		// 따라서 이전의 int[10] 배열이 아닌
		// 새로운 int[5] 주소를 가지게 된다.
		
		System.out.println("원본 배열 해시코드 : " + originArr.hashCode());
		
		System.out.println("사본 배열 해시코드 : " + copyArr.hashCode());
	
		for(int i = 0; i< copyArr.length ; i++) {
			System.out.print(copyArr[i] + " ");
		}
	}
	
	public void testArray5() {
		// 배열의 단점 :
		//  1. 같은 자료형만 묶을 수 있다.
		// *2. 배열은 한 번 크기(길이)를 설정하면
		//		다시는 바꿀 수 없다.
		
		// 배열은 기본적으로 특정 길이를 할당하였을 때
		// 즉, int[10] 과 같이 공간을 한정지어 할당하였을 때
		// 그 크기를 다시는 수정할 수 없다.
		
		// 따라서 처음 선언한 길이를 고정으로 가진다.
		
		int[] arr= new int[5];
		
		// 지정한 만큼 배열의 값을 저장하면 문제는 발생하지 않는다.
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = i * 10;
		}
		
		// ArrayIndexOutOfBounds : 
		// 만약 정해진 크기보다 큰 공간으로 값을
		// 추가하려 한다면 이러한 에러가 발생한다.
//		arr[5] = 100;
		
		// ArrayIndexOutOfBounds :
		// NagativeIndex : 
		// 정해진 순번(인덱스)이 아닌 음수의 공간을
		// 선언하면 에러가 발생한다.
		// arr[-1] = 100; ----- ERROR !!
		
		
			
	}
	
		// 자료형 기본값 테스트
		// 테스트용 변수 선언
		boolean booleanChk; //전역 변수  heap이라는 메모리 공간에 저장
		byte byteChk;
		short shortChk;
		char charChk;
		int intChk;
		long longChk;
		float floatChk;
		double doubleChk;
		
		String stringChk;
		
		public void testArray6() {
			// 지역변수에는 스택에 저장이 되기 때문에 값이 없는 변수를 뽑을 수 있다?!
			//	각 기본 자료형과 참조 자료형들은
			// 실제 값이 Heap 메모리에 저장되면서
			// 처음 선언 시에 초기값을 지정하지 않으면
			// JVM이 명시하는 지정 초기값을 가지게 된다.
			System.out.println("boolean 기본값 : " + booleanChk);
			System.out.println("byte 기본값 : " + byteChk);
			System.out.println("short 기본값 : " + shortChk);
			System.out.println("char 기본값 : " + charChk);
			System.out.println("int 기본값 : " + intChk);
			System.out.println("long 기본값 : " + longChk);
			System.out.println("float 기본값 : " + floatChk);
			System.out.println("dobult 기본값 : " + doubleChk);
			
			System.out.println("String 기본값 : " + stringChk);
			
			
		}
		
}










