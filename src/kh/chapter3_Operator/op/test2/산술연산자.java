package kh.chapter3_Operator.op.test2;

public class 산술연산자 {
	public void testMethod() {
		
		int num1 = 10,num2 = 20;
		
		// + 
		System.out.println("num1 + num2 = " + (num1 + num2));
		// - 
		System.out.println("num1 - num2 = " + (num1 - num2));
		// *
		System.out.println("num1 * num2 = " + (num1 * num2));
		// /
		System.out.println("num1 / num2 = " + (num1 / num2));
		// %
		System.out.println("num1 % num2 = " + (num1 % num2));
		// ** 문자열, 문자, 숫자를 혼합하여 연산할 때 주의사항
		System.out.println(10 + 'A'); // int + char 상황이라 자동으로 int로 변환  유니코드로 65
		
		System.out.println("10" + 'A'); // 문자열이 되어 겹쳐지게된다.
	}

}
