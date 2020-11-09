package kh.chaptes14_Event.com.kh.event.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
// 클래스 안에 클래스 내가 가진 변수 다 쓸 수 있다. 다른 클래스에선 함부로  쓸 수 없다
public class InnerClassTest extends JFrame {
	// 이벤트 리스너로 이벤트를 등록하는 방법 2
	// 클래스 내부에 또 하나의 클래스를 생성하여
	// 해당 클래스의 모든 컴포넌트를 공유하여
	// 사용하는 방법
	
	// 필드 변수로 어떤 메소드 
	// 해당 객체를 접근할 수 있도록 전역 변수화 선언
	private JButton btn ; 
	private JLabel lb ;
	
	public InnerClassTest() {
		super("내부 클래스 테스트");
		setBounds(300, 300, 300, 300);
		
		JPanel pan = new JPanel();
		btn = new JButton("이 버튼을 누르지 마시오.");
		lb = new JLabel("좋아 , 그대로 계세요");
		
		btn.addActionListener(new MyListener());
		// 캡슐화를 클래스 단위로 할 수 있다.
		
		pan.add(btn);
		pan.add(lb);
		
		add(pan);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	// 내부에 별도의 클래스를 선언함으로써
	// 같은 필드 변수에도 접근할 수 있고
	// 접근 제한자를 통해 보다 더
	// 정보은닉을 확대할 수 있다.
	private class MyListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==btn) {
				lb.setText("Game Over");
			}
			
		}
	}

}
