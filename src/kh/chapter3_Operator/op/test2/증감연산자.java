package kh.chapter3_Operator.op.test2;

public class 증감연산자 {
	// ++ : 1증가의 의미를 지닌 연산자
	// -- : 1감소의 의미를 지닌 연산자
	
	// 단일로 사용될 경우 값 자체를 증가(감소)시키는 역할을 하며
	// 전위나 후위 어디에 사용해도 결과는 같다.
	public void testMethod1( ) {
		
		int num = 100;
		
		System.out.println("현재 num 값 : " + num);
		
		// 전위 연산자
		++num;
		System.out.println("현재 ++num 값 : " + num);
		
		//후위 연산자
		num++;
		System.out.println("현재 num++ 값 : " + num);
		//의미가 똑같다~?
		
		--num;
		System.out.println("현재 --num 값 : " + num);
		
		num--;
		System.out.println("현재 num-- 값 : " + num);
	}
	
	public void testMethod2() {
			int num = 10;
			//다른 연산이 함께 수행될 경우
			int result1 = num++ +3;
			System.out.println("result1 : " + result1);
			System.out.println("num : " + num);
			
			int num2 = 10;
			int result2 = ++num2 +3;
			
			System.out.println("result2 : " + result2);
			System.out.println("num2 : " + num2);
			
				
	}
	
	
	
	
	
	
	
	
}
