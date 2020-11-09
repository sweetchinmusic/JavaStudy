package kh.chaptes12_Collection.map;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Properties;

public class TestProperties1 {
	// Properties :
	//		어떠한 프로그램을 실행할 때
	//		함께 읽어오는 설정 정보들을 (화면 사이즈, 언어 설정)
	//		저장하는 파일을 말한다.
	//		Map 객체와 동일하게 Key와 Value로
	//		나뉘어 있으나 추가로 Key와 Value 모두
	//		문자열만 사용하는 객체이다.
	
	public static void main(String[] args) {
		
		Properties prop = new Properties();
		
		// 값을 저장할 때 setProperty()를 사용한다.
		prop.setProperty("driver", "oracle.jdbc.OracleDriver");
		prop.setProperty("url", "jdbc:oracle:thin:@localhost:1521:XE");
		prop.setProperty("username", "user01");
		prop.setProperty("password", "pass01");
		
		System.out.println(prop);
		
		try {
		
			prop.store(new FileOutputStream("driver.dat"), 
					"jdbc driver");
			
			prop.store(new FileWriter("driver.txt"), 
					"jdbc driver");
		
			prop.storeToXML(
					new FileOutputStream("driver.xml"), 
					"jdbc driver");
			
		} catch (Exception e) {
			
			System.out.println("파일 저장 중 문제 발생!");
		}
		
		
	}

}
