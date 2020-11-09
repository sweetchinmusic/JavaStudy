package kh.chaptes13_GUI.component.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioButtonTest extends JFrame {

	public RadioButtonTest() {
		
		super("사람다운 사람 테스트");
		
		JPanel pan = new JPanel();
		
		JLabel lb = new JLabel("다음 중 누구를 살리시겠습니까.");
		
		pan.add(lb);
		
		JPanel pan2 = new JPanel();
		
		// 라디오 버튼 넣기
		JRadioButton btn1 = new JRadioButton("소중한 1명");
		JRadioButton btn2 = new JRadioButton("처음 본 100명");
		JRadioButton btn3 = new JRadioButton("나");
		
		// 라디오 그룹
		// 라디오 버튼들은 하나의 그룹에 속해있지 않으면
		// 각각을 별개로 인식한다.
		// 따라서 올바르게 동작 시키기 위해
		// 하나의 버튼 그룹으로 묶어야 한다.
		ButtonGroup bg = new ButtonGroup();
		
		bg.add(btn1);
		bg.add(btn2);
		bg.add(btn3);
		
		
		pan2.add(btn1);
		pan2.add(btn2);
		pan2.add(btn3);
		
		JPanel pan3 = new JPanel();
		
		JLabel resultLb = new JLabel("빨리 선택해보세요~!");
		
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				resultLb.setText("내꺼는...?");
				
				
			}
			
		});
		
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				resultLb.setText("뭐야...머있어...");
			}
			
		});
		
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				resultLb.setText("경찰에 신고하겠습니다.");
				
			}
			
		});
		
		pan3.add(resultLb);
		
		
		setLayout(new BorderLayout());
		
		
		add(pan, "North");
		add(pan2, "Center");
		add(pan3, "South");
		
		
		
		
		
		setBounds(300, 300, 500, 400);
		
		// 현재 컴포넌트 크기에 따라
		// 사이즈를 재조정하는 메소드
		pack();
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new RadioButtonTest();
		
	}

}
