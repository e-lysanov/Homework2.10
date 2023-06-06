package ru.lysanov.homework20;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.lysanov.homework20.exceptions.SecondValueIsZeroException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    private int num1;
    private int num2;
    @BeforeEach
    public void setUp() {
        num1 = 6;
        num2 = 3;
    }

// закомментировал некоторые блоки кода, тк я не могу проверять код ДУБЛИРОВАНИЕМ этого же кода
// и ДАЖЕ если я делал бы к каждому тесту по два набора параметров, получилось бы, что я все равно тестирую код самим собой, тк формулы для тестирования те же
// ГРУБО ГОВОРЯ, есла в коде выполнится неверная формула, а потом в тесте выполнится снова та же неверная формула, тест скажет, что он пройден
// поэтому я сделал тесты через сравнение с итоговыми строками, написанными вручную, тк результат лежит на поверхности в случае с используемыми в тесте параметрами (6 и 3)
// P.S. сложно придумать тест к элементарной задаче как, например, протестировать сидение(действие) на стуле
    @Test
    public void shouldSumm() {
//        int summResult = num1 + num2;
//        String expected = num1 + " + " + num2 + " = " + summResult;

        String expected = "6 + 3 = 9";
        String actual = out.summ(num1, num2);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSubtract() {
//        int subtractionResult = num1 - num2;
//        String expected = num1 + " - " + num2 + " = " + subtractionResult;

        String expected = "6 - 3 = 3";
        String actual = out.subtraction(num1, num2);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldMultiply() {
//        int multiplicationResult = num1 * num2;
//        String expected = num1 + " * " + num2 + " = " + multiplicationResult;

        String expected = "6 * 3 = 18";
        String actual = out.multiplication(num1, num2);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDivide() {
//        int divideResult = num1 / num2;
//        String expected = num1 + " / " + num2 + " = " + divideResult;

        String expected = "6 / 3 = 2";
        String actual = out.divide(num1, num2);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenSecondValueIsZero() {
        assertThrows(SecondValueIsZeroException.class, () -> out.divide(num1,0));
    }
}
