//기본적으로 컴파일러는 정수 리터럴을 int 타입 값으로 간주
//int 타입의 허용 범위를 초과하는 리터럴은 뒤에 'l'/'L'을 붙여 long타입 값임을 확정해야함

package ch02.sec02;

public class LongExample {

	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
		//long var3 = 1000000000000; <-정수의 범위를 넘어섰다고 판명함
		long var4 = 1000000000000L;
		
		System.out.println(var1);
		System.out.print(var2 + "\n");
		System.out.println(var4);
	}

}

//까놓고 말해 이해 안된다
//아니 이미 타입 선언했는데 변수값에 또 L을 입력해야한다고?
//아무리 int가 디폴트라는 개념이라지만 이러면 선언 왜함?
//라고 코린이가 씨부려봅니다. 응애.