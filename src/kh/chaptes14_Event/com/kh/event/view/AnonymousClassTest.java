package kh.chaptes14_Event.com.kh.event.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
// 일회용으로 만들고 파괴시킨다.
public class AnonymousClassTest extends JFrame {
	// 이벤트 리스너를 연결(바인딩)하는 방법
	// 익명 클래스로 즉석 리스너를 생성하는 방법
	// 각 컴포넌트 마다 1회성으로 리스너를 연결하여
	// 다른 컴포넌트는 똑같은 기능을 수행할 때
	// 다시 처음부터 만들어야 한다는 특성이 있다.
	
	public AnonymousClassTest() {
		super("익명 클래스 테스트");
		
		setBounds(300, 300, 300, 300);
		
		JPanel pan = new JPanel();
		JButton btn = new JButton("5억년 버튼");
		JLabel lb = new JLabel("아직 누르지 않았습니다.");
		
		// 익명 클래스로 이벤트 리스너 등록하기
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btn) {
					lb.setText("뻥이지롱!");
					System.out.println(e.getSource());
				}
				
			}
		});
		
		pan.add(btn);
		pan.add(lb);
		
		add(pan);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	

}
