package kh.chapter3_Operator.op.test2;

public class 시프트연산자 {
	// 일반 값을 대상으로 하는 것이 아닌
	// 2진수의 비트 단위 연산을 수행하는 연산자
	// 사용하는 연산자에 따라 왼쪽, 오른쪽으로 비트를
	// 이동시켜 값의 배수 계산, 보수 계산 등에 활용한다.
	
	public void testMethod() {
		byte num1 = 10; // 00001010
		byte num2 = 9;  // 00001001
		byte shft = 1;	// 이동할 칸 수
		
		// AND 연산 : 비교하는 두 비트가 모두 1이어야 결과가 1인 연산법
		System.out.println(num1 + "&" + num2 + " = "
				+ (num1 & num2));
		// OR 연산 : 둘 중 하나라도 1이면 결과가 1인 연산법
		System.out.println(num1 + " | " + num2 + " = "
					+ (num1 | num2));
		// XOR 연산 : 두 비트가 같으면 0, 다르면 1인 연산법
		System.out.println(num1 + " ^ " + num2 + " = "
				+ (num1 ^ num2)); // 00000011 -> 3
		// ~ (비트 반전 연산자) : 현재 비트를 정반대로 뒤지는 연산자
		System.out.println("~10 = " + (num1)); // 11110101
		// 시프트 연산자 : << , >> , >>>
		// 정해진 수만큼 좌측, 우측으로 이동하는 연산자.
		// 왼쪽 1비트 시프트(앞으로 n칸씩 이동하며 뒤의 빈 칸을 0으로 채우는 연산자)
		// 00001010
		// 00010100
		System.out.println(num1 + " << " + shft + " = "
					+ (num1 << shft));
		// 오른쪽 1비트 시프트
		// (뒤로 n칸식 이동하며 뒤로 밀리기 전 첫번째 비트와 같은 비트로
		// 빈칸을 채우는 연산자)
		// 00001010
		// 00000101
		// 10000010
		
		System.out.println(num1 + " >> " + shft + " = "
				+(num1 >> shft));
		// 오른쪽 1비트 시프트 논리 연산자
		// (뒤로 n칸씩 이동하며 빈칸을 무조건 0으로 채우는 연산자)
		System.out.println(num1 + " >>> " + shft + " = "
					+ (num1 >>> shft));
		// >>= , <<=, >>>= (복합 대입 연산자 동일하게 존재한다)
		
	}
}
