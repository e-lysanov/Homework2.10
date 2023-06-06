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

    @Test
    public void shouldSumm() {
        int expected = 6 + 3;
        int actual = num1 + num2;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSubstract() {
        int expected = 6 - 3;
        int actual = num1 - num2;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldMultiply() {
        int expected = 6 * 3;
        int actual = num1 * num2;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDivide() {
        int expected = 6 / 3;
        int actual = num1 / num2;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenSecondValueIsZero() {
        assertThrows(SecondValueIsZeroException.class, () -> out.divide(num1,0));
    }
}
