package kh.chapter4_Statement.loop;

public class JumpLoopTest {
	// 만약 여러 개의 중첩 반복문을
	// 실행하던 중에 한 번에 모두 벗어나고 싶을 때
	// 사용하는 분기문
	// ** 여러 반복문을 한 번에 뛰쳐나가 코드를
	//    읽기 어렵게 만드는 주범이 될 수 있다.
	
	// 라벨을 붙여 break 구문과 함께 사용한다.
	
	public void testJumpLoop() {
		// 1부터 10까지의 합을 무한 반복하는 도중
		// 라벨로 빠져 나가기 
		// 계산시스템, 키오스크 내 사이드메뉴까지 선택하다 주문취소해서 초기화면으로 전환했을 경우
	 
		label:
		for(;;) { //while(true) {}
			int sum = 0; 
			for(int i = 1; i < 11 ; i++) {
				sum += i;
				if( i == 3 ) {
					System.out.println(sum); // 1+2+3 => 6
					break label;
				}
			}
		}
	
	}
}
