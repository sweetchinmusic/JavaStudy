package kh.chaptes13_GUI.component.view;

import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JDialogTest extends JFrame {

	public JDialogTest() {
		super("다이얼로그");
		
		JPanel pan = new JPanel(); // 자주 씀
		
		JButton btn1 = new JButton("기본 다이얼로그");
		
		Dialog di = new Dialog(this, "기본 다이얼로그입니다."); // 어떤 거 때문에 알림창이떴는지 표시를해야함.
		di.setBounds(300, 300, 150, 150);
		di.add(new JLabel("기본 다이얼 로그 테스트!"));
		
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 버튼을 클릭하면 다이얼 로그 표시하기
				di.setVisible(true);
			}
			
		});
		JButton btn2 = new JButton("닫기 버튼");
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				di.dispose();
				
			}
		});
		
		// 값을 입력받는 JOptionPanel 사용하기
		JButton btn3 = new JButton("입력값 받기");
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 버튼 클릭 시 값을 입력받는 알림 창 띄우기
				// conform : 보기만 하는 것
			
//				String result 
//					= JOptionPane.showInputDialog("???"); // 패널이 아니라 제이옵션판임. 
				int result	
				= JOptionPane.showConfirmDialog(pan, "???");
				System.out.println("result : " + result);// 안에서 다 가지고 있음
				
			}
		});
		
		pan.add(btn1);
		pan.add(btn2);
		pan.add(btn3);
		
		
		add(pan);
		
		setBounds(300, 300 ,450, 450);
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new JDialogTest();

	}

}
