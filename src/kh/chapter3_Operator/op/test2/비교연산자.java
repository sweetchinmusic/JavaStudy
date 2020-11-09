package kh.chapter3_Operator.op.test2;

public class 비교연산자 {
	/*
	 * 비교연산자 ( ≒ 관계연산자 )
	 * --> 두 개의 변수 관계를 따지는 연산자
	 * 	   특정 비교의 조건을 만족하면 true,
	 *  	   	만족하지 못하면 false
	 *  
	 *  <  : A < B : A가 B보다 작은가?
	 *  >  : A > B : A가 B보다 큰가?
	 *  <= : A <= B : A가 B보다 작거나 같은가?
	 *  >= : A >= B : A가 B보다 크거나 같은가?
	 *  == : A == B : A가 B와 같은가?
	 *  != : A != B : A가 B와 다른가?
	 *  
	 */
	
	
	
	public void testMethod() {
		int num1 = 10, num2 = 20;
		boolean result1, result2, result3;
		
		result1 = (num1 > num2) ;
		result2 = (num1 <= num2); 
		result3 = (num1 == num2);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
	}

}
