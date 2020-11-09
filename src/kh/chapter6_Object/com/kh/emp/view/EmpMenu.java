package kh.chapter6_Object.com.kh.emp.view;

import java.util.Scanner;

import kh.chapter6_Object.com.kh.emp.model.vo.Employee;

public class EmpMenu {
	private Employee emp;// 만약 여러명으로 하고 싶으면 객체 배열을 하면 됩니다.
	
	
	public static void empMenu() {
		Scanner sc = new Scanner(System.in);
		EmpMenu em = new EmpMenu();
		
		do {
			System.out.println("-- OOO's 사원관리 프로그램 --");
			System.out.println("1. 사원 정보 입력");
			System.out.println("2. 사원 정보 수정");
			System.out.println("3. 사원 정보 삭제");
			System.out.println("4. 사원 정보 조회");
			System.out.println("9. 프로그램 종료");
			System.out.println("--------------");
			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();
			
			switch(sel) {
				case 1:
					em.empInsert();
					break;
				case 2:
					em.empUpdate();
					break;
				case 3:
					em.empDelete();
					break;
				case 4:
					em.empPrint();
					break;
				case 9:
					System.out.println("프로그램을 종료합니다!");
					return;
				default :
					System.out.println("잘못 입력하셨습니다.");
			}
		} while(true);
		
	}
	public void empInsert() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사원 명 : ");
		String name = sc.next();
		
		System.out.print("사번 : ");
		int empNo = sc.nextInt();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("연락처 : ");
		String phone = sc.next();
		
		System.out.println("급여 : ");
		int salary = sc.nextInt();
		
		emp = new Employee(name, empNo, age, phone, salary);
	}
	
	public void empUpdate() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연락처 변경 : ");
		emp.setPhone(sc.next());
		
		System.out.print("급여 변경 : ");
		emp.setSalary(sc.nextInt());
		
		System.out.println("사원 정보 변경 완료!");
	}
		
	public void empDelete() {
		emp = null;
		
		System.out.println("사원 정보가 삭제되었습니다!");
	}
	
	public void empPrint() {
		
		System.out.println(emp.empInfo()); // 내가 쓸려고 했던 이부분이 지금 값이 없다.
		
	}
	
	
}
