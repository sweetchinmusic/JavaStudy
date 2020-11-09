package kh.chaptes13_GUI.container.view;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class JFrameTest1 extends JFrame {
	// 컨테이너 : 
	//	 화면에 표시하고자 하는 요소(컴포넌트)들을
	//	 담을 수 있는 객체를 말한다.
	//	 대표적으로는 JFrame 객체가 해당되며,
	//	 예외적으로 컴포넌트이면서 컨테이너 역할을
	//	 수행하는 Panel/JPanel 객체가 있다.
	
	//	 컨테이너 (Frame) 생성 방법 1
	//	 JFrame을 상속받아 사용하는 방법
	public JFrameTest1() {
		// 프레임의 크기 설정하기
		//this.setSize(400, 200); // 단위 픽셀
	
		// 프레임이 시작되는 위치
		//this.setLocation(300, 300);
		
		// 프레임 크기와 위치를 한번에 설정하기
		this.setBounds(200, 100, 500, 400); // 뒤에 두 개는 크기
		
		// 프레임을 종료하더라도, 실제 프로그램이 종료되지 않을 때
		// 닫기버튼(X) 클릭 시 프로그램 종료까지 함께 하도록 설정하기
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 이러면 같이 꺼짐.
		
		// 프레임 최상단에 제목 작성하기
		this.setTitle("한양조's 스윗 프레임");
		
		// 프레임에 기본 사이즈를 수정 못하게 막기
		this.setResizable(false);
		
		// 프레임에 아이콘 직접 변경하기
		try {
			this.setIconImage(ImageIO.read(new File("images/icon.png")));
		} catch (IOException e) {
			e.printStackTrace(); // 빨간 줄 뜨게 한다.?
		}
		
		
		
		
		
		
		
		
		// 설정한 프레임을 화면에 표시하겠다
		this.setVisible(true); // 프레임(GUI)을 껐다고해서 메인(Console)까지 꺼지지않는다.
	}
	
}
