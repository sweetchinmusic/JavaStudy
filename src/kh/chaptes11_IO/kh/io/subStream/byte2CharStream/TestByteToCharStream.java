package kh.chaptes11_IO.kh.io.subStream.byte2CharStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestByteToCharStream {
	// 바이트스트림을 문자 스트림으로 바꾸는
	// 보조 스트림
	// 입력 : InputStreamReader
	// 출력 : OutputStreamWriter
	
	public void fileSave() {
		
		try(OutputStreamWriter ow =
				new OutputStreamWriter(
						new FileOutputStream("sample3.dat"));
				){
			
			ow.write("괜찮아요");
			ow.write(35775);
			ow.write("Apple");
			
			System.out.println("파일 저장 완료!");
			
		} catch(IOException e) {
			
		}
		
	}
	
	public void fileOpen() {
		
		try(InputStreamReader ir = new InputStreamReader(
								new FileInputStream("sample3.dat"))){
			
			int value;
			
			while((value = ir.read()) != -1) {
				System.out.println((char)value);
			}
			
		} catch(IOException e) {
			System.out.println("파일 읽기 중 에러 발생!");
		}
		
	}
}
