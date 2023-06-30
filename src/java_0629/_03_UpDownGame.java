package java_0629;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class _03_UpDownGame {
	
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);
        int guess = 0;
        int attempts = 0;

        System.out.println("1부터 100 사이의 숫자를 쓰세요");

        do {
            System.out.print("숫자를 입력하세요: ");

            try {
                guess = scanner.nextInt();
                attempts++;

                if (guess < secretNumber) {
                    System.out.println("Up");
                } else if (guess > secretNumber) {
                    System.out.println("Down");
                } else {
                    System.out.println("정답");
                    System.out.println("시도한 횟수: " + attempts);
                }
            } catch (InputMismatchException e) {
                System.out.println("올바른 숫자를 입력해주세요.");
                scanner.nextLine(); // 입력 버퍼 비우기
            }
        } while (guess != secretNumber);

        scanner.close();
    }
}