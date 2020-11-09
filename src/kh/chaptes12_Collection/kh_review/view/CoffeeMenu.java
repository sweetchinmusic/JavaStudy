package kh.chaptes12_Collection.kh_review.view;

import java.util.Scanner;

import kh.chaptes12_Collection.kh_review.controller.CoffeeManager;
import kh.chaptes12_Collection.kh_review.model.excep.CoffeeException;
import kh.chaptes12_Collection.kh_review.model.vo.Coffee;

public class CoffeeMenu {
	// static을 쓰면 어디까지 공유가 가능
	
	private static CoffeeManager tom = new CoffeeManager();

	
	// 커피 주문 화면 만들기 //딱 하나 static
	public static void showMenu() {
		Scanner sc = new Scanner(System.in);
		
		// # 1. 변수 였을 때. . . 아련
		/*
		System.out.println("== 한양조's StarBigs ==");
		System.out.println("------------------------");
		System.out.println("1. 아메리카노");
		System.out.println("2. 카페모카");
		System.out.println("3. 에스프레소");
		System.out.print("메뉴 입력 : ");
		int select = sc.nextInt();
		
		System.out.println("주문할 잔의 수 : ");
		int cup = sc.nextInt();
		int price = 0;
		
		String coffeeName = null;
		
		switch(select) {
		case 1: coffeeName = "아메리카노";
				price = 3000;
				break;
		case 2: coffeeName = "카페모카";
				price = 3200;
				break;
		case 3: coffeeName = "에스프레소";
				price = 3300;
				break;
		default: coffeeName = "없음";
		}
		
		System.out.println("주문하신 커피는 "
						 + coffeeName + "입니다.");
		System.out.println("총 " + cup + "잔 입니다.");
		System.out.println("가격은 " + (cup * price) + "원 입니다.");
		*/
		// 변수를 직접 선언하면 사용자의 입력값을
		// 명시적으로 ( 확실히 ) 받을 수 있다.
		// 단점, 재사용하기 어렵다
		
		// # 2. 배열을 사용했을 때...
		/*
		int[] cup = new int[3];
		
		
		System.out.println("== 한양조's StarBigs ==");
		System.out.println("------------------------");
		System.out.println("1. 아메리카노");
		System.out.println("2. 카페모카");
		System.out.println("3. 에스프레소");
		System.out.print("메뉴 입력 : ");
		cup[0] = sc.nextInt();
		
		System.out.println("주문할 잔의 수 : ");
		cup[1] = sc.nextInt();
		cup[2] = 0;
		
		String coffeeName = null;
		
		switch(cup[0]) {
		case 1: coffeeName = "아메리카노";
				cup[2] = 3000;
				break;
		case 2: coffeeName = "카페모카";
				cup[2] = 3200;
				break;
		case 3: coffeeName = "에스프레소";
				cup[2] = 3300;
				break;
		default: coffeeName = "없음";
		}
		
		System.out.println("주문하신 커피는 "
						 + coffeeName + "입니다.");
		System.out.println("총 " + cup[1] + "잔 입니다.");
		System.out.println("가격은 " + (cup[1] * cup[2]) + "원 입니다.");
		*/
		// 변수 명을 재사용할 수 있게 되어따!
		
		// 단점, cup 배열에 어떤 값이 몇 번째에 들었는지 모른다.

		// # 3. Coffee 객체를 사용할 경우... +_+ 
		/*
		 initMenu(); // 그냥 해도 된다고?
		System.out.println("메뉴 선택 : ");
		 int select = sc.nextInt(); // 1---> 아메리카노
		 System.out.println("주문할 잔 수 : ");
		 int cup = sc.nextInt();
		 
		 Coffee co = new Coffee(select, cup);
		 
		 System.out.println("주문하신 커피 정보입니다.");
		 System.out.println(co);
		*/
		 // 커피 관련 소스 코드가 모두 Coffee 클래스에
		 // 들어가 코드가 간결해졌다.
		 // 여전히 한 잔 밖에 팔지 못한다.
		 
		 // # 4. 객체 배열 사용하기
		 do {
			 initMenu(); 
			 System.out.println("메뉴 확인 : ");
			 int sel = sc.nextInt();
			 
			 switch(sel) {
			 // 서브 메뉴 들어갈 부분 //
			 case 1:
				 insertCoffee();
				 break;
			 case 2:
				 printOneCoffee();
				 break;
			 case 3:
				 updateCoffee();
				 break;
			 case 4:
				 deleteCoffee();
				 break;
			 case 5:
				 printAllCoffee();
				 break;
			 case 0:
				 System.out.println("정말...? ㅠㅠ (y/n) : ");
				 if(sc.next().toLowerCase().charAt(0) == 'y') {
					tom.close();
					
					 return;
				 } else {
					 System.out.println("메뉴 다시 출력");
				 }
			 }
			 
		 } while(true);
	}
	
	// 주문 메뉴 단순 출력용 메소드
	public static void initMenu() {
		/*
		System.out.println("== 한양조's StarBigs ==");
		System.out.println("------------------------");
		System.out.println("1. 아메리카노");
		System.out.println("2. 카페모카");
		System.out.println("3. 에스프레소");
		*/
		
		// # 4-1. 객체 배열 활용 메뉴
		System.out.println("1. 커피 주문");
		System.out.println("2. 주문번호 확인");
		System.out.println("3. 주문 내용 수정");
		System.out.println("4. 주문 취소");
		System.out.println("5. 모든 주문 확인");
		System.out.println("0. 프로그램 종료");
		
	}
	
	// 커피 주문 메뉴
	public static void insertCoffee() {
		Scanner sc = new Scanner(System.in);
		//??
		System.out.println("-----메뉴 ------");
		System.out.println("1. 아메리카노");
		System.out.println("2. 카페모카");
		System.out.println("3. 에스프레소");
		
		System.out.println("메뉴 확인 : ");
		int sel = sc.nextInt();
		System.out.println("몇 잔입니까? : ");
		int cup = sc.nextInt();
		
		System.out.println("주문 정보 확인 : ");
		
		System.out.println(tom.insertCoffee(new Coffee(sel, cup)));
		
	}
	
	
	public static void printOneCoffee() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주문 번호 입력 : ");
		int idx = sc.nextInt();
		try {
			tom.printOneCoffee(idx);
	
		} catch (CoffeeException e) {
			
			System.out.println(e.getMessage());
			
		}
	
	}
	
	public static void updateCoffee() {
		Scanner sc = new Scanner(System.in);
		System.out.print("변경할 주문 번호 : ");
		int idx = sc.nextInt();
		
		System.out.println("--- 주문 내역 변경 ---");
		System.out.println("1. 아메리카노");
		System.out.println("2. 카페모카");
		System.out.println("3. 에스프레소");
		System.out.print(" 메뉴 선택 : ");
		int sel = sc.nextInt();
		
		System.out.print("주문 잔 수 : ");
		int cup = sc.nextInt();
		
		tom.updateCoffee(idx, new Coffee(sel, cup));
		
	}
	
	public static void deleteCoffee() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주문 번호 확인 : ");
		int idx = sc.nextInt();
		
		tom.deleteCoffee(idx);
		
	}
	
	public static void printAllCoffee() {
		
		tom.printAllCoffee();
		
	}
	
}