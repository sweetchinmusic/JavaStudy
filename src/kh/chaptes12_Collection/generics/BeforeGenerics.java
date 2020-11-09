package kh.chaptes12_Collection.generics;
import java.util.ArrayList;

public class BeforeGenerics {

	public static void main(String[] args) {
		// 컬렉션 객체들은 여러 개의 내용을 담을 수 있다.
		// list, set, map
		ArrayList list = new ArrayList();

		list.add(new String("힘내요, 아자아자!"));
		list.add(new Book());
		list.add(new Student());
		list.add(new Car());

		// 각 형태 별로 객체를 따로 꺼내고자 할 경우...?

		// 난 책만 꺼내고 싶어요~!
		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			if (obj instanceof Book) {
				System.out.println("책 객체 : " + obj);
			}
		}
		// 책, 학생, 자동차, 문자열을 각각 꺼내고 싶을 경우
		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			if (obj instanceof Book) {
				// 책에 대한 내용
			} else if (obj instanceof Student) {
				// 학생에 대한 내용
			} else if (obj instanceof Car) {
				// 자동차에 대한 내용
			} else if (obj instanceof String) {
				// 문자열일 때
			} else {
				// 다른 객체일 때...
			} 
		}

	}

}

class Book {
	private String bNo;

	public Book() {
	}

	public Book(String bNo) {
		this.bNo = bNo;
	}

	@Override
	public String toString() {
		return "나는 책입니다.";
	}
}

class Student {
	private String stuNo;

	public Student() {
	}

	public Student(String stuNo) {
		this.stuNo = stuNo;
	}

	@Override
	public String toString() {
		return "나는 학생입니다.";
	}
}

class Car {
	private String model;

	public Car() {
	}

	public Car(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "나는 자동차입니다.";
	}
}
