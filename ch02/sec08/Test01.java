package ch02.sec08;

public class Test01 {

	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		
		float c =0;
		
		c = (float)a/b;
		//c = a/b -> float의 소숫점 출력값 짤림
		
		System.out.println(c);
	}

}