package ch04.sec02;

import java.util.Scanner;

public class IfElseEX {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("점수를 입력(종료: Q): ");

		char hak = 'F';
		int n = 0, grade=0;
		String score = "";
		
		while(true) {
			System.out.print("");
			score=sc.nextLine();
		
			if (score.equals("Q"))			//String이니까 당연히 문자열"" 할당
				break;
		
			n = Integer.parseInt(score);
		
			grade = n/10;
		
			switch (grade) {
		
				case 9:
					hak = 'A';
					break;
					
				case 8:
					hak = 'B';
					break;
					
				case 7:
					hak = 'C';
					break;
			
				case 6:
					hak = 'D';
					break;
				
				default:
					hak = 'F';
				
		
			}
			System.out.println("당신의 점수는" + score + "이고 학점은 " + hak +"입니다.");
			
		
		}
		System.out.println("종료");
	}
}
