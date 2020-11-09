package kh.chaptes13_GUI.component.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAreaTest extends JFrame {

	public TextAreaTest() {
		super("은성's 나홀로 채팅방");

		// 컨테이너에 담을 JPanel 생성하기
		JPanel pan = new JPanel();

		pan.setLayout(new BorderLayout());

		JTextArea area = new JTextArea(10, 30);

		JTextField text = new JTextField(30);

		text.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 텍스트 필드에 어떠한 이벤트가 발생했을 때
				// 텍스트 에리어에 값을 전달하는 기능

				String str = text.getText();
				area.append(str + "\n");

				text.setText("");

			}

		});

		pan.add(text, "South");

		pan.add(area, "Center");

		add(pan);

		setBounds(300, 300, 500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new TextAreaTest();

	}

}
