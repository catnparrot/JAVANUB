package ch06.sec08.exam03;

public class CarEx {
	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.setGas(5);
		
		System.out.println(myCar.leftGas());
		
		
		if(myCar.leftGas()) {
			System.out.println("!");	//출발
		myCar.run();
		}
		System.out.println("@");		//가스주입
	}

}
