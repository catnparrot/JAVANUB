package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x 값 입력: ");
		String strX = sc.nextLine();
		int x = Integer.parseInt(strX);
		
		System.out.print("y값 입력: ");
		String strY=sc.nextLine();
		int y = Integer.parseInt(strY);
		
		int r = x+y;
		System.out.println("x + y: " + r);
		System.out.println();

		while(true) {								//for(;;)로 대체 가능
			System.out.print("입력 문자열: ");
			String data = sc.nextLine();			//왜 꼭 String인지 확실히 이해가진 않는다. date.equals 때문인가?
			if(data.equals("q")) {		//q 입력시 while을 빠져나감
				break;
			}
			System.out.println("출력 문자열: " + data);
			System.out.println();
		}
		System.out.println("종료");
	}

}
