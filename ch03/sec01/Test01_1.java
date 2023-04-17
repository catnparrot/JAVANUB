package ch03.sec01;

public class Test01_1 {
	public static void main(String[] args) {

		for(int i=0; i<=100; i+=1)
			if(i%5==0 && i!=0)			//0과 5의 배수가 아닌 수 제외
			System.out.println(i);
	}
}
