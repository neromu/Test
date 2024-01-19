package java14_net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Net01_InetAddress {
	public static void main(String[] args) {
		
//		InetAddress 클래스
//		IP주소 정보 관리 클래스
		
//		생성자 없음
//		직접 객체를 new해서 생성할 수 없다
		
//		주로 도메인주소(호스트네임)을 이용하여 IP주소를 객체로 얻어와서
//		사용한다
		
//		**호스트네임, hostname : 네트워크에서 노드를 구분하기 위해 정한 이름
//		**도메인주소, domain address : 인터넷 상의 호스트네임		
		
//		----------------------------------------------------------------
		
//		IP주소 표현 객체
		InetAddress ip = null;
		
		
		try {
//			도메인주소(호스트네임)로부터 IP주소 객체 얻어오기
			ip = InetAddress.getByName("www.kh-academy.co.kr");
			
			System.out.println(ip );
			
			
//			호스트 네임 (도메인 주소)
			System.out.println(ip.getHostName());
			
//			호스트 주소 (IP 주소)
			System.out.println(ip.getHostAddress());
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		System.out.println("----------------------");
		
//		로컬 호스트
//		 가상 루프백(loopback) 호스트
		
//		루프백, loopback ==> 자신으로 회귀하는
//		 루프백 호스트네임 : localhost
//		 루프백 IP 주소 : 127.0.0.1
		
		
		try {
//			로컬 호스트의 객체 얻기
			ip = InetAddress.getLocalHost();
			
			System.out.println(ip);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}
}
