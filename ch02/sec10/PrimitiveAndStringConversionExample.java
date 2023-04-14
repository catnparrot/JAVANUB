//문자열을 기본 타입으로 변환(p.64)하는 경우와 다르게
//기본 타입의 값을 문자열로 변경하는 경우

package ch02.sec10;

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {
					//String[] args롤 통해 OS로부터 인자(argument)들을 받음
					//인자에는 함수 인자, 메소드 인자가 포함되어있다
		int v1 = Integer.parseInt("10");
		double v2 = Double.parseDouble("3.14");
		boolean v3 = Boolean.parseBoolean("true");

		/*
		int v1 = 10;
		double v2 = 3.14;
		boolean v3 = true;
		*/
		
		System.out.println("Value1: " + v1);
		System.out.println("Value2: " + v2);
		System.out.println("Value3: " + v3);
		
		String s1 = String.valueOf(10);
		String s2 = String.valueOf(3.14);
		String s3 = String.valueOf(true);
		
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
		System.out.println("s3: " + s3);
	}
}
