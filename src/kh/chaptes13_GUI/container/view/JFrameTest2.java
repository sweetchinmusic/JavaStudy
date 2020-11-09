package kh.chaptes13_GUI.container.view;

import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class JFrameTest2 {
	// 프레임 생성하는 방법 2
	// 메소드를 통해 JFrame을 하나 생성한 후
	// 설정값을 직접 설정하는 방법
	
	public void showJFrame() {
		// 객체를 생성하며 타이틀 바로 설정하기
		JFrame jfr = new JFrame("현민's 해피 프레임 ☆");
		
		// 프레임의 크기와 위치를 Rectangle 클래스로 설정하기
		Rectangle r = new Rectangle(300, 300, 200, 150);
		jfr.setBounds(r);
		
		// 종료 관련 메소드 설정
		jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 리사이즈 못하게~!
		jfr.setResizable(false);
		
		try {
			jfr.setIconImage(ImageIO.read(new File("images/icon.png")));
		} catch (IOException e) {
			System.out.println("이미지 읽기 실패!");
		}
		
		// 현재 화면에 표시하기
		jfr.setVisible(true);
	}
}
