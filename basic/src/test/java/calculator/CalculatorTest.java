package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();


    @Test
    void plusTestπ() {
        int resurt = calculator.plus(1, 2);
        minusTest();
        assertEquals(3, resurt);
    }

    @Test
    void minusTest() {
        calculator.minus(10, 3);
        multiplicationTest();
    }

    @Test
    void multiplicationTest() {
        calculator.multiplication(12, 5);
        divisionTest();
    }

    @Test
    void divisionTest() {
        calculator.division(60, 6);
    }
}