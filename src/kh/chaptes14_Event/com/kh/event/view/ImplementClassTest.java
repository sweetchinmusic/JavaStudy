package kh.chaptes14_Event.com.kh.event.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImplementClassTest extends JFrame 
								implements ActionListener{
	
	private JButton btn;
	private JLabel lb;
	
	public ImplementClassTest() {
		super("상속받은 이벤트 테스트");
		
		setBounds(300, 300, 300, 300);
		
		JPanel pan = new JPanel();
		btn = new JButton("오늘 수업은 여기까지");
		lb = new JLabel("정말 ?");
		
		// 자기 자신이 가진 이벤트 리스너 호출하기
		btn.addActionListener(this);// 내가 가지고 있으니깐 밑에 친구들을 호출하게됩니다
		
		pan.add(btn);
		pan.add(lb);
		
		add(pan);
		
		setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn) {
			lb.setText("설마, 공부해야지 -__-");
		
		}
	}
	

}
