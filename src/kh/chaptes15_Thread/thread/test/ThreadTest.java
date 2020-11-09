package kh.chaptes15_Thread.thread.test;

public class ThreadTest extends Thread {
// 스레드를 사용하는 방법 1
	// Thread 클래스를 상속받아
	// run() 메소드를 구현하는 방법

	@Override
	public void run() {
		// 스레드가 실행될 때 작동시킬 기능 구현 메소드
		for (int i = 1; i < 11; i++) {
			System.out.println(i + "번째 실행입니다.");

		}
	}

	public static void main(String[] args) {
		ThreadTest thread = new ThreadTest();
		
		thread.start(); // 준비된 기능을 시작하는 메소드
	}
	
}