package kh.chaptes12_Collection.kh_review.controller;

import java.util.ArrayList;

import kh.chaptes12_Collection.kh_review.model.dao.CoffeeDAO;
import kh.chaptes12_Collection.kh_review.model.excep.CoffeeException;
import kh.chaptes12_Collection.kh_review.model.vo.Coffee;

// #4-2. 커피 여러 개를 관리하는 클래스
public class CoffeeManager {
//	private Coffee[] orderArr; // 커피 배열
//	private int count; 	  	   // 주문 수량
	// 객체 배열의 단점 3가지
	// 1. 배열의 크기를 변경할 수 없다. 
	// 2. 값이 실제로 몇 개가 들어있는지 확인하기 어렵다.
	// 3. 중간에 값이 수정되거나 삭제될 경우
	//	    배열의 구조를 관리하기 어렵다.
	
	// 객체 배열의 단점을 보완하여
	// 보다 편리하게 사용하는 클래스가
	// 컬렉션!
	// list : 중복 허용 , 저장 순서가 유지된다.
	//   - Vector, ArrayList, LinkedList
	// set : 중복 허용 X, 저장 순서 유지 X
    // - Treeset, HashSet, LinkedHashSet
	// map : Key와 Value로 나누어 데이터를 관리하는 객체
	//		 이 때 key는 Set으로 , Value는 list 형태로 사용한다.
	//	- HashMap, HashTable 등
	private ArrayList<Coffee> orderList;
	private CoffeeDAO coDao;   // 커피 목록 저장 객체
	
	// 생성자
	public CoffeeManager() {
		// orderArr = new ArrayList<>{};
		orderList = new ArrayList<Coffee>();
	
		coDao = new CoffeeDAO();
		
		orderList = coDao.openList();
	}
	
	// 기능 제공 메소드
	// 커피 정보 추가 메소드
	public Coffee insertCoffee(Coffee co) {
//		orderList[count++] = co;
		orderList.add(co);
		return co;
	}
	
	// 커피 정보 수정 메소드
	public void updateCoffee(int idx, Coffee co) {
//		orderList[idx] = co; 
		orderList.set(idx, co);
	}
	// 주문 취소 메소드
	public void deleteCoffee(int idx) {
		/*
		for(int i = idx ; i < count ; i++) {
			
			if(orderList[i + 1] != null) { // i + 1 은 오버플로우?
				orderList[i] = orderList[i+1];
				orderList[i+1] = null;
			}
		}
		
		count--;
		*/
		orderList.remove(idx);
	}
	// 커피 주문 조회 메소드
	
	public void printOneCoffee(int idx) throws CoffeeException {
		if(idx > -1) {
			System.out.println(orderList.get(idx));
		} else {
			throw new CoffeeException("올바른 주문 번호가 아닙니다.");
			
		}
	}
	
	// 커피 전체 조회 메소드
	public void printAllCoffee() {
		for(Coffee co : orderList) {
			System.out.println(co);
		}
	}
	
	// 프로그램 종료 직전에
	// 주문 목록을 파일로 저장하는 메소드
	
	public void close() {
		coDao.saveList(orderList);
	}
	
	
}
