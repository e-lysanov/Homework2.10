package ru.lysanov.homework20;

import org.springframework.stereotype.Service;
import ru.lysanov.homework20.exceptions.SecondValueIsZeroException;
import ru.lysanov.homework20.exceptions.SomeValueIsNullException;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String hello() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    @Override
    public String summ(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new SomeValueIsNullException("Отсуствуют входные значения!");
        }
        int summResult = num1 + num2;
        return num1 + " + " + num2 + " = " + summResult;
    }

    @Override
    public String subtraction(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new SomeValueIsNullException("Отсуствуют входные значения!");
        }
        int subtractionResult = num1 - num2;
        return num1 + " - " + num2 + " = " + subtractionResult;
    }

    @Override
    public String multiplication(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new SomeValueIsNullException("Отсуствуют входные значения!");
        }
        int multiplicationResult = num1 * num2;
        return num1 + " * " + num2 + " = " + multiplicationResult;
    }

    @Override
    public String divide(Integer num1, Integer num2) {
        if (num2 == 0) {
            throw new SecondValueIsZeroException("На ноль делить нельзя!");
        } else if (num1 == null || num2 == null) {
            throw new SomeValueIsNullException("Отсуствуют входные значения!");
        }
        int divideResult = num1 / num2;
        return num1 + " / " + num2 + " = " + divideResult;
    }
}
