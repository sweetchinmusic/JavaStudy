package kh.chaptes11_IO.kh.io.subStream.dataStream.model.dao;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataStream {
	// 입력한 데이터를 해당 자료형(Type)에
	// 맞게 저장하고 출력하는 보조 스트림
	// 각각의 자료형을 byte기준으로
	// 쪼개어 출력 시 해당 byte 기준으로
	// 맞추어 출력한다.
	// 입력 : DataInputStream
	// 출력 : DataOutputStream
	
	public void testDataStream() {
		// 데이터를 자료형 단위로 저장하고
		// 저장한 내용을 출력까지 한 번에 하는
		// 메소드 구현
		
		try(
			DataOutputStream dout = new DataOutputStream(
					new FileOutputStream("score.dat"));
			DataInputStream din = new DataInputStream(
							new FileInputStream("score.dat"));
			
				){
			
			// -- score.dat 파일로 데이터 쓰기(출력하기) -- //
			dout.writeUTF("홍길동");
			dout.writeInt(90);
			dout.writeChar('A');
			dout.writeUTF("청길동");
			dout.writeChar('B');
			dout.writeInt(80);
			dout.writeUTF("고길동");
			dout.writeChar('F');
			dout.writeInt(50);
			dout.writeUTF("고길동");
			
			// -- score.dat 로부터 데이터 읽어오기 -- //
			while(true) {
				
				String str = din.readUTF() + ", "
				           + din.readChar() + ", "
						   + din.readInt();
				
				System.out.println(str);
				
			}
			
		} catch(FileNotFoundException e) {
			
			System.out.println("파일이 없습니다.");
			
		} catch (EOFException e) {
			// End Of File : EOF
			// 파일을 읽는 도중
			// 그 끝에 도달했음에도 파일을
			// 읽으려고 하는 경우 발생하는 예외
			System.out.println("파일 내용을 모두 읽었습니다.");
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}






