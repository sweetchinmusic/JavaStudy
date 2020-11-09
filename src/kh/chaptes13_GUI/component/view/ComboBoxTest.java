package kh.chaptes13_GUI.component.view;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBoxTest extends JFrame {

	
	public ComboBoxTest() {
		super("콤보 박스");
		
		String[] animal = { "dog", "cat", "tiger", "user"};
		
		JComboBox animalList = new JComboBox(animal);
		
		
		// 기본값 설정하기
		animalList.setSelectedIndex(3);
		
		JLabel lb = new JLabel();
		
		animalList.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 어떤 메뉴를 골랐는지 확인해서 그 값 가져오기
				JComboBox box = (JComboBox)e.getSource();
				
				String name = (String) box.getSelectedItem();
				
				Image myImg = new ImageIcon("images/" + name + ".png")
									.getImage().getScaledInstance(150, 150, 0);
				lb.setIcon(new ImageIcon(myImg));
			}
		});
		
		
		
		
		setLayout(new BorderLayout());
		
		add(animalList, "North");
		add(lb, "Center");
		
		
		
		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		new ComboBoxTest();

	}

}
