package ru.lysanov.homework20;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.lysanov.homework20.exceptions.SecondValueIsZeroException;
import ru.lysanov.homework20.exceptions.SomeValueIsNullException;

@RestController
public class Controller {

    private final CalculatorService calculatorService;

    public Controller(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String hello() {
        return calculatorService.hello();
    }

    @GetMapping (path = "/plus")
    public String summ(
            @RequestParam(name = "num1", required = false) Integer num1,
            @RequestParam(name = "num2", required = false) Integer num2
    ) {
        try {
            return calculatorService.summ(num1, num2);
        } catch (SomeValueIsNullException exception) {
            exception.printStackTrace();
            return "Отсуствуют входные значения!";
        }
    }

    @GetMapping (path = "/minus")
    public String subtraction(
            @RequestParam(name = "num1", required = false) Integer num1,
            @RequestParam(name = "num2", required = false) Integer num2
    ) {
        try {
            return calculatorService.subtraction(num1, num2);
        } catch (SomeValueIsNullException exception) {
            exception.printStackTrace();
            return "Отсуствуют входные значения!";
        }
    }

    @GetMapping (path = "/multiply")
    public String multiplication(
            @RequestParam(name = "num1", required = false) Integer num1,
            @RequestParam(name = "num2", required = false) Integer num2
    ) {
        try {
            return calculatorService.multiplication(num1, num2);
        } catch (SomeValueIsNullException exception) {
            exception.printStackTrace();
            return "Отсуствуют входные значения!";
        }
    }

    @GetMapping (path = "/divide")
    public String divide(
            @RequestParam(name = "num1", required = false) Integer num1,
            @RequestParam(name = "num2", required = false) Integer num2
    ) {
        try {
            return calculatorService.divide(num1, num2);
        } catch (SomeValueIsNullException exception) {
            exception.printStackTrace();
            return "Отсуствуют входные значения!";
        } catch (SecondValueIsZeroException exception) {
            exception.printStackTrace();
            return "На ноль делить нельзя!";
        }
    }
}
