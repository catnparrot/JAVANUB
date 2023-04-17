package ch03.sec01;

public class SingleOperatorExample {

	public static void main(String[] args) {
		int i = 5;
		int sum = ++i + i++;
		/*
		int i = 5;
		++i;
		int sum = ++i+i;
		*/
		/*
		int i = 5;
		i++;
		int sum = i++ +i
		*/
		
		System.out.println(i);
		System.out.println(sum);
		//출력값: 7, 12
		//증감/감소 연산 사용시 부호가 앞에 있으면
		//-전위연산자 -> 일반 연산자보다 먼저 계산
		//부호가 뒤에 있으면
		//-후위연산자 -> 일반 연산자보다 뒤에 계산
		
	}
}
