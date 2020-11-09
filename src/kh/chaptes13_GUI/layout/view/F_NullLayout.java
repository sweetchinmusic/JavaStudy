package kh.chaptes13_GUI.layout.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class F_NullLayout extends JFrame {
	public F_NullLayout() {
		// NullLayout(AbsoluteLayout) :
		//		개발자가 원하는 위치에 직접 컴포넌트를
		//		가로 세로 공간을 지정하여 배치하는 방식
		
		super("재혁's 랜덤푸드 절대 영역 지정하기");
		
		setBounds(300, 300, 600, 500);
		
		setLayout(null);
		// 레이아웃을 직접 지정하지 않으면 기본은
		// FlowLayout이다. 이 때 레이아웃 자체를 쓰지 않겠다.
		// 선언하려면 setLayout() 에 null을 넣으면 된다.
		
		JLabel label = new JLabel("이름 : ");
		label.setLocation(50, 100);
		label.setSize(150, 50);
		
		// 화면에 글을 입력할 수 있는 텍스트 상자 컴포넌트
		JTextField textField = new JTextField();
		textField.setLocation(100, 100);
		textField.setSize(150, 50);
		// 얘가 덮어씌운거라서 더 앞에 
		
		// 로그인 버튼 만들기
		JButton btn = new JButton("로그인");
		btn.setLocation(300, 100);
		btn.setSize(100, 50);
		
		
		add(label);
		add(textField);
		add(btn);
		
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 절대영역 안 늘어남.
	}
	
}
