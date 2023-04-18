package p0418.sec01;

import java.util.Scanner;

public class Test01_G_RE {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String id, password;
		int wrongCount = 0;
		
		//i=3이 될때까지 반복
		for (int i = 0; i < 3; i++) {
			id = scan.nextLine();
			password = scan.nextLine();
			
			if (id.equals("ezen") && password.equals("12345")) {
				break;
			}	
			wrongCount++;
		}
		
		if (wrongCount >= 3) {
			return;
		}			
	}
}
