package ch07.sec10.exam01;

public class PhoneEx {
	public static void main(String[] args) {
		
		//Phone phone = new Phone();
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}
