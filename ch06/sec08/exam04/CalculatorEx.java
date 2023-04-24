package ch06.sec08.exam04;

public class CalculatorEx {
	public static void main(String[] args) {
		Calculator myC = new Calculator();
		
		double r1 = myC.areaRectangle(10);
		
		double r2 = myC.areaRectangle(10, 20);
		
		System.out.println(r1);
		System.out.println(r2);
	}

}
