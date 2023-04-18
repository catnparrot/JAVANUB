package p0418.sec01;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String id, password;
		
		System.out.println("아이디와 패스워드를 입력해주세요. 비밀번호가 세 번 틀릴 시 프로그램이 자동으로 종료됩니다.");
		
		do {
			System.out.println("ID: ");
			id=scan.nextLine();
		}while( ! id.equals("ezen"));
		
		
		for(int i=0;i<3;i++) {
			System.out.println("Password: ");
			password = scan.nextLine();
			if(password.equals("12345")) {
				break;
			}
			else if(i !=2)
				;
			else {
				System.out.println("Get Out!");
			}
		}
		System.out.println("OK");
		
	}

}
