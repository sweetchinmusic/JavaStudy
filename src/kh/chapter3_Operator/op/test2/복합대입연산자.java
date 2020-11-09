package kh.chapter3_Operator.op.test2;

public class 복합대입연산자 {
	// 대입연산자와 다른 산술 연산를 함께 사용하는 연산자
	// 산술대입 연산자 : +=, -=, */=, %=
	// 증감연산자와 동일하게 CPU를 거치지 않고
	// 메모리에 직접 연산처리를 수행하기 때문에
	// 처리 속도가 빠르다.
	
	public void testMethod() {
		/*
		 *  += : 왼쪽의 공간 안에 있던 값에 오른쪽 값을 더한 후
		 *       다시 왼쪽 공간에 넣어라
		 *  -= : 왼쪽 공간의 값에서 오른쪽 값을 뺀 후
		 *  	  다시 왼쪽 공간에 넣어라
		 *  *= : 왼쪽 공간의 값과 오른쪽 값을 곱한 후
		 *  	  다시 왼쪽 공간에 넣어라
		 *  /= : 왼쪽 공간의 값에서 오른쪽 값을 나눈 후
		 *       다시 왼쪽 공간에 넣어라
		 *  %= : 왼쪽 공간의 값을 오른쪽 값으로 나눈 나머지를
		 *  	  다시 왼쪽 공간에 넣어라
		 *      
		 */
		int num = 10, result;
		
		System.out.println("num : " + num);
		// num의 값에서 3 증가 시키기
		num = num + 3;
		System.out.println("num 3 증가 후 : " + num);
		// 복합 대입 연산자 사용하기
		num += 3;
		System.out.println("num : " + num);
		num -= 3; // num = num - 3;
		System.out.println("num : " + num);
		num *= 2; // 현재  num 값의 2 배
		System.out.println("num : " + num);
		num /= 2; // 현재 num 값의 1/2배
		System.out.println("num : " + num);
		
		// num = num << 2 --> num <<= 2;
		
		
		
		
	}
}
