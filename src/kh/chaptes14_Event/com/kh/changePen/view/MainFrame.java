package kh.chaptes14_Event.com.kh.changePen.view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
	
	private JPanel pan; // a메인 프레임에 위치할 주 화면
	private boolean check; // 특정 이벤트에 따른 화면 교체용 변수
	
	public MainFrame() {
		super("패널 교체 테스트");
		
		setBounds(300, 300, 500, 400);
		
		pan = new MyPanel1();
		
		pan.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// 마우스로 클릭 시 패널 교체
				replace();
			}
		});
		
		add(pan);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	public void replace() {
	
		// 현재 등록된 화면 제거
		this.remove(pan);
		
		if(check == true) {
			pan = new MyPanel1();
		} else {
			pan = new MyPanel2();
		}
		
		pan.addMouseListener(new MouseAdapter() { // 익명 클래스를 썼을때 단점, 다시 뉴를 써야한다.
			
			@Override
			public void mouseClicked(MouseEvent e) {
				replace();
				
			}
		});
		
		this.add(pan);
		
		check =!check;
		
		//자바는 화면 객체와 화면 구현 그래픽이 별도로 관리된다.
		// 따라서 화면이 변경 되었을 때 그래픽 객체를 통해
		// 화면의 소스 코드가 변경되었음을 다시 알려주며
		// 화면을 재구성해야 한다. 이때 사용하는 메소드가 repaint()이다.
		// 위에서 화면 바꿔놓으니 다시 그려라! 지금!
		repaint();
	}
	

}
