package kh.chaptes14_Event.com.kh.event.view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
//인터페이스는 미완성된거
public class KeyEventTest extends JFrame implements KeyListener{

	// 키 입력을 확인하기 위한
	// KeyListener 구현하기
	
	private JTextField text;
	
	public KeyEventTest() {
		super("키입력 테스트"); 
		setBounds(300, 300, 300, 150);
	
		// 1. 이벤트 등록을 위한 컴포넌트  생성하기
		text = new JTextField(20);
		
		// 2. 생성한 컴포넌트에 이벤트가 발생했을 때
		//    이를 감지할 수 있는 리스너 연결(바인딩)하기
		text.addKeyListener(this);
		
		// 3. 컨테이너의 컴포넌트 추가하기
		add(text);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// 키가 입력되었을 때, 화면에 키 입력한 키가 표시될 때 감지
//		display("키 typed 이벤트", e);
//		sampleMyEvent();
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// 키가 눌려졌을 때 감지하는
//		display("키 Pressed 이벤트", e);
//		sampleMyEvent();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// 키보드에서 손을 뗐을 때 감지
		display("키 Released 이벤트", e);
		sampleMyEvent();
		// 완성도가 높다.
	}
	
	// 실행 확인을 위한 이벤트 상태 출력 메소드
	public void display(String eventName, KeyEvent e){
		
		char ch = e.getKeyChar();
		int keyNum = e.getKeyCode();
		
		String modifier = e.isControlDown()+ ", "
					+ e.isAltDown() + ", "
					+ e.isShiftDown();
		
		System.out.println("key 이벤트명 : " + eventName);
		System.out.println("[" + keyNum+"] : " + ch);
		System.out.println("특수키 입력 확인 : " + modifier);
	}
	
	public void sampleMyEvent() {
		System.out.println("---- 10자 이내인지 확인합니다. ----");
		
		if(text.getText().length() > 10) {
			System.err.println("10자를 초과합니다!");
		} else {
			System.out.println("아직까지는 괜찮아요! ^__^");
		}
	
	}	
}
