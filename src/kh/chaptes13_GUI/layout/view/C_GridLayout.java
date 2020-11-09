package kh.chaptes13_GUI.layout.view;

import java.awt.GridLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;

public class C_GridLayout extends JFrame {
	
	public C_GridLayout() {
		// GridLayout :
		// 		컴포넌트들을 가로, 세로 방향으로
		//		균등한 크기로 배치할 때 사용하는 방법
		//		보통 윗줄에서 아랫줄 순서로, 왼쪽 ~ 오른쪽 순서로
		//		정렬하여 배치한다.
		
		super("창현's 집에있기 좋은 그리드 레이아웃");
	
		setBounds(300, 300, 600, 600);
		
		// GridLayout은
		// 매개 변수를
		// 순서에 따라
		// 가로 줄, 세로 줄, 가로 공간 크기, 세로 공간 크기
		// 설정을 할 수 있다.
		
		setLayout(new GridLayout(5, 5, 10, 20));
		
//		for(int i = 1; i < 26 ; i++) {
//			add(new JButton(i + "번"));
//		}
		
		
		// 랜덤 빙고판 만들기
		// 1 ~ 25 까지의 수 중 중복이 없는 빙고판 만들기
		Set<Integer> binggo = new LinkedHashSet(); // 들어오는 순서대로
		
		while(binggo.size() < 25) {
			// 1. 1 ~ 25 사이 난수 생성하기
			int num = (int)(Math.random() * 25) + 1 ;
			
			// 2. 빙고 Set에 저장하기
			binggo.add(num);
		}
		// 1. toArray();
		
		// 2. Iterator
		Iterator<Integer> iter = binggo.iterator();
		
		while(iter.hasNext()) {
			this.add(new JButton(iter.next() + "번"));
		}
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
