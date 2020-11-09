package kh.chaptes11_IO.kh.io.subStream.obj.model.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import kh.chaptes11_IO.kh.io.subStream.obj.model.vo.Member;

public class TestObjectStream {
	// 객체를 저장하는 입출력 스트림
	// 입력 : ObjectInputStream
	// 출력 : ObjectOutputStream
	
	public void fileSave() {
		Member[] mArr = {
				new Member("홍길동", 10, "서울", "010-1111-2222"),
				new Member("피카츄", 45, "도톤보리", "010-1234-5678"),
				new Member("김두한", 4, "충무로", "010-4444-4444")
		};
		
		try(ObjectOutputStream oos = new ObjectOutputStream(
				               new FileOutputStream("member.dat"))
				){
			
			for(int i = 0; i < mArr.length ; i++) {
				
				oos.writeObject(mArr[i]);
			}
			
			oos.flush();
			
			System.out.println("객체 저장 완료!");
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		
	}
	
	public void fileOpen() {
		Member[] mArr = new Member[3];
		
		try(ObjectInputStream oin = new ObjectInputStream(
								new FileInputStream("member.dat"))) {
			
			for(int i = 0; i < mArr.length ; i ++) {
				mArr[i] = (Member) oin.readObject();
			}
			
			for(Member m : mArr) {
				System.out.println(m);
			}
			
		} catch (ClassNotFoundException e) {
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}








