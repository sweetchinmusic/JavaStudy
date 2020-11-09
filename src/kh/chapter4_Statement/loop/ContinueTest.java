package kh.chapter4_Statement.loop;

public class ContinueTest {
	// Continue : 반복문 내에서
	// 특정 조건을 만날 경우, 해당 반복 구간을
	// 건너 뛰고자 할 때 사용하는 분기문
		
	// if(조건문) { continue; }
	
	// 단, continue로 건너 뛰더라도
	// 반복문은 다음 반복 횟수로 넘어가면
	// continue 하단의 작성된 코드를 무시한다.
	// 이게 무슨 말?
	public void testContinue1() {
		// 1 부터 100까지의 합
		// 단, 4의 배수는 제외하기
		// ( N % 4 == 0 )
		
		int sum = 0;
		
		for(int i = 1; i < 101 ; i++) {
			
			if(i % 4 == 0) {
				continue;
			}
			
			System.out.print(i + " + ");
			sum +=i;
		}
		System.out.println("결과 : " + sum);
	}
	
	public void testContinue2() {
		// 구구단을 출력하기 
		// 단, for문을 활용하고
		// 각 단의 홀수 곱만 출력하기
		// ------ N 단 ----------
		// N * 1 = M
		// N * 3 = M
		// . . . 
		
		for(int  dan=2; dan<10; dan++) {
			System.out.println("----dan" + dan + "단----");
				for(int su = 1; su < 10 ; su ++) {
					
					if(su % 2 == 0) { 
						continue;
					}
					
				System.out.println(dan + "*" + su + "=" + (dan*su));
				}
				System.out.println("------------");
		}
		
		
		
	}
	
}








