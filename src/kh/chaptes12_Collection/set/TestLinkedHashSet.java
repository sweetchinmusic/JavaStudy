package kh.chaptes12_Collection.set;

import java.util.HashSet;
import java.util.Set;

public class TestLinkedHashSet {

	public static void main(String[] args) {
		// 각각의 요소를 링크로 (요소의 주소로 ) 연결하여
		// 저장 순서를 유지하는 set 클래스
		
		Set lset = new HashSet();
		//Hash는 순서대로 안 해줌.
		lset.add("에그타르트");
		lset.add("딸기마카롱");
		lset.add("닭가슴살");
		lset.add("식혜");
		lset.add("담배");
		// linked는 순서대로
		System.out.println("lset : " + lset);
		
		
		

	}

}
