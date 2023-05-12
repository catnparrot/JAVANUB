package ch19.sec04;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class NewsClient {
	public static void main(String[] args) {
		try {
			//DatagramSocket 생성
			DatagramSocket dsk = new DatagramSocket();
			
			//구독하고 싶은 뉴스 주제 보내기
			String data = "정치";
			byte[] bytes = data.getBytes("UTF-8");
			DatagramPacket sendP = new DatagramPacket
					(bytes, bytes.length, new InetSocketAddress("localhost", 50001));
			dsk.send(sendP);
			
			while (true) {
				//뉴스받기
				DatagramPacket receiveP = new DatagramPacket
						(new byte[1024], 1024);
				dsk.receive(receiveP);
				
				//문자열로 변환
				String news = new String(receiveP.getData(), 0,
						receiveP.getLength(), "UTF-8");
				System.out.println(news);
				
				if(news.contains("뉴스10")) {
					break;
				}
			}
			
			//DatagramSocket 닫기
			dsk.close();
			} catch (Exception e) {
			}
	}
}
