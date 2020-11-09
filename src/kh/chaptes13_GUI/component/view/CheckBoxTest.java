package kh.chaptes13_GUI.component.view;

import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CheckBoxTest extends JFrame {
//상속 받는 기본 생성자는 this를 생략 가능하다??!
	
	public CheckBoxTest() {
		super("과일 선택하기");
		
		String[] fruits = {
				"망고",
				"라즈베리",
				"두리안",
				"수박",
				"메론",
			};
		
		JCheckBox[] boxes = new JCheckBox[5];
		
		// 체크 박스 반복문
		for(int i = 0 ; i < boxes.length ; i++) {
			boxes[i] = new JCheckBox(fruits[i]);
		}
		
		JPanel pan = new JPanel();
		
		for(int i = 0; i< boxes.length ; i++) {
			pan.add(boxes[i]);
			
		}
	
		JLabel lb = new JLabel("선택한 과일이 없습니다.");
		
		for(int i = 0; i< boxes.length; i++) {
			boxes[i].addItemListener(new ItemListener() {

				@Override
				public void itemStateChanged(ItemEvent e) {
					// 선택한 요소의 값이 바뀌었을 때
					// 동작하는 이벤트
					
					// V로 체크하면 true, 해제하면 false
					
					String str = "";
					int cnt = 0; // 체크한 과일의 개수
					
					for(int j = 0; j < boxes.length; j++) { // for문 시작~
						
						if(boxes[j].isSelected()) {
							str += boxes[j].getText() + " ";
							cnt ++;
						}
						
						lb.setText(str);
						
					}
					
					if(cnt == 0) {
						lb.setText("선택한 과일이 없습니다!!");
					
					}
				}
			});
		}
		setLayout(new BorderLayout());
		
		add(pan, "Center");
		add(lb, "South");
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	public static void main(String[] args) {
		new CheckBoxTest();
	}

}
