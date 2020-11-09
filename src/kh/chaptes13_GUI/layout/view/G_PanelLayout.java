package kh.chaptes13_GUI.layout.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class G_PanelLayout extends JFrame {
	public G_PanelLayout() {
		// 레이아웃은 JFrame 뿐만 아니라
		// JPanel 같은 컨테이너 역할을 수행하는
		// 컴포넌트들에도 적용이 가능하다.
		// JPanel의 기본 레이아웃은 FlowLayout이다.
		
		super("패널 레이아웃");
		
		setLayout(null);

		setBounds(300,300,500,500);
		
		JLabel label = new JLabel("이름 : ");
		label.setBounds(50, 100, 150, 50);
		
		JTextField textField = new JTextField(20);
		textField.setBounds(150, 100, 150, 50);
		
		JButton btn = new JButton("로그인");
		btn.setBounds(300, 100, 100, 50);
		
		// JPanel 생성하여 위의 컴포넌트 담기
		JPanel pan = new JPanel();
		pan.setBounds(0, 0, 450, 450);
		pan.setBackground(Color.white);
		
		pan.add(label);
		pan.add(textField);
		pan.add(btn);
		
		add(pan);
		
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}
}
