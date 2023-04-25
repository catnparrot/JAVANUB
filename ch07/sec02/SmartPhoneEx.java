package ch07.sec02;

public class SmartPhoneEx {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("갤럭시", "은색")
				;
		
		System.out.println("모델: " + myPhone.model);
		System.out.println("색상: " + myPhone.color);
		
		System.out.println("와이파이 상태: " + myPhone.wifi);
		
		myPhone.bell();
		myPhone.sendVoice("여보세요");
		myPhone.receiveVoice("예 홍길동입니다");
		myPhone.sendVoice("네 안냐세요");
		myPhone.hangup();
		
		myPhone.setWifi(true);
		myPhone.internet();
	}

}
