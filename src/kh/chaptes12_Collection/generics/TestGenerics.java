package kh.chaptes12_Collection.generics;
import java.util.ArrayList;
import java.util.List;

public class TestGenerics {

	public static void main(String[] args) {
		// 제네릭스란, 여러 자료형을 받을 수 있는
		// 컬렉션에 저장할 자료형을 한 가지로
		// 제한하여 객체를 보다 쉽게 꺼내도록 하는
		// 문법
		
		// Book --> Object; (X)
		// Book --> Book    (O)
		
		// [사용방법]
		// 컬렉션클래스 변수명 <사용할 자료형명>
		
		// 책만 받는 list를 만들겠다! //* 자바 8부터는 빼고해도 된다!
		ArrayList<Book> list = new ArrayList<>();// 책만 들어간다
		// 제네릭스 일반화 시키다 통일시키다.
		
		list.add(new Book());
//		list.add(new Student()); //책밖에 안들어간다
		
		// list 자체에서 Book 객체만 받도록 한정
		// 지었기 때문에 꺼낼 때도 Book으로
		// 하나씩 직접 꺼낼 수 있다.
		for(Book bk : list) {
			System.out.println(bk);
		}
		
		ArrayList<Car> list2 = new ArrayList<>();
		
		list2.add(new Car("유자차"));
		list2.add(new Car("녹차"));
		list2.add(new Car("둥글레차"));
		list2.add(new Car("마테차"));
		
		System.out.println(list2);
	
		System.out.println("-----------------------");
		
		TestGenerics tg = new TestGenerics();
		
		// 필요한 객체들만 가진 컬렉션
		// 자료형(type)으로 매개변수를
		// 선언하면 원하는 자료형들만 받을 수 있다.
		// tg.printCar(list);
		tg.printCar(list2);
	
	}
	
	public void printCar(List<Car> list) {
		for(Car c : list) {
			System.out.println(c);
		}
	}
	
	// 
	
	
	

}
