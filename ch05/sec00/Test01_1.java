package ch05.sec00;

public class Test01_1 {
	public static void main(String[] args) {
	
		int i =3;
		int j =5;
		char t = '+';
		String judge = "";
		
		int result = calculate(i,j,t);
		
		if (t == '+')
				judge = "덧셈";
		else if (t=='-')
				judge = "뺄셈";
		else if (t=='*')
				judge = "곱셈";
		else
				judge = "나눗셈";
		
		System.out.println("두 수의 "+judge+"의 결과: "+result);
		
	}

	static int calculate(int a, int b, char c) {
		
		switch (c) {
			
		case '+' :
			return a+b;
		case '-' :
			return a+b;
		case '*' :
			return a+b;
		case '/' :
			return a+b;
		default:
			return 0;
		}
	}
	
}
