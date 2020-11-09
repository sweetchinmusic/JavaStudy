package kh.chaptes15_Thread.thread.test;

import javax.swing.JOptionPane;

public class InterruptTest {
	// 현재 실행 중인 스레드를 중간에 정지시키고
	// 다른 스레드를 동작 시킬 때 사용하는 방법
	// ex) 토스트를 구우면서 한 손으로 베이컨 굽고
	//   	굽는동안 잠시 커피를 내리러 갑니다.
	//		만약 중간에 토스트가 탄다면?
	//		커피내리는 작업을 중단해야한다.
	
	public static void main(String[] args) {
		// 스레드 상태
		// INTERRUPT : 실행하던 스레드에 강제 중지 후 끼어듦이 발생했을 때
		// WAITING : 스레드가 종료되지 않고 일시 정지 상태일 때
		// BLOCKED : 스레드가 동기화 상태에서 실행이 일시 정지 되었을 때
		//     RUN : 스레드가 실행 중일 때
		// TERMINATED : 스레드가 기능 수행 완료 후 정지되었을 때
		
		InterruptTest inter = new InterruptTest();
		inter.test();
	}
	
	public void test() {
		CountThread cnt = new CountThread();
		cnt.start();
		
		String answer
		= JOptionPane.showInputDialog("10초 안에 리 자로 끝나는 단어를 적으시오.");
	
		System.out.println("입력 확인 : " + answer);
		
		cnt.interrupt();
	
	}
}

// 10초를 세는 스레드
class CountThread extends Thread {

	@Override // super를 왜 지워
	public void run() {
		int i = 10;
		//					만약 중단 요청이 들어왔다면 true 
		while( i > -1 && !this.isInterrupted()) {
			System.out.println((i--) + " : 현재 상태 = " + this.isInterrupted());
			System.out.println("     상태코드 : " + this.getState());
			
			// 강제로 약 1초 씩 계산하는  가상의 코드
//			for(long l = 0; l < 2000000000L ; l++);
			
			// 스레드를 1000분의 1초 기준으로 잠깐 재우는 메소드
			// 인터럽트익셉션을 catch하였기 때문에
			// 10초 안에 글을 입력해도 멈추지 않는다.
			try {
				Thread.sleep(1000);// 1cho
			} catch (InterruptedException e) { //발생하는 범위가 좀 더 넓어지기 때문에
				System.out.println("자는 중 인터럽트 발생!");;
			} 
		}
		
		
	}
	
}