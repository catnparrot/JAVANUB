//초기화 되지 않은 변수를 연산식에 사용할 경우 컴파일 에러가 발생한다.

package ch02.sec01;

public class VariableInitializationExample {
	public static void main(String[] args) {
		int value=10;
		int result = value +10;		
		System.out.println(result);	

		/*
		//변수 value 선언
		int value; //-> 변수를 초기화 해줘야함 -> int value=Number;
		
		//연산 결과를 변수 result의 초기값으로 대입
		int result = value +10;
		
		//변수 result 값을 읽고 콘솔에 출력
		System.out.println(result);
		*/
	}
}
