package kh.chapter9_API.mathTest;

public class MathTest {

	public static void main(String[] args) {
		double num = 3.5;
		
		System.out.println("num : " + num);
		// 반올림, 올림, 내림
		System.out.println("round() : " + Math.round(num));
		System.out.println("ceil() : " + Math.ceil(num));
		System.out.println("floor() : " + Math.floor(num));
		
		// 12.345 소수점 둘째자리까지 반올림하기
		
		double num2 = 12.345;
		
		num2 *= 10; // 123.45
		System.out.println("num2 : " + Math.round(num2)/10);
	
		// 제곱수 구하기
		int num3 = 5;
		// 5 * 5
		
		num3 = (int) Math.pow(num3, 3); // 세 제곱
				
		System.out.println(num3);
	
		
	}

}
