package kh.chaptes13_GUI.component.view;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextTest extends JFrame {	


public TextTest() {
	
		super("TextTest");
	
		setLayout(new GridLayout(3, 2));

		JLabel lb1 = new JLabel("이름 : ");
		JTextField tf1 = new JTextField();
		
		JLabel lb2 = new JLabel("비밀번호");
		JPasswordField pf = new JPasswordField();
		
		JLabel lb3 = new JLabel("비고란");
		JTextArea ta = new JTextArea();
		
		add(lb1);
		add(tf1);
		add(lb2);
		add(pf);
		add(lb3);
		add(ta);
		
		setBounds(300, 300, 600, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
}

	
	public static void main(String[] args) {
		new TextTest();
	
	}
	
	
}
