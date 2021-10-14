package calculator;

import java.util.Scanner;

public class Calculator {

    public void calculate(Scanner scanner, int a, int b) {
        System.out.println("더하겠습니까? 빼겠습니까? 더하면 +, 빼면 -, 곱하면 *, 나누면 % 입력하세요");
        String plus = scanner.nextLine();

        if (plus.equals("+")) {
            plus(a, b);
        } else if (plus.equals("-")) {
            minus(a, b);
        } else if (plus.equals("*")) {
            multiplication(a, b);
        } else if (plus.equals("%")) {
            division(a, b);
        }

    }

    public int plus(int a, int b) {
        int sum = a + b;
        System.out.println("입력하신 숫자의 합은 " + sum + " 입니다.");
        return sum;
    }

    public void minus(int a, int b) {
        int sum = a - b;
        System.out.println("입력하신 숫자의 합은 " + sum + " 입니다.");
    }

    public void multiplication(int a, int b) {
        int sum = a * b;
        System.out.println("입력하신 숫자의 합은 " + sum + " 입니다.");
    }

    public void division(int a, int b) {
        int sum = a / b;
        System.out.println("입력하신 숫자의 합은 " + sum + " 입니다.");
    }
}