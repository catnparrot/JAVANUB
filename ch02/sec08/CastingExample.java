package ch02.sec08;

public class CastingExample {

	public static void main(String[] args) {
		int v1 = 10;
		byte v2 = (byte) v1;
		System.out.println(v2);		//강제 타입 변환 후에 10이 그대로 유지
		
		long v3 = 300;
		int v4 = (int) v3;
		System.out.println(v4);		//강제 타입 변환 후에 300이 그대로 유지
		
		int v5 =65;
		char v6 = (char) v5;
		System.out.println(v6);		//'A'가 출력
		
		double v7 = 3.14;
		int v8 = (int) v7;
		System.out.println(v8);		//3이 출력
	}

}
