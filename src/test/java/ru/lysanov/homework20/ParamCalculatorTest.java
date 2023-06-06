package ru.lysanov.homework20;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParamCalculatorTest {

    private final CalculatorServiceImpl out = new CalculatorServiceImpl();


    public static Stream<Arguments> provideParamsForTestOfSumm() {
        return Stream.of(
                Arguments.of(6, 3, "6 + 3 = 9"),
                Arguments.of(5, 5, "5 + 5 = 10")
        );
    }

    public static Stream<Arguments> provideParamsForTestOfSubtraction() {
        return Stream.of(
                Arguments.of(10, 2, "10 - 2 = 8"),
                Arguments.of(8, 7, "8 - 7 = 1")
        );
    }

    public static Stream<Arguments> provideParamsForTestOfMultiplication() {
        return Stream.of(
                Arguments.of(9, 3, "9 * 3 = 27"),
                Arguments.of(10, 4, "10 * 4 = 40")
        );
    }

    public static Stream<Arguments> provideParamsForTestOfDivide() {
        return Stream.of(
                Arguments.of(90, 10, "90 / 10 = 9"),
                Arguments.of(12, 3, "12 / 3 = 4")
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTestOfSumm")
    public void shouldSummRight(int num1, int num2, String expectedValue) {
        String result = out.summ(num1, num2);
        assertEquals(expectedValue, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTestOfSubtraction")
    public void shouldSubtractRight(int num1, int num2, String expectedValue) {
        String result = out.subtraction(num1, num2);
        assertEquals(expectedValue, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTestOfMultiplication")
    public void shouldMultiplyRight(int num1, int num2, String expectedValue) {
        String result = out.multiplication(num1, num2);
        assertEquals(expectedValue, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTestOfDivide")
    public void shouldDivideRight(int num1, int num2, String expectedValue) {
        String result = out.divide(num1, num2);
        assertEquals(expectedValue, result);
    }
}
