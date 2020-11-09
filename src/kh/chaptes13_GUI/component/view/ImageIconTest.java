package kh.chaptes13_GUI.component.view;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImageIconTest extends JFrame {
	
	public ImageIconTest() {
		super("이미지 표시 및 변경하기");
		
		JPanel pan = new JPanel(); //생성자 메소드
	
		// 이미지를 컨테이너에 표시할 때는
		// 먼저 화면에 보여질 이미지 크기를 설정해야 한다.
		Image myImg = new ImageIcon("images/dog.png")// 생성자
				.getImage().getScaledInstance(150, 150, 0);
	
		JLabel lb = new JLabel(new ImageIcon(myImg));
		
		pan.add(lb);
		
		JButton btn = new JButton("이미지 변경하기");
		
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 버튼이 클릭되면 이미지 바꾸기
				Image myImg = new ImageIcon("images/cat.png")
						.getImage().getScaledInstance(150, 150, 0);
				lb.setIcon(new ImageIcon(myImg));
			}
			
		}); 
		
		setLayout(new BorderLayout());
		add(pan, "Center");
		add(btn, "South");
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new ImageIconTest();
	}

}
