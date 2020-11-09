package kh.chaptes15_Thread.deamon;

public class DaemonTest {
	// 데몬 스레드
	// 일반 스레드와 달리 스스로 작업을 수행하는
	// 자체 기능 수행 스레드를 말한다.
	// 데몬 스레드는 프로세스 실행 전에
	// 반드시 사용한다고 등록해야 쓸 수 있다.

	// 자동 저장 옵션 데몬 안불러도 알아서
	public static boolean autoSave = true;

	public static void main(String[] args) {

		DaemonThread dt = new DaemonThread(); 
		
		// 데몬으로 등록하여 스스로 동작 시키기
		dt.setDaemon(true);
		
		dt.start();
		
		for(int i = 0; i < 10 ; i ++) {
			
			try {

				Thread.sleep(1000);
			
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			
			System.out.println(i + "초가 지났습니다.");
			
			if(i == 8) {
				autoSave = false;
			}
		}
		
		System.out.println("프로그램 종료~!");
	}

}








class DaemonThread extends Thread { // thread는 run을 상속받음
	
	public void autoSave() {
		System.out.println("지금 자동 저장합니다.");
	}

	@Override
	public void run() {
		
		while(true) {
			if(DaemonTest.autoSave) {
				autoSave();
				
				try {

					Thread.sleep(3000);
				
				} catch (InterruptedException e) {
				
					e.printStackTrace();
				}
				
			}
		}
	}
	
	
}