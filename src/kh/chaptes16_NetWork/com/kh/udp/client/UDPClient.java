package kh.chaptes16_NetWork.com.kh.udp.client;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {

	public static void main(String[] args) {
		// 1. 사용할 서버의 포트번호
		int port = 7777;
		
		try {
			
			// 2. 연결할 Datagram 객체 생성하기
			DatagramSocket socket = new DatagramSocket();
			InetAddress serverIp = InetAddress.getByName("192.168.20.92");
			
			// 3. 주고 받을 배열 선언하기
			byte[] inMsg = new byte[100]; // 받아올 메시지
			byte[] outMsg = "사용자 : 안녕하셍뇨리따".getBytes(); // 보낼 메시지
			
			// 4. 주고받을 데이터패킷 생성하기
			DatagramPacket inPacket
				= new DatagramPacket(inMsg, inMsg.length);
			DatagramPacket outPacket
				= new DatagramPacket(outMsg, outMsg.length, serverIp, port);
			
			socket.send(outPacket);
			socket.receive(inPacket);
			
			System.out.println("서버 : " + new String(inMsg));
			
			
			
		} catch (IOException e) {
			
		}
		
		
	}

}
