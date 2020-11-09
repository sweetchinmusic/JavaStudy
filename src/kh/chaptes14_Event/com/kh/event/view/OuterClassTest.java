package kh.chaptes14_Event.com.kh.event.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
// 다른 화면에서도 뽑아서 쓸 수 있다. 일일이 쓸 애들을 받아와야한다.
public class OuterClassTest extends JFrame {
	// 이벤트 리스너 등록 방법 3
	// 이벤트 전용 클래스를 하나 생성하여
	// 여러 클래스들 간 해당 이벤트를 공유하는 방법
	
	public OuterClassTest() {
		super("아우터 클래스 테스트"); // 프로그램 제목
		
		setBounds(300, 300, 300, 300);
		
		JPanel pan = new JPanel();
		JButton btn = new JButton("버튼 클릭해보세요");
		JLabel lb = new JLabel("아직 버튼을 누르지 않았습니다.");
		
		// 이벤트를 구현한 클래스가 바깥에 있을 경우
		// 빌드 변수를 매개 변수로 하여
		// 이벤트를 연결 시킨다.
		
		btn.addActionListener(new MyEvent(btn, lb));
		
		pan.add(btn);
		pan.add(lb);
		add(pan);
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

class MyEvent implements ActionListener{

	// 필드
	private JButton btn;
	private JLabel lb;
	
	public MyEvent(JButton btn, JLabel lb) {
		this.btn = btn;
		this.lb = lb;
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn) {
			lb.setText("참 잘했어요!");

		}
		
	}
	
}





