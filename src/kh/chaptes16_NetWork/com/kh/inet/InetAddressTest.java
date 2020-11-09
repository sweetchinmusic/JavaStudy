package kh.chaptes16_NetWork.com.kh.inet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {

	public static void main(String[] args) {
		InetAddressTest inet = new InetAddressTest();
		
		inet.test();
		
	}

	public void test() {
		
		System.out.println("------ www.youtube.com ------");
		
		try {
			InetAddress ip = InetAddress.getByName("www.youtube.com");
			
			System.out.println("getHostName() : " + ip.getHostName());
			System.out.println("getHostAddress() : " + ip.getHostAddress());
			System.out.println("toString() : " + ip);// .toString()은 생략됨
			
			System.out.println("-------www.google.com--------");
			
			InetAddress ip2 = InetAddress.getByName("www.google.com");
			
			System.out.println("getHostName() : " + ip2.getHostName());
			System.out.println("getHostAddress() : " + ip2.getHostAddress());
			System.out.println("toString() : " + ip2);// .toString()은 생략됨
			
			InetAddress[] googleAddr
				= InetAddress.getAllByName("www.naver.com");
			
			for(InetAddress in : googleAddr) {
				System.out.println("네이버 ip : " + in);
			}
			System.out.println("------------------------");
			
			// 내가 가진 IP 주소 확인하기
			InetAddress local = InetAddress.getByName("localhost");
			System.out.println("getHostName() : " + local.getHostName()); // 내가 나 자신을 찾아오는 것. 루프 백
			System.out.println("getHostAddress() : " + local.getHostAddress()); 
			System.out.println("toString() : " + local);// .toString()은 생략됨
			
			
			
		} catch (UnknownHostException e) {
			System.out.println("세상에, 그런 사이트는 없어요.");
		}
		
		
		
		
	}
	
}
