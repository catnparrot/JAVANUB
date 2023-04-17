package ch03.sec11;

import java.util.Scanner;

public class ConditionalOperationEx_G_switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("백분위 점수를 입력하세요 (종료는 q): ");
            String input = scanner.nextLine();

            // 입력값이 'q'이면 루프를 종료합니다.
            if (input.equals("q")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // 입력값이 정수인지 확인합니다.
            int score;
            try {
                score = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                continue;
            }

            // 등급을 계산합니다.
            char grade;
            switch (score / 10) {
                case 10:
                case 9:
                    grade = 'A';
                    break;
                case 8:
                    grade = 'B';
                    break;
                case 7:
                    grade = 'C';
                    break;
                default:
                    grade = 'F';
                    break;
            }

            System.out.println("입력한 점수 " + score + "에 대한 등급은 " + grade + "입니다.");
        }

        scanner.close();
    }
}
