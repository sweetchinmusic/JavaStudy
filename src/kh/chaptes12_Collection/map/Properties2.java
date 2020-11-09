package kh.chaptes12_Collection.map;


import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Properties2 {

	public static void main(String[] args) {
		// Properties로 저장한 파일 읽어오기
		
		Properties prop = new Properties();
		
//		prop.load(new FileInputStream("driver.dat"));
//		prop.load(new FileReader("driver.txt"));
		try {
			prop.loadFromXML(new FileInputStream("driver.xml"));
			System.out.println(prop.getProperty("driver"));
			System.out.println(prop.getProperty("url"));
			System.out.println(prop.getProperty("username"));
			System.out.println(prop.getProperty("password"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		
		
		}
		
	}

}
