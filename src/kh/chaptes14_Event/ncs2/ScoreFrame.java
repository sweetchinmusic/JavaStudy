package kh.chaptes14_Event.ncs2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ScoreFrame extends JFrame{
	
	private JPanel pan;
	private JButton btn;
	private int total, average;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
	private JTextField txt4;
	
	
	public ScoreFrame() {
		super("문제 7");
		
		setBounds(300, 300, 500, 500);
		
		
		JLabel lb1 = new JLabel("점수를 입력하세요");
		lb1.setBounds(200, 0, 500, 100);
		
		JLabel lb2 = new JLabel("자바 : ");
		lb2.setBounds(30, 100, 50, 50);
		txt1 = new JTextField(5);
		txt1.setBounds(70, 100, 100, 50);

		JLabel lb3 = new JLabel("SQL : ");
		lb3.setBounds(300, 100,  50, 50);
		txt2 = new JTextField(5);
		txt2.setBounds(350, 100, 100, 50);
		
		
		btn = new JButton("계산하기");
		btn.setBounds(200, 200, 100, 50);
		
		
		pan = new JPanel(null);
		
		pan.add(lb1);
		pan.add(lb2);
		pan.add(txt1);
		pan.add(lb3);
		pan.add(txt2);
		
		pan.add(btn);
		
		btn.addActionListener(new ActionHandler());
		
		JLabel lb4 = new JLabel("총점 : ");
		lb4.setBounds(30, 350,  50, 50);
		txt3 = new JTextField(5);
		txt3.setBounds(70, 350, 100, 50);
		
		JLabel lb5 = new JLabel("평균 : ");
		lb5.setBounds(300, 350,  50, 50);
		txt4 = new JTextField(5);
		txt4.setBounds(350, 350, 100, 50);
		
		pan.add(lb4);
		pan.add(txt3);
		pan.add(lb5);
		pan.add(txt4);
		
		
		add(pan);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
	}
	
	private class ActionHandler implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent event) {
			if(event.getSource() == btn) {
				int score1 = Integer.parseInt(txt1.getText());
				int score2 = Integer.parseInt(txt2.getText());
				
				txt3.setText(String.valueOf(score1 + score2));
				txt4.setText(String.valueOf((score1 + score2)/2));
				
			}
		}
		
	}
	
}
