package kh.chaptes12_Collection.emp.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.emp.model.vo.Employee;
// New 버전
public class EmployeeManager {
	// 화면(view)와 각 객체를 연결하는 클래스
	
	// 사원 배열을 최대로 담을 수 있는 크기 설정
	public static final int SIZE = 10;//내가 정한거 남이 바꿀 수 없게 final, 공유를 위해 static
	
	// 사원 목록 관리를 위한 배열 선언하기
//	private Employee[] empArr = new Employee[SIZE];
	private ArrayList<Employee> empList = new ArrayList<>();
	//private int[] intArr;
	

	// 현재 사원 수를 세는 변수 선언
//	private static int count;
	
	Scanner sc= new Scanner(System.in);
	//사원을 구현할 때 현재 몇 명이 들어있어야 수정을 할 수 있으니깐
	{
		// 초기화 블럭
//		empArr = new Employee[SIZE]; //배열은 한 번 지정하면 못 바꿈
		//위에만 바꾸면 밑에는 졸졸 따라옴, 한 번 바꿀래 두 번 바꿀래?
		//초기화 블럭
//		empArr[0] = new Employee("개똥벌레", 1, 3, "010-123-4567", 300);
//		empArr[1] = new Employee("소똥벌레", 2, 5, "017-223-4445", 150);
//		empArr[2] = new Employee("새똥벌레", 3, 10, "016-001-0012", 450);
//		empArr[3] = new Employee("찐똥벌레", 4, 2, "010-1234-5678", 500);
		
		empList.add(new Employee("개똥벌레", 1, 3, "010-123-4567", 300));
		empList.add(new Employee("소똥벌레", 2, 5, "017-223-4445", 150));
		empList.add(new Employee("새똥벌레", 3, 10, "016-001-0012", 450));	
		empList.add(new Employee("찐똥벌레", 4, 2, "010-1234-5678", 500));
		// 초기화한 사원 수에 따른 count 증가 
//		count = 4; // 카운트가 필요가 없다  
		
	}
	// 다 주석처리하면 전체 입사자 수가 줄어든다.
	// 매니저 고용
	
	// 2. 생성자 class 이름과 똑같다
	public EmployeeManager() {}
	
	// Getter & Setter
	public int getCount() {
		return empList.size();//정보은닉//**
	}
	/*
	public void setCount(int count) {
		EmployeeManager.count = count; //우리것이 아니고 매니저의 것
	}
	*/
	public void printAllEmployee() {
		//모든 사원 정보 출력 메소드
		for(int i = 0; i < empList.size() ; i++) {
			System.out.println("[" + i + "] : "
		+ empList.get(i).empInfo()); //사원객체로 정의해준다.
		}// 하향형변환 할 필요 없다. <>.
	}
	
		
	
	
	// 사원 추가 메소드
	public void empInsert() {
		if(empList.size() == SIZE) {
			System.out.println("정원 초과입니다!");
		} else {
			
			Employee emp = new Employee();
			//empArr[count] = new Employee();
			
			System.out.print("이름 : ");
//			empArr[count].setName(sc.next());
			emp.setName(sc.next());
			
			System.out.print("사번 : ");
//			empArr[count].setEmpNo(sc.nextInt());
			emp.setEmpNo(sc.nextInt());
			
			System.out.print("나이 : ");
//			empArr[count].setAge(sc.nextInt());
			emp.setAge(sc.nextInt());
			
			System.out.print("연락처 : ");
//			empArr[count].setPhone(sc.next());
			emp.setPhone(sc.next());
			
			System.out.print("급여 : ");
//			empArr[count].setSalary(sc.nextInt());
			emp.setSalary(sc.nextInt());
			
//			count++;//추가된 사원 정보만큼 현재 입사자 수 증가
			empList.add(emp); // 그럼 알아서 사이즈가 증가함.
			
		
		}
	}
	// 사원 번호를 입력받아
	// 해당 사원이 존재하는지 검색하는 메소드
	public int searchEmployee() {
		int idx = -1;
	
		System.out.print("찾을 사번 입력 : ");
		int searchNo = sc.nextInt();
		
		for(int i = 0; i < empList.size() ; i++) {
			if(empList.get(i).getEmpNo() == searchNo) {
				idx = i;
				break;
			}
			
		}
		
		return idx;
	}
	
	// 사원 정보 수정 메소드
	// 이름, 나이, 연락처
	public void updateEmpName() {
		
		int idx = searchEmployee();
		
		//-1; // 무조건 없는 사번 초기화 위에 메소드 대신 쓰는 것.
//		
//		System.out.print("찾을 사원의 번호 입력 : ");
//		int searchNo =sc.nextInt();
//		
//		for(int i =0; i < count; i++) {
//			if(empArr[i].getEmpNo() == searchNo) {
//				idx = i; // 해당하는 사원의 순번을 가져와야지 0~9번 사원을 찾아감 - 배열 기준으로
//				break;
//			}
//			
//		}
		
		if(idx < 0) {
			System.out.println("없는 사원입니다 +-+!");
		} else {
			System.out.println("현재 사원 이름 : " + (empList.get(idx)).getName());
			System.out.println("바꿀 사원 명 : ");
			((Employee)empList.get(idx)).setName(sc.next());
		}
	}
	public void updateEmpAge() {
		
		// 동일한 소스코드를 작성해야 할 경우
		// 별도의 메소드로 분리하면 중복을 줄일 수 있다.
		// 중복을 줄이면 손이 덜 아프고,
		// 손이 덜 아프면 ㅗ~ㅏㅣㅁㅇㅁㅎㄶ
		
		int idx = searchEmployee();//-1; // 찾을 사원의 번호 초기값 // 줄여서 searchEmployee. Ctrl + 클릭
//		
//		System.out.print("찾을 사원의 번호 : ");
//		int searchNo = sc.nextInt();
//		
//		for(int i = 0; i < count; i++ ) {
//			if(empArr[i].getEmpNo() == searchNo) {
//				idx = i;
//				break;
//			}
//		}
		if(idx < 0) {
			System.out.println("없는 사원입니다! +_+");
		} else {
			System.out.println("현재 사원의 나이 : " + (empList.get(idx)).getAge());
			System.out.print("변경할 나이 : ");
			((Employee)empList.get(idx)).setAge(sc.nextInt());
		}
	}
	public void updateEmpPhone() {
		int idx = searchEmployee();
		if(idx < 0) {
			System.out.println("없는 사원입니다!");
		} else {
			System.out.println("현재 사원의 연락처 : " + (empList.get(idx)).getPhone());
			System.out.print("변경할 연락처 : ");
			((Employee)empList.get(idx)).setPhone(sc.next());
		}
	}
	
	// 사원 한 명 정보 조회
	public void printOneEmployee() {
		int idx = searchEmployee();
		
		if(idx < 0) {
			System.out.println("없는 사원입니다!");
		} else {
			System.out.println("조회 결과 : " + (empList.get(idx)).empInfo());
		}
	}
	
	// 사원 정보 삭제 메소드
	
	public void deleteEmployee() {
		int idx = searchEmployee();
		
		if(idx < 0) {
			System.out.println("없는 사원입니다");
		} else {
			System.out.println("정말로 삭제하실겁니까? (y/n) : ");
			char answer = sc.next().toLowerCase().charAt(0); // 대 소문자 구분
			
			if( answer == 'y') {
				/*
				for(int i = idx; i < count ; i++) {
					// 만약 삭제할 사원이 마지막 사원이라면...
					if(i == count - 1) {
						empArr[i] = null;
					} else {
						// 삭제할 사원이 마지막이 아니라면
						empArr[i] = empArr[i+1];
					}
				}
				
				count --;
				*/
	
			empList.remove(idx);
			} else {
				System.out.println("메뉴 화면으로 돌아갑니다.");
			}
		}
	}
	
	public void sortAscName() {
		// 이름 기준 오름차순
		
		empList.sort(new AscNameSort());
		
		/*
		for(int i = 0; i< count -1; i++) {
			for(int j = i + i ; j< count; j++) {
				// 두 이름 중 누가 크고 작은지
				// 앞글자부터 유니코드 기준으로
				// 한글자 씩 비교한다.
				
				if(empArr[i].getName().compareTo(empArr[j].getName()) > 0) { // 서로 오름차순으로 누가 더 큰지를 비교를 함.
					// 크다만 작다로 바꾸면 내림차순이 됩니다.
					Employee temp = empArr[i];
					empArr[i] = empArr[j];
					empArr[j] = temp;
					
				}
			}
		}
		*/
		
		printAllEmployee(); // 이거 용도 : 바로바로 확인할 수 있음
	}
	
	public void sortDescName() {
		// 이름 기준 내림차순
		empList.sort(new DescNameSort());

		/*
		for(int i = 0; i< count -1; i++) {
			for(int j = i + i ; j< count; j++) {
				// 두 이름 중 누가 크고 작은지
				// 앞글자부터 유니코드 기준으로
				// 한글자 씩 비교한다.
				
				if(empArr[i].getName().compareTo(empArr[j].getName()) < 0) { // 서로 오름차순으로 누가 더 큰지를 비교를 함.
					// 크다만 작다로 바꾸면 내림차순이 됩니다.
					Employee temp = empArr[i];
					empArr[i] = empArr[j];
					empArr[j] = temp;
					
				}
			}
		}*/
	}
	
	
	
	
	
	
}
