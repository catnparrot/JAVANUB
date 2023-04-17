package ch03.sec11;

import java.util.Scanner;

public class ConditionalOperationEx_G {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.print("백분위 점수를 입력하세요 (종료는 q): ");
	            String input = scanner.nextLine();

	            if (input.equals("q")) {				//입력값이 'q'이면 루프를 종료합니다.
	                System.out.println("프로그램을 종료합니다.");
	                break;
	            }

	            int score;
	            score = Integer.parseInt(input);
	            
	            /* 정수인지 아닌지 확인하는 절차
	            try {
	                score = Integer.parseInt(input);
	            } catch (NumberFormatException e) {
	                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
	                continue;
	            }
	            */
	           

	            // 등급을 계산합니다.
	            char grade;
	            if (score >= 90) {
	                grade = 'A';
	            } else if (score >= 80) {
	                grade = 'B';
	            } else if (score >= 70) {
	                grade = 'C';
	            } else {
	                grade = 'F';
	            }

	            System.out.println("입력한 점수 " + score + "에 대한 등급은 " + grade + "입니다.");
	        }
	}
}
