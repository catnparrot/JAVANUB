package ch04.sec05;

import java.util.Scanner;

public class KeyControlEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int s = 0;
		
		while(run) {
			System.out.println("------------------------");
			System.out.println("1. 증속 | 2. 감속 | 3. 중지");
			System.out.println("------------------------");
			System.out.print("선택");
			
			String strN = sc.nextLine();
			
			if(strN.equals("1")) {
				s++;
				System.out.println("현재 속도 = " + s);
			} else if(strN.equals("2")) {
				s--;
				System.out.println("현재 속도 = " +  s);
			} else if(strN.equals("3")) {
				run=false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
