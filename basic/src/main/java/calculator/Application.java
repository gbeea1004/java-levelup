package calculator;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세요.");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("두 번째 숫자를 입력하세요.");
        int b = Integer.parseInt(scanner.nextLine());

        Calculator calculator = new Calculator();
        calculator.calculate(scanner, a, b);
    }
}
