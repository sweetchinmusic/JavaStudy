package kh.chaptes16_NetWork.com.kh.tcp.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) {
		// 1. 서버의 port 번호 지정하기
		// 0 ~ 65535
		// 0 ~ 1023 : 웰노운(well-known)
		//  주로 컴퓨터 시스템이 사용하는 포트 번호
		// 1024~ 65535 : 다이나믹 포트(Dynamic port)
		int port = 8888;
		
		try {
		// 2. 서버 연결용 객체(소켓) 생성하기
			ServerSocket server = new ServerSocket(port); // 만든 곳으로 들어감.
			
			System.out.println("서버가 열렸습니다.");
			System.out.println("사용자를 기다리고 있습니다.");
			
			// 3. 사용자의 요청을 기다린 후
			// 사용자가 연결을 요청했을 때 해당
			// 사용자의 대한 소켓 객체를 생성한다.
			Socket client = server.accept();
			
			System.out.println(client.getInetAddress().getHostName()
					+ "의 연결 요청이 들어왔습니다.");
			
			// 4. 연결된 클라이언트와 입출력 객체 스트림을 생성한다.
			InputStream in = client.getInputStream();
			OutputStream out = client.getOutputStream();
			
			// 5. 버퍼 보조스트림을 사용하여 데이터 읽고 쓰기
			BufferedReader br = new BufferedReader(
					new InputStreamReader(in));
			
			PrintWriter pw = new PrintWriter(out);
			
			String msg = br.readLine();
			
			System.out.println("사용자가 보낸 메시지 : " + msg);
			
			pw.write("득근하세요");
			
			pw.flush();
			// 6. 사용한 IO 객체 및 소켓 닫기
			br.close();
			pw.close();
			
			in.close();
			out.close();
			
			server.close();
			
		} catch (IOException e) {
			
		}

	}

}
