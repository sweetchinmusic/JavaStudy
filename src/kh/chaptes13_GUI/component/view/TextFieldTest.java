package kh.chaptes13_GUI.component.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextFieldTest extends JFrame {

	public TextFieldTest() {
		// 숫자를 입력받아 제곱한 결과를
		// 돌려주는 제곱수 계산기
		
		
		super("우석's 제곱수 계산기 ver1.0");
		
		JPanel pan = new JPanel();
		
		JLabel lb = new JLabel("숫자 입력 : ");
		JTextField tf = new JTextField(15);
		
		JLabel lb2 = new JLabel("결과 확인 : ");
		JTextField result = new JTextField(15);
		
		result.setEditable(false); // 사용자가 수정 못하도록 막는다.
		
		JButton btn = new JButton("제곱 계산하기");
		// 대기하다가 말할떄 까지 대기하다가 실행한다.
		btn.addActionListener(new ActionListener() { 

			@Override
			public void actionPerformed(ActionEvent e) {
				// 결과 확인 버튼을 클릭했을 때,
				// 실행할 코드 구현하기
				
				// 1. 텍스트 필드의 숫자값을 가져와서
				//	    숫자라면 파싱처리하기
				String text = tf.getText(); // 작성되어 있는 문자열 가져옴
				int num = 0;
				
				
				try {
				num = Integer.parseInt(text);
				
				// 2. 파싱 처리한 숫자를 제곱수로 돌려주기
				result.setText(num * num +"");
			} catch(NumberFormatException ex) {
				result.setText("숫자가 아닙니다!");
				
			}
				
		}
			
		});
		
		pan.add(lb);
		pan.add(tf);
		pan.add(lb2);
		pan.add(result);
		pan.add(btn);
		
		add(pan);
		
		setBounds(300, 300, 300, 150);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	
	public static void main(String[] args) {
		new TextFieldTest();
		
	}

}
