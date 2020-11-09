package kh.chaptes16_NetWork.com.kh.udp.server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {

	public static void main(String[] args) {
		// 1. UDP Server 연결용 포트번호 생성하기
		int port = 7777;

		try {

			// 2. 서버 전용 소켓 생성하기
			DatagramSocket socket = new DatagramSocket(port);

			// 3. 연결할 사용자와 정보를 주고받기 위한
			// DatagramPacket 생성하기
			DatagramPacket inPacket, outPacket;

			byte[] inMsg = new byte[100];
			byte[] outMsg = "어서와, 처음이지?".getBytes();

			// 4. 전달받을 메시지를 담을 객체 생성하기
			inPacket = new DatagramPacket(inMsg, inMsg.length);

			// 5. 사용자가 실제로 전달한 메시지 담기
			socket.receive(inPacket);

			// 6. 받아 온 정보 꺼내기
			System.out.println("받은 메시지 : " + new String(inMsg));

			// 7. 전달할 사용자의 정보를 받아																																																		
			// 메시지를 보낼 객체 만들기
			InetAddress clientIp = inPacket.getAddress();
			int clientPort = inPacket.getPort();

			outPacket = new DatagramPacket(outMsg, outMsg.length, clientIp, clientPort);

			// 8. 메시지 보내기

			socket.send(outPacket);
			
			// 9. 소켓 닫기
			socket.close();
			

			
			
			
			
			
			
		} catch (IOException e) {

		}
	}

}
