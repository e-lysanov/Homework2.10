package ru.lysanov.homework20;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String hello() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    @Override
    public String summ(Integer num1, Integer num2) {
        int summResult = num1 + num2;
        return num1 + " + " + num2 + " = " + summResult;
    }

    @Override
    public String subtraction(Integer num1, Integer num2) {
        int subtractionResult = num1 - num2;
        return num1 + " - " + num2 + " = " + subtractionResult;
    }

    @Override
    public String multiplication(Integer num1, Integer num2) {
        int multiplicationResult = num1 * num2;
        return num1 + " * " + num2 + " = " + multiplicationResult;
    }

    @Override
    public String divide(Integer num1, Integer num2) {
        int divideResult = num1 / num2;
        return num1 + " / " + num2 + " = " + divideResult;
    }
}
