package p0418.sec01;

import java.util.Scanner;

public class Test01_G {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String id, password;
		int wrongCount = 0;
		
		System.out.println("아이디와 패스워드를 입력해주세요. 비밀번호 또는 아이디가 세 번 틀릴 시 프로그램이 자동으로 종료됩니다.");
		
		for (int i = 0; i < 3; i++) {
			System.out.println("ID: ");
			id = scan.nextLine();
			
			System.out.println("Password: ");
			password = scan.nextLine();
			
			if (id.equals("ezen") && password.equals("12345")) {
				break;
			}
			
			wrongCount++;
		}
		
		if (wrongCount >= 3) {
			System.out.println("Get out!");
			return;
		}
		
		System.out.println("OK");
		
	}

}
