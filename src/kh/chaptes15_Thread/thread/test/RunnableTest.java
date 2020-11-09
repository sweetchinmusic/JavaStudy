package kh.chaptes15_Thread.thread.test;

public class RunnableTest implements Runnable {

	// 스레드를 사용하는 방법 2
	// Runnable 인터페이스를 상속받아
	// run() 메소드를 구현하는 방법
	private String threadName;
	
	public RunnableTest(String threadName) {
		this.threadName = threadName;
	}
	@Override
	public void run() {
		// start() 메소드를 통해 실행할 내용 구현
		for(int i = 1 ; i < 11 ; i++) {
			System.out.println(threadName + "가 " + i + "번 실행되었습니다.");
		}
		
	}

	public static void main(String[] args) {
		// Runnable 인터페이스는 반드시 스레드를 통해
		// 실행시켜야 한다.
		
		// 단일 스레드일 경우 
//		Runnable myRunnable = new RunnableTest("A_스레드");
//		Thread myThread = new Thread(myRunnable);
//		myThread.start();
		// 멀티 스레드의 경우
		Runnable runnableA = new RunnableTest("A_스레드");
		Runnable runnableB = new RunnableTest("B_스레드");
		
		Thread t1 = new Thread(runnableA);
		Thread t2 = new Thread(runnableB);
		
		// 스레드의 우선순위를 지정하지 않으면 서로 일을
		// OS가 임의로 수행시킨다.
//		t1.start();
//		t2.start();
		
		// 스레드의 기본 우선순위는 5
		System.out.println("t1의 우선순위 : " + t1.getPriority());
		System.out.println("t2의 우선순위 : " + t2.getPriority());
		
		// 만약 각 스레드(일 처리)의 우선순위를 직
		// 정하고 싶다면 1 ~ 10까지의 우선순위를 배정할 수 있다.
		// 하지만 같은 우선순위를 지닌다면, OS가 임의로 수행한다.
		
		t1.setPriority(1);
		t2.setPriority(10);
		
		// 자바에서 우선순위를 직접 지정했더라도
		// 운영체제가 한 번 더 판단하여 최대한의 우선순위를
		// 맞추어 줄 뿐 thread 자체 실행에 큰 영향을 주지 않는다.
		
		t1.start();
		t2.start();
		
		
	}
	
	
	
	
	
}
