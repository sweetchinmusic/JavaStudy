package kh.chaptes15_Thread.sync;

public class WithdrawTest {

	public static void main(String[] args) {
		// 동기화 처리의 필요성을 확인하기 위한 기능 구현
		// ATM 기기 출금 시나리오 
		GammaGo gg = new GammaGo();
		
		new Thread(gg).start(); // 0번 스레드 (A)
		new Thread(gg).start(); // 1번 스레드 (B)
	}

}
// 계좌 개설용 클래스
class Account {
	// 현재 가진 금액을 저장
	private int balance = 10000;
	
	public int getBalance() {
		return balance;
	}
	// Getter 와 Setter는 필요치 않으면 굳이 만들지 않아도 된다.
	// public void setBalance(int balance) {
	//	this.balance = balance;
//	}
	
	public synchronized void withdraw(int money) {
		// synchronized 순서를 정한다
		
		String tName = Thread.currentThread().getName(); // 지금 쓰고 있는 너! 이름을 가져와라
		
		System.out.println(tName + "님께서 가진 금액 : " + balance); // 밸런스는 내꺼니깐 직접 가져올 수 있다.
		
		if(balance >= money) {
			
			// 인출하는데 시간이 걸린다고 가정한다.
			for(int i = 0 ; i < 10000000; i++);
			
			balance -= money;
			
			System.out.println(tName + ">> 인출 : " + money
					 + " 잔액 : " + balance);
		} else {
			System.out.println("잔액이 부족합니다.");
		}
		
	}
}

class GammaGo implements Runnable {
	// 계좌에서 금액을 출금하는 기능을 가진 스레드
	
	public Account acc = new Account();
	
	@Override
	public void run() {
		while(acc.getBalance() > 0) {
			// 잔고에 돈이 있다면 계속 뽑는 로직(알고리즘, 기능)
			try {
				Thread.sleep(2000);
				
			} catch (InterruptedException e) {

				e.printStackTrace();
			
			}
			
			int money = ((int)(Math.random() * 3) + 1 ) * 1000;
			acc.withdraw(money);
			
		}
		
	}
	
}