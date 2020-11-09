package kh.chaptes16_NetWork.com.kh.tcp.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class TCPClient {

	public static void main(String[] args) {
		// 1. 서버가 설정한 port번호에 맞게
		// 		포트 번호 선언하기
		int port = 8888;
		
		// 2. 서버 주소 선언하기
		String serverIp= "192.168.20.92";
		
		try {
			
			// 3. 클라이언트에서 연결할 서버 소켓객체 만들기
			Socket socket = new Socket(serverIp, port);
			
			// 만약에 연결을 실패했다면 null을 돌려준다.
			// 따라서 연결 확인을 위해 if 조건문으로 연결 확인
			// 구문을 작성한다.
			if(socket != null) {
				// 4. 서버와 통신할 IO 객체 만들기
				BufferedReader br = new BufferedReader(
							new InputStreamReader(socket.getInputStream()));
				
				PrintWriter pw
							= new PrintWriter(socket.getOutputStream());
				
				// 5. 서버로 메시지를 전송하고,
				//	    서버로부터 받은 메시지 콘솔창에 출력하기
				
				pw.println("묵은지, 저는 강민정입니다.");
				
				pw.flush(); // 보내버린다??
				
				System.out.println("서버로부터 받은 메시지 : ");
				System.out.println(br.readLine());
				
				// 6. IO 객체 닫기
				br.close();
				pw.close();
				
				
				}	
				
			socket.close();
				
		
			
		} catch(IOException e) {
			
		}
	}

}
