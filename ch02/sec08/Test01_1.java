package ch02.sec08;

public class Test01_1 {
	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		
		double c =0;
		
		c = (float)a/b;
		
		System.out.println(c);
		System.out.printf("%.4f", c);
		System.out.printf("%10.4f", c);
		//print formant, C언어에서 왔다.
		//printf(%N1.N2f, 변수)에서 N1은 변수 앞 공백을, N2는 변수의 뒷자리수를 제거
	}

}