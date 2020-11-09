package kh.chapter4_Statement.silsub;
import java.util.*;

public class SilsubTest {
Scanner sc = new Scanner(System.in);
	 public void test1(){
	
	System.out.println("1~10 사이의 정수 한 개를 입력하십시오 : ");
	int i = sc.nextInt();
	switch(i) {
	case 0:
		System.out.println("0이다");
		break;
	case 1: case 3: case 5: case 7: case 9:
		System.out.println("홀수다");
		break;
	case 2: case 4: case 6: case 8: case 10:
		System.out.println("짝수다");
		break;
	}	
	}

	 
/*
	public void test2(){
	int i = sc.nextInt();
	switch(i) {
	System.out.println("");
	} 
}
*
*/		

	public void test3() {
		System.out.println("---골라봐라---");
		System.out.println("1.사과 - 1000원");
		System.out.println("2.바나나 - 3000원");
		System.out.println("3.복숭아 - 2000원");
		System.out.println("4.키위 - 5000원");
		System.out.println("-----------");
		
		System.out.print("메뉴를 선택하세요 : ");
		String select = sc.nextLine();
		/*
		switch(select) {
		
		case "사과" :
			System.out.println("사과의 가격은 1000원입니다");
			break;
		case "바나나" :
			System.out.println("바나나의 가격은 3000원입니다");
			break;
		case "복숭아" :
			System.out.println("복숭아의 가격은 2000원입니다");
			break;
		case "키위" :
			System.out.println("키위의 가격은 5000원입니다");
			break;
		default :
			System.out.println("제대로 눌러라");
		// 저기 int select를 String fruit로 바꿀 수 있음 
	// if - else로 푸는 방법
	*/	if(select.equals("사과")) {
			System.out.println("사과는 10000원입니다");
		} else if(select == "바나나") {
			System.out.println("바나나는 3000원입니다");
		} else if(select == "복숭아") {
			System.out.println("복숭아는 2000원입니다");
		} else if(select == "키위") {
			System.out.println("키위 가격은 5000원입니다");
		} else {
			System.out.println("없다");
		}	
	}
}	
	
	

	
	
	
	
