package ru.lysanov.homework20;

import org.springframework.stereotype.Service;

@Service
public interface CalculatorService {
    String hello();

    String summ(Integer num1, Integer num2);

    String subtraction(Integer num1, Integer num2);

    String multiplication(Integer num1, Integer num2);

    String divide(Integer num1, Integer num2);
}
