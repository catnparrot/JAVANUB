package ch06.sec06.exam02;

public class CarEx {
	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.color);
		System.out.println(myCar.maxSpeed);
		System.out.println(myCar.speed);
		
		//Car 객체의 필드값 변경
		myCar.speed =60;
		System.out.println(myCar.speed);
	}

}
